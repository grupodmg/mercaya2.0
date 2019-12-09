package com.example.mercaya;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarnesActivity extends AppCompatActivity {


    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pAdapter = new ProductoAdapter(productos,this, 1);

        // Create grids with 2 items in a row
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        pAdapter.setMyListerner(new ProductoAdapter.OnClickInterface() {

            public void getItemPosition(int position) {
                Intent i = new Intent(getBaseContext(),CarnesActivity.class);
                startActivity(i);
                Toast.makeText(CarnesActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
        Productos product = new Productos("Lomo de Cerdo",R.drawable.lomocerdo,"$7.000 lb");
        productos.add(product);
        product = new Productos("Lomo de Res",R.drawable.lomores,"$9.000 lb");
        productos.add(product);
        product = new Productos("Pechugas de Pollo",R.drawable.pechuga,"$9.000 lb");
        productos.add(product);
        product = new Productos("Filete de Pescado",R.drawable.filetepescado,"$9.000 lb");
        productos.add(product);
        product = new Productos("Muslos de Pollo",R.drawable.muslopollo,"$4.000");
        productos.add(product);
        product = new Productos("Chorizos",R.drawable.chorizos,"$3.000");
        productos.add(product);
    }
}