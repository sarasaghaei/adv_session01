package ir.sarasagahei.adv_session01_1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ir.sarasagahei.adv_session01_1.R;

public class ViewFragment extends Fragment {


    TextView tv_consol, tv_lampshade, tv_sofa, tv_carpet;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view,null);
        tv_consol = view.findViewById(R.id.tv_consol);
        tv_lampshade = view.findViewById(R.id.tv_lampshade);
        tv_sofa = view.findViewById(R.id.tv_sofa);
        tv_carpet = view.findViewById(R.id.tv_carpet);


        return view;
    }

    public void setcolor(String color,String name){
        switch (color)
        {
            case "green":{
                switch (name)
                {
                    case "consol":{
                        tv_consol.setBackground(getResources().getDrawable(R.drawable.green_cosol));
                        break;
                    }
                    case "lampshade":{
                        tv_lampshade.setBackground(getResources().getDrawable(R.drawable.green_lampshade));
                        break;
                    }
                    case "carpet":{
                        tv_carpet.setBackground(getResources().getDrawable(R.drawable.green_carpet));
                        break;
                    }
                    case "sofa":{
                        tv_sofa.setBackground(getResources().getDrawable(R.drawable.green_sofa));
                        break;
                    }
                }
                break;
            }
            case "blue":{
                switch (name)
                {
                    case "consol":{
                        tv_consol.setBackground(getResources().getDrawable(R.drawable.blue_cosol));
                        break;
                    }
                    case "lampshade":{
                        tv_lampshade.setBackground(getResources().getDrawable(R.drawable.blue_lampshade));
                        break;
                    }
                    case "carpet":{
                        tv_carpet.setBackground(getResources().getDrawable(R.drawable.blue_carpet));
                        break;
                    }
                    case "sofa":{
                        tv_sofa.setBackground(getResources().getDrawable(R.drawable.blue_sofa));
                        break;
                    }
                }
                break;
            }
            case "brown":{
                switch (name)
                {
                    case "consol":{
                        tv_consol.setBackground(getResources().getDrawable(R.drawable.brown_cosol));
                        break;
                    }
                    case "lampshade":{
                        tv_lampshade.setBackground(getResources().getDrawable(R.drawable.brown_lampshade));
                        break;
                    }
                    case "carpet":{
                        tv_carpet.setBackground(getResources().getDrawable(R.drawable.brown_carpet));
                        break;
                    }
                    case "sofa":{
                        tv_sofa.setBackground(getResources().getDrawable(R.drawable.brown_sofa));
                        break;
                    }
                }
                break;
            }
            case "philly":{
                switch (name)
                {
                    case "consol":{
                        tv_consol.setBackground(getResources().getDrawable(R.drawable.phily_cosol));
                        break;
                    }
                    case "lampshade":{
                        tv_lampshade.setBackground(getResources().getDrawable(R.drawable.phily_lampshade));
                        break;
                    }
                    case "carpet":{
                        tv_carpet.setBackground(getResources().getDrawable(R.drawable.philly_carpett));
                        break;
                    }
                    case "sofa":{
                        tv_sofa.setBackground(getResources().getDrawable(R.drawable.philly_sofa));
                        break;
                    }
                }
                break;
            }
            case "orange":{
                switch (name)
                {
                    case "consol":{
                        tv_consol.setBackground(getResources().getDrawable(R.drawable.orange_cosol));
                        break;
                    }
                    case "lampshade":{
                        tv_lampshade.setBackground(getResources().getDrawable(R.drawable.orange_lampshade));
                        break;
                    }
                    case "carpet":{
                        tv_carpet.setBackground(getResources().getDrawable(R.drawable.orange_carpet));
                        break;
                    }
                    case "sofa":{
                        tv_sofa.setBackground(getResources().getDrawable(R.drawable.orange_sofa));
                        break;
                    }
                }
                break;
            }
        }
    }


}
