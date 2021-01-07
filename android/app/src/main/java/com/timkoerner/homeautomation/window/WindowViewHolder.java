package com.timkoerner.homeautomation.window;

import androidx.recyclerview.widget.RecyclerView;

import com.timkoerner.homeautomation.databinding.WindowViewHolderBinding;
import com.timkoerner.homeautomation.model.Window;

public class WindowViewHolder extends RecyclerView.ViewHolder
{
    private WindowViewHolderBinding binding;

    public WindowViewHolder(WindowViewHolderBinding binding)
    {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bindTo(Window window)
    {
        binding.name.setText(window.getName());
        binding.state.setText(window.getState());
    }
}
