package vn.com.example.demorecycleview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.com.example.demorecycleview.R;
import vn.com.example.demorecycleview.model.Hero;

public class HerosAdapter extends RecyclerView.Adapter<HerosAdapter.HerosViewHolder> {

    private Context context;
    private List<Hero> listHero;

    public HerosAdapter(Context context, List<Hero> listHero) {
        this.context = context;
        this.listHero = listHero;
    }

    @NonNull
    @Override
    public HerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_item_hero,parent,false);
        return new HerosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HerosViewHolder holder, int position) {
        holder.imageAvatarHero.setImageResource(listHero.get(position).getmAvavatar());
        holder.textNameHero.setText(listHero.get(position).getmNameHero());
    }

    public class HerosViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageAvatarHero;
        public TextView textNameHero;

        public HerosViewHolder(View itemView) {
            super(itemView);
            imageAvatarHero = itemView.findViewById(R.id.image_hero_avatar);
            textNameHero = itemView.findViewById(R.id.text_name_hero);
        }
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }
}
