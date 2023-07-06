package com.comaye.codingchallenge1_java;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel{
//int count = 0;


private MutableLiveData<Integer> count;

public MutableLiveData<Integer> getCurrentCount() {
    if (count == null) {
        count = new MutableLiveData<>();
        count.setValue(0);
    }
    return count;
}

public void  increaseCountNumber(){
    count.setValue(count.getValue()+1);
}

}
