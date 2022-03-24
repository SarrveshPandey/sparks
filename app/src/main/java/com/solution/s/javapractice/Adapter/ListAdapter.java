package com.solution.s.javapractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.solution.s.javapractice.POJO.Pojo_res;
import com.solution.s.javapractice.R;

import java.util.ArrayList;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {


    ArrayList<Pojo_res> list=new ArrayList<>();
    Context context;

    public ListAdapter(Context context, ArrayList<Pojo_res> list) {
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,
                parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//        holder.txt_name.setText(list.get(position).getName());
     //pecasso   holder.img_set.setText(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_name;
        ImageView img_set;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_set = itemView.findViewById(R.id.img_set);
            txt_name = itemView.findViewById(R.id.txt_name);
        }



    }
}
