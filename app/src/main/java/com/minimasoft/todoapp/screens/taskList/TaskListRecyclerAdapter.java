package com.minimasoft.todoapp.screens.taskList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.minimasoft.todoapp.model.Task;
import com.minimasoft.todoapp.screens.taskList.taskListItem.TaskListItemView;

public class TaskListRecyclerAdapter extends RecyclerView.Adapter<TaskListRecyclerAdapter.MyViewHolder> {

    public interface Listener {
        void onTaskItemClicked(Task task);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TaskListItemView mViewMvc;

        public MyViewHolder(TaskListItemView viewMvc) {
            super(viewMvc.getRootView());
            mViewMvc = viewMvc;
        }
    }

    @NonNull
    @Override
    public TaskListRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListRecyclerAdapter.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
