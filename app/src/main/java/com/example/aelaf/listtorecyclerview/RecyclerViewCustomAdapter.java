package com.example.aelaf.listtorecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by aelaf on 9/15/17.
 */

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<RecyclerViewCustomAdapter.ViewHolder> {

private Context mContext;
    private List<Movie> movieList;

    public RecyclerViewCustomAdapter(Context context, List<Movie> movies)
    {
        mContext = context;
        movieList = movies;
    }


    @Override
    public RecyclerViewCustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view =   LayoutInflater.from(mContext).inflate(R.layout.recyclerview_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(mContext,view,movieList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewCustomAdapter.ViewHolder holder, int position) {

      Movie movie =   movieList.get(position);
        holder.textviewTitle.setText(movie.getTitle());
        holder.textViewDetail.setText(movie.getDetail());


    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public TextView textviewTitle;
        public TextView textViewDetail;
        public Context context;
        public List<Movie> movieList;
        public ViewHolder(Context context,View itemView,List<Movie> movieList) {
            super(itemView);
            this.context = context;
            this.movieList = movieList;
          textviewTitle = (TextView)  itemView.findViewById(R.id.txtTitleRecy);
            textViewDetail = (TextView)itemView.findViewById(R.id.txtDetailRecy);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
           int position =  getAdapterPosition();
            if (position!=RecyclerView.NO_POSITION) {

                Toast.makeText(context,movieList.get(position).getDetail(),Toast.LENGTH_SHORT).show();
            }

        }
    }

}
