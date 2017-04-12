package com.example.admin.mvpdemo.demo_list.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.demo_list.mvp.model.bean.DemoListBean;

import java.util.List;


public class DemoListAdapter extends BaseQuickAdapter<DemoListBean, BaseViewHolder> {


    public DemoListAdapter(List<DemoListBean> data) {
        super(R.layout.item_demo_list_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, DemoListBean bean) {

    }
}
