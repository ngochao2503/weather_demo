package com.example.bai1_chuc_nang_co_ban.Adapter;

import static com.bumptech.glide.Glide.*;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bai1_chuc_nang_co_ban.Domains.Hourly;
import com.example.bai1_chuc_nang_co_ban.R;

import java.util.ArrayList;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHoler>
{
    ArrayList<Hourly> item;
    Context context;
    public HourlyAdapter(ArrayList<Hourly> item) {

        this.item = item;
    }

    @NonNull
    @Override
    public HourlyAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);
        context = parent.getContext();
        return new ViewHoler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapter.ViewHoler holder, int position)
    {

        holder.hourTxt.setText(item.get(position).getHour());
        holder.tempTxt.setText(item.get(position).getTemp()+"°");

        // lấy đối tượng của View đó
        // lấy mã nguồn của hình ảnh trong tài nguyên drawble của ứng dụng
        int drawableResourceId =holder.itemView.getResources()
                .getIdentifier(item.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {

        return item.size();
    }
    public class ViewHoler extends RecyclerView.ViewHolder
    {
        TextView hourTxt, tempTxt;
        ImageView pic;

        public ViewHoler(@NonNull View itemView) {

            super(itemView);
            hourTxt = itemView.findViewById(R.id.hourTxt);
            tempTxt = itemView.findViewById(R.id.tempTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }

}
