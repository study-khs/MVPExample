package khs.study.mvpexample.presenter;

import android.content.Context;

import java.util.ArrayList;

import khs.study.mvpexample.adapter.contract.ImageAdapterContract;
import khs.study.mvpexample.data.ImageItem;
import khs.study.mvpexample.data.SampleImageData;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public interface MainContract {

    interface View {

    }

    interface Presenter {

        void attachView(View view);

        void detachView();

        void setSampleImageData(SampleImageData sampleImageData);

        void loadItems(Context context, boolean isClear);

        void setImageAdapterModel(ImageAdapterContract.Model adapterModel);

        void setImageAdapterView(ImageAdapterContract.View adapterView);
    }
}
