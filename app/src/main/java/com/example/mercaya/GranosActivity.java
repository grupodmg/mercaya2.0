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

public class GranosActivity extends AppCompatActivity {


    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pAdapter = new ProductoAdapter(productos,this,3);

        // Create grids with 2 items in a row
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        pAdapter.setMyListerner(new ProductoAdapter.OnClickInterface() {

            public void getItemPosition(int position) {
                Intent i = new Intent(getBaseContext(),GranosActivity.class);
                startActivity(i);
                Toast.makeText(GranosActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
        Productos product = new Productos("Lentejas",R.drawable.lenteja,"Ver mas");
        productos.add(product);
        product = new Productos("Frijol",R.drawable.frijol,"Ver mas");
        productos.add(product);
        product = new Productos("Arveja",R.drawable.arveja,"Ver mas");
        productos.add(product);
    }
}
