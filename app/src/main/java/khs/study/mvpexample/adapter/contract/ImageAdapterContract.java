package khs.study.mvpexample.adapter.contract;

import android.widget.AdapterView;

import java.util.ArrayList;

import khs.study.mvpexample.data.ImageItem;
import khs.study.mvpexample.listener.OnItemClickListener;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public interface ImageAdapterContract {
    interface View {
        void setOnClickListener(OnItemClickListener clickListener);
        void notifyAdapter();
    }

    interface Model {
        void addItems(ArrayList<ImageItem> imageItems);
        void clearItem();
        ImageItem getItem(int position);
    }
}
