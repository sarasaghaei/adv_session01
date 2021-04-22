package ir.sarasagahei.adv_session01_1.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import ir.sarasagahei.adv_session01_1.R;
import ir.sarasagahei.adv_session01_1.adapter.ColorAdapter;
import ir.sarasagahei.adv_session01_1.entity.Color;

public class SofaFragment extends Fragment {

    public interface Calback_sofa
    {
        void sendcolor(String color, String name);
    }

    Calback_sofa listener;
    ColorAdapter adapter;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof Calback_sofa)
        {
            listener = (Calback_sofa) context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sofa,null);
        //---- make view-----
        GridView gridView = (GridView) view.findViewById(R.id.gridview);
        //---- create date -------
        //String[] data_color = {"green", "philly","blue","orange","brown"};
        ArrayList<Color> data = getdata();
        //---- create adapter -----
        adapter = new ColorAdapter(getActivity(),data);
        //---- bind adapter -----
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Color color = (Color) parent.getItemAtPosition(position);

                if(listener != null) {
                    switch (position) {
                        case 0: {
                            listener.sendcolor("green", "sofa");
                            break;
                        }
                        case 1:{
                            listener.sendcolor("blue", "sofa");
                            break;
                        }
                        case 2:{
                            listener.sendcolor("brown", "sofa");
                            break;
                        }
                        case 3:{
                            listener.sendcolor("philly", "sofa");
                            break;
                        }
                        case 4:{
                            listener.sendcolor("orange", "sofa");
                            break;
                        }
                    }
                }
            }
        });
        return view;
    }

    private ArrayList<Color> getdata() {
        ArrayList<Color> result = new ArrayList<>();
        result.add(new Color(R.drawable.green));
        result.add(new Color(R.drawable.blue));
        result.add(new Color(R.drawable.brown));
        result.add(new Color(R.drawable.philly));
        result.add(new Color(R.drawable.orange));

        return result;
    }
}
