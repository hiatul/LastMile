package lastmile4.lastmile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

    public void move(View v)
    {
        Intent i=new Intent(this,PersonalDetails.class);
        startActivity(i);
    }
}
