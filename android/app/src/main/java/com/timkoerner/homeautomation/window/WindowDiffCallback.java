package com.timkoerner.homeautomation.window;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.timkoerner.homeautomation.model.Window;

public class WindowDiffCallback extends DiffUtil.ItemCallback<Window>
{
    @Override
    public boolean areItemsTheSame(@NonNull Window oldItem, @NonNull Window newItem)
    {
        return true;
    }

    @Override
    public boolean areContentsTheSame(@NonNull Window oldItem, @NonNull Window newItem)
    {
        if (!oldItem.getName().equals(newItem.getName()))
            return false;

        if (!oldItem.getState().equals(newItem.getState()))
            return false;

        return true;
    }
}
