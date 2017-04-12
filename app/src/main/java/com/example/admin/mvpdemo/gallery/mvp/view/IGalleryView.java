package com.example.admin.mvpdemo.gallery.mvp.view;


import com.example.admin.mvpdemo.util.retrofit.exception.IErrorView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/30.
 */

public interface IGalleryView extends IErrorView {
    void updateViewPager(ArrayList<String> imgList);
}
