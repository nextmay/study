package chosun.co.kr.study;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.fbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼이 클릭됨",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),list.class);
                startActivity(intent);


            }
        });


       // ActionBar actionBar = getActionBar();
        //actionBar.hide();

    }




}
