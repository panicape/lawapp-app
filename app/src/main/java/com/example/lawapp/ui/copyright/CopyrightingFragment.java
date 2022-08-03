package com.example.lawapp.ui.copyright;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lawapp.databinding.FragmentCopyrightingBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author panicape
 * @version 1.01 July 2022
 */
public class CopyrightingFragment extends Fragment {

    CopyrightViewModel copyrightViewModel =
            new ViewModelProvider(this).get(CopyrightViewModel.class);

    private FirebaseFirestore firestoreDb;

    private static final String TAG = "COPYRIGHT";


    private FragmentCopyrightingBinding binding;

    private List data;

    private ArrayAdapter<String> listAdapter;

    private ListView copyrightLW;


    // Methods

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        data = new ArrayList<String>();
        firestoreDb = FirebaseFirestore.getInstance();

        binding = FragmentCopyrightingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            firestoreDb.collection("Copyrighting")
                    .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            Log.d(TAG, document.getId() + " => " + document.getData());

                        }
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                }
            });
        }

        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        copyrightLW = binding.copyrightingLW;
        copyrightLW.setAdapter(listAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}