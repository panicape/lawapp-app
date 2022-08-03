package com.example.lawapp.ui.copyright;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CopyrightViewModel extends ViewModel {

    private MutableLiveData<List<String>> dataList;

    public MutableLiveData<List<String>> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = new MutableLiveData<>(dataList);
    }

}
