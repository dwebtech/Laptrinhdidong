package code.admin.labandroids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    public void showMe(View v)
    {
        String msg;
        EditText et = (EditText)findViewById(R.id.EditText01);
        msg = "Xin Chao" + et.getText().toString();
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}
