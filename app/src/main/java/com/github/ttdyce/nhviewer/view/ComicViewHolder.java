package com.github.ttdyce.nhviewer.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

import com.github.ttdyce.nhviewer.R;

public class ComicViewHolder extends RecyclerView.ViewHolder {
    public ImageViewTouch ivComicPage;
    public TextView tvComicPage;

    public ComicViewHolder(View v) {
        super(v);
        ivComicPage = v.findViewById(R.id.ivComicPage);
        tvComicPage = v.findViewById(R.id.tvComicPage);
    }
}
