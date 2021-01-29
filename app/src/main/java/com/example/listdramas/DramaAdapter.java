package com.example.listdramas;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DramaAdapter extends RecyclerView.Adapter<DramaAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<list_drama> dramas;

    DramaAdapter(Context context, List<list_drama> states) {
        this.dramas = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DramaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_list_dramas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DramaAdapter.ViewHolder holder, int position) {
        list_drama drama = dramas.get(position);
        holder.photoView.setImageResource(drama.getPhoto ());
        holder.nameView.setText(drama.getName());
        holder.genreView.setText(drama.getGenre ());
    }

    @Override
    public int getItemCount() {
        return dramas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView photoView;
        final TextView nameView, genreView;
        ViewHolder(View view){
            super(view);
            photoView = (ImageView)view.findViewById(R.id.photo);
            nameView = (TextView) view.findViewById(R.id.name);
            genreView = (TextView) view.findViewById(R.id.genre);
        }
    }
}
