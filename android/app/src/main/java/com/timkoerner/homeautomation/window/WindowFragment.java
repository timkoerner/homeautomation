package com.timkoerner.homeautomation.window;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.timkoerner.homeautomation.databinding.WindowFragmentBinding;
import com.timkoerner.homeautomation.model.Window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class WindowFragment extends Fragment
{
    private WindowFragmentBinding binding;
    private WindowViewModel viewModel;
    private WindowListAdapter adapter;

    public static WindowFragment newInstance()
    {
        return new WindowFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        binding = WindowFragmentBinding.inflate(inflater, container, false);

        // list adapter
        WindowDiffCallback diffCallback = new WindowDiffCallback();
        adapter = new WindowListAdapter(diffCallback);
        binding.recycler.setAdapter(adapter);

        // layout manager
        LinearLayoutManager manager = new LinearLayoutManager(requireContext());
        binding.recycler.setLayoutManager(manager);

        LinkedList<Window> list = new LinkedList<>();
        list.add(new Window("Bad", "Geschlossen"));
        list.add(new Window("Küche", "Geöffnet"));
        list.add(new Window("Tim", "Geschlossen"));
        adapter.submitList(list);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        ViewModelProvider provider = new ViewModelProvider(this);
        viewModel = provider.get(WindowViewModel.class);
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}