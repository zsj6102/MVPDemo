package com.example.admin.mvpdemo.live.mvp.presenter.impl;


import com.example.admin.mvpdemo.live.api.LiveAPI;
import com.example.admin.mvpdemo.live.mvp.model.LiveListItemBean;
import com.example.admin.mvpdemo.live.mvp.presenter.ILiveListPresenter;
import com.example.admin.mvpdemo.live.mvp.view.ILiveListFragment;
import com.example.admin.mvpdemo.util.retrofit.HttpSubscriber;
import com.example.admin.mvpdemo.util.retrofit.RetrofitHelper;

import java.util.List;

/**
 * author: LMJ
 * date: 2016/9/9
 */
public class LiveListPresenterImpl implements ILiveListPresenter {

    private final ILiveListFragment view;

    public LiveListPresenterImpl(ILiveListFragment view) {
        this.view = view;
    }


    @Override
    public void getLiveList(int offset, int limit, String live_type, String game_type) {
        RetrofitHelper.getLiveHelper().create(LiveAPI.class)
                .getLiveList(offset, limit, live_type, game_type)
                .compose(RetrofitHelper.<List<LiveListItemBean>>handleLiveResult())
                .subscribe(new HttpSubscriber<List<LiveListItemBean>>() {
                    @Override
                    public void _onNext(List<LiveListItemBean> roomBeanList) {
                        view.updateRecyclerView(roomBeanList);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
    }

}
