package com.example.quran;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Surah_RecyclerView_Adaptor extends RecyclerView.Adapter<Surah_RecyclerView_Adaptor.MyViewHolder> {
    ArrayList<SurahModel> SurahList;

    public Surah_RecyclerView_Adaptor(ArrayList<SurahModel> surahList) {
        this.SurahList = surahList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Surahnum;
        TextView SurahNameEng;
        TextView SurahNameUrd;
        SurahModel data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Surahnum = itemView.findViewById(R.id.surahNum);
            SurahNameEng = itemView.findViewById(R.id.surahNameEnglish);
            SurahNameUrd = itemView.findViewById(R.id.surahNameUrdu);

        }
    }
    @NonNull
    @Override
    public Surah_RecyclerView_Adaptor.MyViewHolder onCreateViewHolder

            (@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_row, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull Surah_RecyclerView_Adaptor.MyViewHolder holder,
                                 int position) {
        holder.data=SurahList.get(position);
        holder.Surahnum.setText(String.valueOf(holder.data.getNumber()));
        holder.SurahNameEng.setText(holder.data.getNameEnglish());
        holder.SurahNameUrd.setText(holder.data.getNameUrdu());
    }

    @Override
    public int getItemCount() {
        return SurahList.size();
    }
}