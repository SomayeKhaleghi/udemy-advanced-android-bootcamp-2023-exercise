package com.comaye.codingchallenge1_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import com.comaye.codingchallenge1_java.databinding.ActivityMainBinding;
//--------------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
//--------------------------------------------------------------------------------------------
@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
  binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

  binding.button.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v)
      {
            setBinding();
      }
  });
}
//--------------------------------------------------------------------------------------------
private  void setBinding()
{
    if (binding.button.getText().toString().equals(getString(R.string.start)))
    {
        binding.button.setText(getString(R.string.stop));
        binding.progressBar.setVisibility(View.VISIBLE);
    }
    else
    {
        binding.button.setText(getString(R.string.start));
        binding.progressBar.setVisibility(View.INVISIBLE);
    }
}
//--------------------------------------------------------------------------------------------

}