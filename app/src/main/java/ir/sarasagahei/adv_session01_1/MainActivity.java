package ir.sarasagahei.adv_session01_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import ir.sarasagahei.adv_session01_1.fragment.CarpetFragment;
import ir.sarasagahei.adv_session01_1.fragment.ConsolFragment;
import ir.sarasagahei.adv_session01_1.fragment.LampshadeFragment;
import ir.sarasagahei.adv_session01_1.fragment.SofaFragment;
import ir.sarasagahei.adv_session01_1.fragment.ViewFragment;

public class MainActivity extends AppCompatActivity implements
        ConsolFragment.Calback_consol, CarpetFragment.Calback_carpet,
        LampshadeFragment.Calback_lampshade, SofaFragment.Calback_sofa
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendcolor(String color, String name) {

        FragmentManager manager = getSupportFragmentManager();
        ViewFragment fragment = (ViewFragment) manager.findFragmentById(R.id.fragment_detail);
        fragment.setcolor(color, name);

    }
}