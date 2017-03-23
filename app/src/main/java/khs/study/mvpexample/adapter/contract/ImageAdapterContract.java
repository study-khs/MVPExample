package khs.study.mvpexample.adapter.contract;

import java.util.ArrayList;

import khs.study.mvpexample.data.ImageItem;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public interface ImageAdapterContract {
    interface View {
        void notifyAdapter();
    }

    interface Model {
        void addItems(ArrayList<ImageItem> imageItems);
        void clearItem();
    }
}
