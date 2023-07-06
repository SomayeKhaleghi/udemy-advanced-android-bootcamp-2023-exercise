package com.comaye.codingchallenge1_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import com.comaye.codingchallenge1_java.databinding.ActivityMainBinding;
//---------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
//----------------------------------------
@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    MainActivityViewModel viewModel   =  new ViewModelProvider(this).get(MainActivityViewModel.class);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.txtNumber.setText(  String.valueOf( viewModel.getCountNumber()));

   binding.btnIncrease.setOnClickListener(new View.OnClickListener() {
       public void onClick(View v) {
          binding.txtNumber.setText( String.valueOf(viewModel.getNewCountNumber()));
       }
   });
}
//---------------------------------
}