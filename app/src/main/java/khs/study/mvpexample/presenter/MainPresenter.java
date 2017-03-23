package khs.study.mvpexample.presenter;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

import khs.study.mvpexample.adapter.contract.ImageAdapterContract;
import khs.study.mvpexample.data.ImageItem;
import khs.study.mvpexample.data.SampleImageData;
import khs.study.mvpexample.listener.OnItemClickListener;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public class MainPresenter implements MainContract.Presenter, OnItemClickListener {

    private MainContract.View view;

    private SampleImageData sampleImageData;

    private ImageAdapterContract.Model adapterModel;
    private ImageAdapterContract.View adapterView;

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
        if (isClear) {
            adapterModel.clearItem();
        }
        adapterModel.addItems(items);
        adapterView.notifyAdapter();
    }

    @Override
    public void setImageAdapterModel(ImageAdapterContract.Model adapterModel) {
        this.adapterModel = adapterModel;
    }

    @Override
    public void setImageAdapterView(ImageAdapterContract.View adapterView) {
        this.adapterView = adapterView;

        this.adapterView.setOnClickListener(this);
    }

    @Override
    public void onItemClick(int position) {
        ImageItem imageItem = adapterModel.getItem(position);

        view.showToast(imageItem.getTitle());
    }
}
