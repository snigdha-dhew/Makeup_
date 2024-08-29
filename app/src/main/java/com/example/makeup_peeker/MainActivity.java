package com.example.makeup_peeker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private MakeupExpert expert = new MakeupExpert();

    public void onClickB1(View view){
        TextView brands = (TextView) findViewById(R.id.T1_brands);
        Spinner products = (Spinner) findViewById(R.id.S1_products);

        List<String> brandsList = expert.getbrands(String.valueOf(products.getSelectedItem()));
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }


        brands.setText(brandsFormatted);

    }
}