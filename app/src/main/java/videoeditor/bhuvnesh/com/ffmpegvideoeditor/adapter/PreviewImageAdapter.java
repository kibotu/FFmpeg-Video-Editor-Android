package videoeditor.bhuvnesh.com.ffmpegvideoeditor.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import videoeditor.bhuvnesh.com.ffmpegvideoeditor.R;


/**
 * Created by Bhuvnesh on 09-03-2017.
 */

public class PreviewImageAdapter extends RecyclerView.Adapter<PreviewImageAdapter.MyViewHolder> {

    private ArrayList<String> paths;

    public PreviewImageAdapter(ArrayList<String> paths) {
        this.paths = paths;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_gallery, parent, false);

        return new MyViewHolder(itemView);
    }

    @Overridex
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Bitmap bmp = BitmapFactory.decodeFile(paths.get(position));
        holder.ivPhoto.setImageBitmap(bmp);
    }

    @Override
    public int getItemCount() {
        return paths.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPhoto;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.ivPhoto);
        }
    }

}
