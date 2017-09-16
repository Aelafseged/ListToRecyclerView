package com.example.aelaf.listtorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class RecyclerViewActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    private Toolbar toolbar;
    private List<Movie> movieList;
    private RecyclerViewCustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        movieList = new ArrayList<>();
        movieList.add(new Movie("Action","John Wick"));
        movieList.add(new Movie("Action","Terminator"));
        movieList.add(new Movie("comedy","Kung Fu Panda"));
        movieList.add(new Movie("Action","Transformers"));
        movieList.add(new Movie("Cartoon","Wreck it Ralph"));
        movieList.add(new Movie("cartoon","Croods"));
        movieList.add(new Movie("Action","My Life in Ruins"));
        movieList.add(new Movie("Action","Tron Legacy"));
        movieList.add(new Movie("comedy","The Cable Guy"));
        movieList.add(new Movie("Action","Thor"));
        movieList.add(new Movie("Cartoon","The Smurfs"));
        movieList.add(new Movie("Sci-Fi","Life"));
        customAdapter = new RecyclerViewCustomAdapter(this,movieList);
       RecyclerView.ItemDecoration itemDecoration =
               new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


    }
}
