package id.sampitdev.recycleviewadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HolderGridImage extends RecyclerView.ViewHolder {

    public TextView Text;
    public ImageView image;

    public HolderGridImage(View itemView) {
        super(itemView);
        Text  =  itemView.findViewById(R.id.text);
        image = itemView.findViewById(R.id.image);
    }

}