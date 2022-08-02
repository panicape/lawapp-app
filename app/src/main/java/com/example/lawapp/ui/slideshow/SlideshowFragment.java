package com.example.lawapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lawapp.databinding.FragmentSlideshowBinding;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author panicape
 * @ver 1.01 July 2022
 */
public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    List<String> data;
    ArrayAdapter<String> listAdapter;

    private ListView myLiteratureLW;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        data = new ArrayList<>();

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        myLiteratureLW = binding.literatureLW;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}