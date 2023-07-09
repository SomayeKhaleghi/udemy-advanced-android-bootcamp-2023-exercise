package com.comaye.codingchallenge1_java;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import com.comaye.codingchallenge1_java.databinding.ActivityMainBinding;
//---------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
MainActivityViewModel viewModel ;
//----------------------------------------
@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    viewModel   =  new ViewModelProvider(this).get(MainActivityViewModel.class);
    viewModel.getCurrentCount();
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setViewmodel(viewModel);
    MutableLiveData<Integer> myLivedata = viewModel.countLiveData;

    myLivedata.observe(this, new Observer<Integer>() {
        @Override
        public void onChanged(Integer integer){
            binding.txtNumber.setText(String.valueOf(integer));
        }
    });

}
//---------------------------------------------------------------------
}