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

public class ScrollingActivity<btnsuma> extends AppCompatActivity {

       List<Productos> productos = new ArrayList<>();
        private RecyclerView recyclerView;
        private ProductoAdapter Adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_scrolling);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            Adapter = new ProductoAdapter(productos, this,1);






    RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(Adapter);



            DetealleProductos();

        Adapter.setMyListerner( new ProductoAdapter.OnClickInterface() {
        @Override
        public void getItemPosition(int positio) {
            switch (positio){
                case 0:
                    Intent intent0= new Intent(ScrollingActivity.this,PapasActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Categoria Papas", Toast.LENGTH_SHORT ).show();
                    startActivity( intent0 );
                    break;
                case 1:
                    Intent intent1= new Intent(ScrollingActivity.this,GranosActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Grano y Cerales", Toast.LENGTH_SHORT ).show();
                    startActivity( intent1 );
                    break;
                case 2:
                      Intent intent2= new Intent(ScrollingActivity.this,FrutasActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Frutas", Toast.LENGTH_SHORT ).show();
                    startActivity( intent2 );
                    break;
                case 3:
                    Intent intent3= new Intent(ScrollingActivity.this,VerdurasActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Verduras", Toast.LENGTH_SHORT ).show();
                    startActivity( intent3 );
                    break;
                case 4:
                    Intent intent4= new Intent(ScrollingActivity.this,CarnesActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Carnes", Toast.LENGTH_SHORT ).show();
                    startActivity( intent4 );
                    break;
                case 5:
                    Intent intent5= new Intent(ScrollingActivity.this,LechesActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Leches y Lacteos", Toast.LENGTH_SHORT ).show();
                    startActivity( intent5 );
                    break;
                case 6:
                    Intent intent6= new Intent(ScrollingActivity.this,HarinasActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Harinas", Toast.LENGTH_SHORT ).show();
                    startActivity( intent6 );
                    break;
                case 7:
                    Intent intent7= new Intent(ScrollingActivity.this,CondimentosActivity.class );
                    Toast.makeText( ScrollingActivity.this, "Condimentos", Toast.LENGTH_SHORT ).show();
                    startActivity( intent7 );
                    break;

            }
        }
    });


        }






    //
        private void DetealleProductos() {
            Productos product = new Productos("Papas",R.drawable.papas," ");
            productos.add(product);
            product = new Productos("Granos y Cereales",R.drawable.granos," ");
            productos.add(product);
            product = new Productos("Frutas",R.drawable.frutas_variadas," ");
            productos.add(product);
            product = new Productos("Verduras",R.drawable.verduras," ");
            productos.add(product);
            product = new Productos("Carnes",R.drawable.carne," ");
            productos.add(product);
            product = new Productos("Leches y Lacteos",R.drawable.productos_lacteos," ");
            productos.add(product);
            product = new Productos("Harinas",R.drawable.harinas," ");
            productos.add(product);
            product = new Productos("Condimentos",R.drawable.condimentos," ");
            productos.add(product);
        }


//        public void goToClass(){
//            if(true){
//
//                imageViewapp_bar_image.setVisibility(View.VISIBLE);
//            }
//
//        }
    }

