package com.timkoerner.homeautomation.window;

import androidx.lifecycle.ViewModel;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WindowViewModel extends ViewModel
{
    public WindowViewModel()
    {
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        DatabaseReference reference = instance.getReference("test");
    }
}