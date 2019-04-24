package com.minimasoft.todoapp.screens.taskList;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.minimasoft.todoapp.R;
import com.minimasoft.todoapp.screens.common.views.BaseObservableViewMvc;

public class TaskListViewImplementation extends BaseObservableViewMvc<TaskListView.Listener> implements TaskListView{
    public TaskListViewImplementation(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.layout_task_list, parent, false));
    }
}
