package khs.study.mvpexample.presenter;

import android.content.Context;

import java.util.ArrayList;

import khs.study.mvpexample.data.ImageItem;
import khs.study.mvpexample.data.SampleImageData;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    private SampleImageData sampleImageData;

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void setSampleImageData(SampleImageData sampleImageData) {
        this.sampleImageData = sampleImageData;
    }

    @Override
    public void loadItems(Context context, boolean isClear) {
        ArrayList<ImageItem> items = sampleImageData.getImages(context, 10);
        view.addItems(items, isClear);
        view.notifyAdapter();
    }
}
