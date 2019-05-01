package com.minimasoft.todoapp.screens.taskList.taskListItem;

import com.minimasoft.todoapp.model.Task;
import com.minimasoft.todoapp.screens.common.views.ObservableViewMvc;

public interface TaskListItemView extends ObservableViewMvc<TaskListItemView.Listener> {
    interface Listener{
        void onTaskItemClicked(Task task);
    }

    void bindTask(Task task);
}
