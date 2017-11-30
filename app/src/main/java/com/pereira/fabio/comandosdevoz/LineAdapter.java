package com.pereira.fabio.comandosdevoz;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabiopereira on 11/28/17.
 */

public class LineAdapter extends RecyclerView.Adapter<LineViewHolder> {

    private List<ListModel> listModels;

    public LineAdapter(ArrayList listModels) {
        this.listModels = listModels;
    }

    @Override
    public LineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_line, parent, false));
    }

    @Override
    public void onBindViewHolder(LineViewHolder holder, int position) {
        holder.lineDescriptionImagView.setImageResource(
                listModels.get(position).getDescriptionImageId()
        );
        holder.lineMessageTextView.setText(
                listModels.get(position).getMessage()
        );
        holder.lineArrowImageButton.setImageResource(
                listModels.get(position).getArrowImageId()
        );

        holder.lineArrowImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("","");
            }
        });
    }

    @Override
    public int getItemCount() {
        return listModels != null ? listModels.size() : 0;
    }

}
