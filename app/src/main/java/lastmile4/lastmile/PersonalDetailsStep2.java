package lastmile4.lastmile;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalDetailsStep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*EditText cn1;
        cn1 = (EditText) findViewById(R.id.textView13);
        cn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
                startActivityForResult(intent, 1);
            }
        }));
        @Override
        protected void onActivityResult(int requestCode,int resultCode, Intent data) {
            // TODO Auto-generated method stub
            super.onActivityResult(requestCode, resultCode, data);

            if(requestCode == 1){
                if(resultCode == RESULT_OK){
                    Uri contactData = data.getData();
                    Cursor cursor =  managedQuery(contactData, null, null, null, null);
                    cursor.moveToFirst();

                    String number = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER));

                    //contactName.setText(name);
                    cn1.setText(number);
                    //contactEmail.setText(email);
                }
            }
        }*/


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details_step2);
    }

    public void move()
    {
        Intent i=new Intent(this,PersonalDetailsStep3.class);
        startActivity(i);
    }
}
