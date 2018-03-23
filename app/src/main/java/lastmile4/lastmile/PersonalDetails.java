package lastmile4.lastmile;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PersonalDetails extends AppCompatActivity {

    EditText age1;
    DatePickerDialog date;
    SimpleDateFormat dateFormatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btn1;
        btn1 = (Button) findViewById(R.id.button2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);


        EditText name;
        name = (EditText) findViewById(R.id.editText);
        String sname = name.getText().toString();

        //age1 = (EditText) findViewById(R.id.editText2);




        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        findViewsById();

        setDateTimeField();

    }
    public void move()
    {
        Intent i=new Intent(this,PersonalDetailsStep2.class);
        startActivity(i);

    }

    private void findViewsById() {
        age1 = (EditText) findViewById(R.id.editText2);
        age1.setInputType(InputType.TYPE_NULL);
        age1.requestFocus();

    }

    private void setDateTimeField() {
        age1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date.show();
            }
        });


        Calendar newCalendar = Calendar.getInstance();
        date = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                age1.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        /*RadioButton male;
        RadioButton female;*/
        RadioButton male;
        RadioButton female;
        female = (RadioButton) findViewById(R.id.radioButton);
        male = (RadioButton) findViewById(R.id.radioButton2);
        String OPTIONS = male.getText().toString();
        //String OPTIONS1 = female.getText().toString();
        if(OPTIONS.equals("FEMALE")){
            female.setChecked(true);
            male.setChecked(false);

        }else{
            male.setChecked(true);
            female.setChecked(false);
        }
    }
}
