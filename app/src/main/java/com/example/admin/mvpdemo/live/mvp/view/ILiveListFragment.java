package com.example.admin.mvpdemo.live.mvp.view;


import com.example.admin.mvpdemo.live.mvp.model.LiveListItemBean;
import com.example.admin.mvpdemo.util.retrofit.exception.IErrorView;

import java.util.List;

/**
 * author: LMJ
 * date: 2016/9/9
 */
public interface ILiveListFragment extends IErrorView {
    void updateRecyclerView(List<LiveListItemBean> roomBeanList);//更新列表
}
