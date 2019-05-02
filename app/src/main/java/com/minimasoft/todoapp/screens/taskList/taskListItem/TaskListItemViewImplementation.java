package com.minimasoft.todoapp.screens.taskList.taskListItem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.minimasoft.todoapp.R;
import com.minimasoft.todoapp.model.Task;
import com.minimasoft.todoapp.screens.common.views.BaseObservableViewMvc;

public class TaskListItemViewImplementation extends BaseObservableViewMvc<TaskListItemView.Listener> implements TaskListItemView {
    private final TextView title;
    private Task task;

    public TaskListItemViewImplementation(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.layout_task_list_item, parent, false));

        title = findViewById(R.id.txt_title);
        getRootView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Listener listener : getListeners()) {
                    listener.onTaskItemClicked(task);
                }
            }
        });
    }
    @Override
    public void bindTask(Task task) {
        title.setText(task.getTitle());
    }

}
