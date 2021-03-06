package com.example.specialistfinderapp.CustomerFragments;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.specialistfinderapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerChatFragment extends Fragment {
    //Variable declaration
    private static final String ARG_PARAM1 = "param1" ;
    private static final String ARG_PARAM2 = "param2";
    private static CustomerChatFragment INSTANCE =null;
    View view;

    //Constructor
    public CustomerChatFragment() {
        // Required empty public constructor
    }
    public static CustomerChatFragment newInstance() {
        CustomerChatFragment fragment = new CustomerChatFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    public static CustomerChatFragment getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new CustomerChatFragment();
        return INSTANCE;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_customer_chat, container, false);
        return view;
    }

}
