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

public class FrutasActivity extends AppCompatActivity {

    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pAdapter = new ProductoAdapter(productos,this,2);

        // Create grids with 2 items in a row
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        pAdapter.setMyListerner(new ProductoAdapter.OnClickInterface() {

            public void getItemPosition(int position) {
                Intent i = new Intent(getBaseContext(),FrutasActivity.class);
                startActivity(i);
                Toast.makeText(FrutasActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
        Productos product = new Productos("Mango",R.drawable.mango,"Ver mas");
        productos.add(product);
        product = new Productos("Uvas",R.drawable.uvas,"Ver mas");
        productos.add(product);
        product = new Productos("Manzana",R.drawable.manzana,"Ver mas");
        productos.add(product);
        product = new Productos("Tomate de Arbol",R.drawable.tomatearbol,"Ver mas");
        productos.add(product);
        product = new Productos("Maracuya",R.drawable.maracuya,"Ver mas");
        productos.add(product);
        product = new Productos("Bananos",R.drawable.banano,"Ver mas");
        productos.add(product);
        product = new Productos("lulo",R.drawable.lulo,"Ver mas");
        productos.add(product);
    }
}
