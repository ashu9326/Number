package com.example.ashugupta.number;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button plus, minus, evenbtn,wholebtn,oddbtn;
    int count=0,counter,i;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        plus = (Button) findViewById(R.id.plus);
        evenbtn = (Button) findViewById(R.id.evenbtn);
        oddbtn = (Button) findViewById(R.id.oddbtn);
        wholebtn = (Button) findViewById(R.id.wholebtn);
        minus = (Button) findViewById(R.id.minus);
        // textView.setText(""+count);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }



    public void evennum(View view) {
        counter=0;
        count = 2;

           // plus.setActivated(false);
            //minus.setActivated(false);

            textView.setText("" + count);
            i=2;

    }
       public void oddnum(View view)
       {   counter=0;
           count=1;
           textView.setText(""+ count);
           i=2;
       }
          public void wholenum(View view)
          {
              count=0;
              counter=0;
              textView.setText(""+count);
              i=1;
          }

          public void primenum(View view)
         {   counter=0;
             count=3;
             int j,flag=0;
              for(j=2;j<count;j++)
              {
                  if(count%j==0)
                  {
                      flag=1;
                      break;
                  }
                  if(flag==0) {
                      textView.setText("" + count);

                  }

              }
             // textView.setText("" + count);

          }
    public void plus(View view)

        {
            count+=i;
            counter++;
            textView.setText("" + count);
        }



    public void minus(View view) {
        if( count == 0||counter==0)
        {
            minus.setActivated(false);
        }
        else {
            count -= i;
            counter--;
            textView.setText("" + count);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ashugupta.number/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ashugupta.number/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
