package com.minimasoft.todoapp.screens.taskList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.minimasoft.todoapp.R;
import com.minimasoft.todoapp.screens.common.views.BaseObservableViewMvc;

public class TaskListViewImplementation extends BaseObservableViewMvc<TaskListView.Listener> implements TaskListView{
    private EditText editAddTask;
    private Button buttonAdd;
    private RecyclerView mRecyclerView;
    public TaskListViewImplementation(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.layout_task_list, parent, false));

        editAddTask = findViewById(R.id.task_title_edit_text);
        buttonAdd = findViewById(R.id.add_button);
        mRecyclerView = findViewById(R.id.recyler_task_list);
    }
}
