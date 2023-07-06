package com.comaye.codingchallenge1_java;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel{
int count = 0;

public int getCountNumber(){
    return count;
}

public int getNewCountNumber(){
    return  ++count;
}

}
