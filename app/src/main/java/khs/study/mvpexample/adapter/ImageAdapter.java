package khs.study.mvpexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import khs.study.mvpexample.adapter.contract.ImageAdapterContract;
import khs.study.mvpexample.adapter.holder.ImageViewHolder;
import khs.study.mvpexample.data.ImageItem;
import khs.study.mvpexample.listener.OnItemClickListener;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> implements ImageAdapterContract.Model, ImageAdapterContract.View {

    private Context mContext;
    private OnItemClickListener onItemClickListener;
    private ArrayList<ImageItem> mImageItems;

    public ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public void addItems(ArrayList<ImageItem> imageItems) {
        this.mImageItems = imageItems;
    }

    @Override
    public void clearItem() {
        if (mImageItems != null) {
            mImageItems.clear();
        }
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mImageItems != null ? mImageItems.size() : 0;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(mContext, parent, onItemClickListener);
    }

    @Override
    public void setOnClickListener(OnItemClickListener clickListener) {
        this.onItemClickListener = clickListener;
    }

    @Override
    public ImageItem getItem(int position) {
        return mImageItems.get(position);
    }

    @Override
    public void onBindViewHolder(final ImageViewHolder holder, int position) {
        if (holder == null) return;

        holder.onBind(getItem(position), position);
    }
}
