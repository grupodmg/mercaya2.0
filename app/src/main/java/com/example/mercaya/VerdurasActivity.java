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

public class VerdurasActivity extends AppCompatActivity {


    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verduras);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pAdapter = new ProductoAdapter(productos,this,1);

        // Create grids with 2 items in a row
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        pAdapter.setMyListerner(new ProductoAdapter.OnClickInterface() {

            public void getItemPosition(int position) {
                Intent i = new Intent(getBaseContext(),VerdurasActivity.class);
                startActivity(i);
                Toast.makeText(VerdurasActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
        Productos product = new Productos("Broccoli",R.drawable.broccoli,"200 lb");
        productos.add(product);
        product = new Productos("Espinaca",R.drawable.espinaca,"800 lb");
        productos.add(product);
        product = new Productos("Pimientos",R.drawable.pimientos,"2000 lb");
        productos.add(product);
        product = new Productos("Remolacha",R.drawable.remolacha,"1500 lb");
        productos.add(product);
        product = new Productos("Tomate",R.drawable.tomate,"2000 lb");
        productos.add(product);
        product = new Productos("Zanahoria",R.drawable.zanahoria,"1500 lb");
        productos.add(product);
    }
}
