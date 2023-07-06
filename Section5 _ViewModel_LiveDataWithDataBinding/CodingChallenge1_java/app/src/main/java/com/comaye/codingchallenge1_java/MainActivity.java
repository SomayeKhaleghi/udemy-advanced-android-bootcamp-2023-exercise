package com.comaye.codingchallenge1_java;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
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
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setViewmodel(viewModel);
   /* final Observer<Integer> countObserver = new Observer<Integer>() {
        @Override
        public void onChanged(@Nullable final Integer newValue) {
            binding.txtNumber.setText(String.valueOf(newValue));
        }
    };*/

    //viewModel.getCurrentCount().observe(this, countObserver);

   binding.btnIncrease.setOnClickListener(new View.OnClickListener() {
       public void onClick(View v) {
         viewModel.increaseCountNumber();

           // binding.txtNumber.setText(String.valueOf(viewModel.getNewCountNumber()));
       }
   });
}
//---------------------------------------------------------------------
}