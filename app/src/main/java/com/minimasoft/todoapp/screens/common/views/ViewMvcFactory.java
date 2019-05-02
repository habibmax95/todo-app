package com.minimasoft.todoapp.screens.common.views;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.minimasoft.todoapp.screens.taskList.taskListItem.TaskListItemView;
import com.minimasoft.todoapp.screens.taskList.taskListItem.TaskListItemViewImplementation;

public class ViewMvcFactory {
    private final LayoutInflater mLayoutInflater;

    ViewMvcFactory(LayoutInflater layoutInflater) {
        mLayoutInflater = layoutInflater;
    }

    public TaskListItemView getTaskListItemViewMvc(@Nullable ViewGroup parent) {
        return new TaskListItemViewImplementation(mLayoutInflater, parent);
    }
}
