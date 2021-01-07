package com.timkoerner.homeautomation.window;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.timkoerner.homeautomation.databinding.WindowViewHolderBinding;
import com.timkoerner.homeautomation.model.Window;

public class WindowListAdapter extends ListAdapter<Window, WindowViewHolder>
{
    protected WindowListAdapter(@NonNull DiffUtil.ItemCallback<Window> diffCallback)
    {
        super(diffCallback);
    }

    @NonNull
    @Override
    public WindowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        WindowViewHolderBinding binding = WindowViewHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new WindowViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WindowViewHolder holder, int position)
    {
        holder.bindTo(getItem(position));
    }
}
