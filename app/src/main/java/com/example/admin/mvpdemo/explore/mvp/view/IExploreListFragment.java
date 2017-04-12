package com.example.admin.mvpdemo.explore.mvp.view;


import com.example.admin.mvpdemo.explore.mvp.model.bean.ExploreListItemBean;
import com.example.admin.mvpdemo.util.retrofit.exception.IErrorView;

import java.util.List;

/**
 * author: LMJ
 * date: 2016/9/9
 */
public interface IExploreListFragment extends IErrorView {
    void updateRecyclerView(List<ExploreListItemBean> roomBeanList);//更新列表
}
