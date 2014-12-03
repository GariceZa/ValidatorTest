package android.handyapps.gareth.validatortest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.andreabaccega.widget.FormEditText;


public class MainActivity extends Activity {

    FormEditText name,password,email,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            name        = (FormEditText)findViewById(R.id.etName);
            password    = (FormEditText)findViewById(R.id.etPassword);
            email       = (FormEditText)findViewById(R.id.etEmail);
            phone       = (FormEditText)findViewById(R.id.etPhone);
    }


    public void validateInput(View view) {

        FormEditText[] allFields = {name,password,email,phone};
        boolean allValid = true;
        for(FormEditText field: allFields){
            allValid = field.testValidity() && allValid;
        }

        if(allValid){
            Toast.makeText(getApplicationContext(),"All Valid",Toast.LENGTH_SHORT).show();
        }
    }
}
