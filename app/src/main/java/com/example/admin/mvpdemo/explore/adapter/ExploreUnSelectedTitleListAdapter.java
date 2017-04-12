package com.example.admin.mvpdemo.explore.adapter;

import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.admin.mvpdemo.R;

import java.util.List;

/**
 * Created by Administrator on 2016/11/4.
 */

public class ExploreUnSelectedTitleListAdapter extends BaseItemDraggableAdapter<String, BaseViewHolder> {
    public ExploreUnSelectedTitleListAdapter(List<String> data) {
        super(R.layout.item_explore_title_list_layout, data);
    }


    @Override
    protected void convert(BaseViewHolder viewHolder, String title) {
        viewHolder.setText(R.id.tv_title, title)
                .addOnClickListener(R.id.cardview);
    }
}
