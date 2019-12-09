package com.example.mercaya;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PapasActivity extends AppCompatActivity {

    private boolean isCarActive;


    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papas);

       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);










        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pAdapter = new ProductoAdapter(productos,this,1);

        // Create grids with 2 items in a row
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
            Productos product = new Productos("Papa Criolla",R.drawable.criolla,"900 lb");
            productos.add(product);
            product = new Productos("Papa Pastusa",R.drawable.pastusa,"1500 lb");
            productos.add(product);
            product = new Productos("Papa Sabanera",R.drawable.papasabanera,"1500 lb");
            productos.add(product);
    }
}
