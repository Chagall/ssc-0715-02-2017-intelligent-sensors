package com.pereira.fabio.comandosdevoz;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fabiopereira on 11/28/17.
 */

public class LineViewHolder extends RecyclerView.ViewHolder {

    public ImageView lineDescriptionImagView;
    public TextView lineMessageTextView;
    public ImageButton lineArrowImageButton;

    public LineViewHolder(View itemView) {
        super(itemView);

        lineDescriptionImagView = (ImageView) itemView.findViewById(R.id.line_description_image);
        lineMessageTextView = (TextView) itemView.findViewById(R.id.line_message);
        lineArrowImageButton = (ImageButton) itemView.findViewById(R.id.line_next_arrow);

    }
}