package khs.study.mvpexample.data;

/**
 * Created by jaeyoung on 2017. 3. 23..
 */

public class ImageItem {

    private int imageRes;
    private String title;

    public ImageItem(int imageRes, String title) {
        this.imageRes = imageRes;
        this.title = title;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTitle() {
        return title;
    }
}
