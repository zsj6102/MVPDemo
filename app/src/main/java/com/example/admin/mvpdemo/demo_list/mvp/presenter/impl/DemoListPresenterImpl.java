package com.example.admin.mvpdemo.demo_list.mvp.presenter.impl;


import com.example.admin.mvpdemo.demo_list.mvp.presenter.IDemoListPresenter;
import com.example.admin.mvpdemo.demo_list.mvp.view.IDemoListView;

public class DemoListPresenterImpl implements IDemoListPresenter {

    private final IDemoListView view;

    public DemoListPresenterImpl(IDemoListView view) {
        this.view = view;
    }
}
