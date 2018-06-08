package com.example.goldplusgold.mvvm_practice.common.bindingadapter;

import android.databinding.BindingAdapter;
import android.widget.ListView;

import com.example.goldplusgold.mvvm_practice.common.recyclingadapter.ListViewAdapter;

import java.util.List;

public class ListViewBinding {

    @BindingAdapter("bindItems")
    public static void setItems(ListView listView, List items) {
        ListViewAdapter adapter = (ListViewAdapter) listView.getAdapter();
        if (adapter != null) {
            adapter.replaceData(items);
        }
    }


}
