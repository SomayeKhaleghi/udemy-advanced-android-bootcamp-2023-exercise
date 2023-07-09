package com.comaye.codingchallenge1_java;

    import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel{
//int count = 0;

int count = 0;

public MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

public MutableLiveData<Integer> getCurrentCount() {
    if (countLiveData == null) {
        countLiveData = new MutableLiveData<>();
        countLiveData.setValue(0);
    }

    return countLiveData;
}

public void  increaseCountNumber(){
    count++;
    countLiveData.setValue(count);
}

}
