package com.example.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mfruitList;

    public FruitAdapter(List<Fruit> mfruitList) {
        this.mfruitList = mfruitList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitIamge;
        TextView fruitName;
        View fruitView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fruitView = itemView;

            fruitIamge = itemView.findViewById(R.id.fruit_image);
            fruitName = itemView.findViewById(R.id.fruit_name);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item_vertical, viewGroup, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = viewHolder.getAdapterPosition();
                Fruit fruit = mfruitList.get(position);
                Toast.makeText(v.getContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.fruitIamge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = viewHolder.getAdapterPosition();
                Fruit fruit = mfruitList.get(position);
                Toast.makeText(v.getContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
            }
        });


        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Fruit fruit = mfruitList.get(i);
        viewHolder.fruitIamge.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
    }


    @Override
    public int getItemCount() {

        return mfruitList.size();
    }
}
