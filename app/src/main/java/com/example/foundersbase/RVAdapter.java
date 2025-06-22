package com.example.foundersbase;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private List<FounderDetails>founderDetailsList;
    private Context context;

    public RVAdapter(Context context, List<FounderDetails>founderDetailsList)
    {
        this.context = context;
        this.founderDetailsList = founderDetailsList;
    }

    @NonNull
    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.founders_list_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.ViewHolder holder, int position) {

        holder.founder_heading.setText(founderDetailsList.get(position).getName());
        holder.founder_desc.setText(founderDetailsList.get(position).getDesc());
        holder.founder_img.setImageResource(founderDetailsList.get(position).getImgId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, FoundersBrief.class);
            intent.putExtra("founderData", founderDetailsList.get(position));
            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return founderDetailsList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView founder_img;
        public TextView founder_heading;
        public TextView founder_desc;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            founder_img = itemView.findViewById(R.id.founder_img);
            founder_heading = itemView.findViewById(R.id.founder_heading);
            founder_desc = itemView.findViewById(R.id.founder_desc);
        }

    }
}


