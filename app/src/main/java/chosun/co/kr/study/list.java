package chosun.co.kr.study;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by user on 2015-10-26.
 */
public class list extends Activity {

    ArrayAdapter<CharSequence> adspin;
    boolean mInitSpinner;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.main);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Spinner spin = (Spinner) findViewById(R.id.myspinner);
        spin.setPrompt("수강리스트를 고르세요");

        adspin = ArrayAdapter.createFromResource(this, R.array.ProgramList_arrays, android.R.layout.simple_spinner_item);
        adspin.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(adspin);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              /*초기화 시의 선택 제외시*/
                if (mInitSpinner == false) {
                    mInitSpinner = true;
                    return;
                }
                Toast.makeText(list.this, adspin.getItem(position) + ".", Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }
}