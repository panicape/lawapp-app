package com.example.lawapp.ui.editorial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lawapp.databinding.FragmentEditorialBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panicape
 * @version 1.01 July 2022
 */
public class EditorialFragment extends Fragment {

    private FragmentEditorialBinding binding;

    private List<String> data;
    private ArrayAdapter<String> listAdapter;

    private ListView editorialLW;


    // Methods

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        data = new ArrayList<>();

        binding = FragmentEditorialBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        editorialLW = binding.editorialLW;
        editorialLW.setAdapter(listAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}