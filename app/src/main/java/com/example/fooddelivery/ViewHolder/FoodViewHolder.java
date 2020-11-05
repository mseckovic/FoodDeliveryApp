package com.example.fooddelivery.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.Interface.ItemClickListener;
import com.example.fooddelivery.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    //region Variables

    public TextView food_name;
    public ImageView food_image;

    private ItemClickListener itemClickListener;

    //endregion

    //region Constructors
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        food_name = (TextView) itemView.findViewById(R.id.food_name);
        food_image = (ImageView) itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }
    //endregion

    //region Setters

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    //endregion

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(),false);
    }
}
