package com.example.admin.mvpdemo.root.ui;

import android.os.Bundle;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.main.ui.MainFragment;
import com.example.admin.mvpdemo.widget.activity.BaseActivity;


/**
 * author: LMJ
 * date: 2016/9/1
 */
public class RootActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        loadRootFragment(R.id.layout_container, MainFragment.newInstance());
    }
}
