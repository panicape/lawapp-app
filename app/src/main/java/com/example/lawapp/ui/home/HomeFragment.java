package com.example.lawapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.lawapp.R;
import com.example.lawapp.databinding.FragmentHomeBinding;



/**
 *
 * @author panicape
 * @ver 1.01 July 2022
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private ImageButton editorialBtn, literatureBtn, copyrightingBtn;


    // Methods

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        editorialBtn = binding.editorialButton;
        literatureBtn = binding.literatureBtn;
        copyrightingBtn = binding.copyrightingButton;

        editorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_editorial);
            }
        });

        literatureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_slideshow);
            }
        });

        copyrightingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_copyrighting);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}