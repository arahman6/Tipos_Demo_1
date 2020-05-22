package com.example.tiposdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Parenting","Categorie Book","Description book",R.drawable.parent));
        lstBook.add(new Book("Ecomony","Categorie Book","Description book",R.drawable.economy));
        lstBook.add(new Book("Relationship","Categorie Book","Description book",R.drawable.relationship));
        lstBook.add(new Book("Religion","Categorie Book","Description book",R.drawable.religion));
        lstBook.add(new Book("Socialization","Categorie Book","Description book",R.drawable.socialization));
        lstBook.add(new Book("Livelihood","Categorie Book","Description book",R.drawable.livelihood));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
