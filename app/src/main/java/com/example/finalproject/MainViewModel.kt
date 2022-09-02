package com.example.finalproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finalproject.adapters.WeatherModel

class MainViewModel : ViewModel() {
    //передает информацию во view и только после этого идет обновление
    //когда есть измененя и view доступны
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}