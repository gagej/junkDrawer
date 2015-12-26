package com.gage.beeradvisor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        Spinner color = (Spinner)findViewById(R.id.color) ;
        String selection = String.valueOf(color.getSelectedItem()) ;

        StringBuilder brandsFormatted = new StringBuilder() ;
        List<String> brandsList = expert.getBrands(selection) ;

        for (String brand : brandsList ) {
            brandsFormatted.append(brand).append("\n").append("\n") ;
        }

        TextView brands = (TextView)findViewById(R.id.brands) ;
        brands.setText(brandsFormatted);
    }
}
