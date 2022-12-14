package com.example.lawapp.ui.slideshow;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;


/**
 *
 * @author panicape
 * @ver 1.01 July 2022
 */
public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<List<String>> dataList;


    //Constructor

    public SlideshowViewModel() {
    }



    // Getters & setters

    public MutableLiveData<List<String>> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = new MutableLiveData<>(dataList);
    }
}