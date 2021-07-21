package com.laily.newproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.laily.newproject.Model.Book;
import com.laily.newproject.R;
import com.laily.newproject.UI.EbookViewActivity;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder> {

    private Context context;
    private List<Book> list;

    public EbookAdapter(Context context, List<Book> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public EbookAdapter.EbookViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pdf_item_layout,parent,false);
        return new EbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull EbookAdapter.EbookViewHolder holder, int position) {
    Book book = list.get(position);
    holder.pdfTitle.setText(list.get(position).getPdfTitle());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, EbookViewActivity.class);
            intent.putExtra("pdfUrl",list.get(position).getPdfUrl());
            context.startActivity(intent);
        }
    });
    holder.pdfDownload.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(list.get(position).getPdfUrl()));
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class EbookViewHolder extends RecyclerView.ViewHolder {

        private TextView pdfTitle;
        private ImageView pdfDownload;

        public EbookViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            pdfTitle = itemView.findViewById(R.id.tvPdfTitle);
            pdfDownload = itemView.findViewById(R.id.pdfDownload);
        }
    }
}
