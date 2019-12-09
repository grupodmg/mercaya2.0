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

public class CondimentosActivity extends AppCompatActivity {


    List<Productos> productos = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductoAdapter pAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condimentos);

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
                Intent i = new Intent(getBaseContext(),CondimentosActivity.class);
                startActivity(i);
                Toast.makeText(CondimentosActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        DeteallePapas();
        pAdapter.notifyDataSetChanged();

    }
    private void DeteallePapas() {
        Productos product = new Productos("Oregano",R.drawable.oregano,"$2.000 Bolsa");
        productos.add(product);
        product = new Productos("Pimienta en Polvo",R.drawable.pimienta,"$5.000 Frasco");
        productos.add(product);
        product = new Productos("Ajo",R.drawable.ajo,"$2.000 Bolsa");
        productos.add(product);
        product = new Productos("Coco Rallado",R.drawable.comorallado,"$1.500 Bolsa");
        productos.add(product);
        product = new Productos("Comino",R.drawable.comino,"$2.000 Bolsa");
        productos.add(product);

    }
}
