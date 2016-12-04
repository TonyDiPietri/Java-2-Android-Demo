package org.school.ctj535.mycalculator;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private EditText operand1;
    private EditText operand2;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private Button buttonClear;
    private TextView textResult;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.firstNumber);
        operand2 = (EditText) findViewById(R.id.secondNumber);
        buttonPlus = (Button) findViewById(R.id.plusButton);
        buttonMinus = (Button) findViewById(R.id.minusButton);
        buttonMultiply = (Button) findViewById(R.id.multipleButton);
        buttonDivide = (Button) findViewById(R.id.divideButton);
        buttonClear = (Button) findViewById(R.id.clear);
        textResult = (TextView) findViewById(R.id.textResult);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && (operand2.getText().length()>0)) {
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = op1 + op2;
                    textResult.setText(Double.toString(theResult));

                    Toast.makeText(MainActivity.this, "Calculated Automagically! : ]", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && (operand2.getText().length()>0)) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 - op2;
                textResult.setText(Double.toString(theResult));

                    Toast.makeText(MainActivity.this, "Calculated Automagically! : ]", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && (operand2.getText().length()>0)) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 / op2;
                textResult.setText(Double.toString(theResult));

                    Toast.makeText(MainActivity.this, "Calculated Automagically! : ]", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && (operand2.getText().length()>0)) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 * op2;
                textResult.setText(Double.toString(theResult));

                    Toast.makeText(MainActivity.this, "Calculated Automagically! : ]", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.0");
                operand1.requestFocus();
            Toast.makeText(MainActivity.this, "Successfully Cleared!", Toast.LENGTH_LONG).show();
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
