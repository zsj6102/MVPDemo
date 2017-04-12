package com.example.admin.mvpdemo.demo_normal.mvp.presenter.impl;


import com.example.admin.mvpdemo.demo_normal.mvp.presenter.IDemoNormalPresenter;
import com.example.admin.mvpdemo.demo_normal.mvp.view.IDemoNormalView;

public class DemoNormalPresenterImpl implements IDemoNormalPresenter {

    private final IDemoNormalView view;

    public DemoNormalPresenterImpl(IDemoNormalView view) {
        this.view = view;
    }
}
