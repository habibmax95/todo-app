package com.minimasoft.todoapp.screens.taskList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.minimasoft.todoapp.model.Task;
import com.minimasoft.todoapp.screens.common.views.ViewMvcFactory;
import com.minimasoft.todoapp.screens.taskList.taskListItem.TaskListItemView;
import com.minimasoft.todoapp.screens.taskList.taskListItem.TaskListItemViewImplementation;

import java.util.ArrayList;
import java.util.List;

public class TaskListRecyclerAdapter extends RecyclerView.Adapter<TaskListRecyclerAdapter.MyViewHolder> implements TaskListItemView.Listener {

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
    private final Listener mListener;
    private final ViewMvcFactory mViewMvcFactory;
    private List<Task> mTasks = new ArrayList<>();


    TaskListRecyclerAdapter(Listener listener, ViewMvcFactory viewMvcFactory) {
        mListener = listener;
        mViewMvcFactory = viewMvcFactory;
    }

    public void bindTask(List<Task> tasks) {
        mTasks = new ArrayList<>(tasks);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TaskListRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TaskListItemView view = mViewMvcFactory.getTaskListItemViewMvc(viewGroup);
        view.registerListener(this);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListRecyclerAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.mViewMvc.bindTask(mTasks.get(i));
    }

    @Override
    public int getItemCount() {
        return mTasks.size();
    }

    @Override
    public void onTaskItemClicked(Task task) {
        mListener.onTaskItemClicked(task);
    }
}
