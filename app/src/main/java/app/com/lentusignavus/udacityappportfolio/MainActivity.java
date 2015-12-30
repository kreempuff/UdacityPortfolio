package app.com.lentusignavus.udacityappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button app1;
    Button app2;
    Button app3;
    Button app4;
    Button app5;
    Button app6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showSnackBar(View v) {
        Button b = (Button) v;
        Snackbar.make(v, b.getText().toString(), Snackbar.LENGTH_SHORT).show();
    }



        //Notes: The below code is what I used initially to have a snackbar show up with the button's
        //text. I switched to the xml attr 'onClick' and placed it in the styles.xml file
        //Code below violates DRY principle



    /*

    NOTES from Udacian reviewer
    Here are the benefits of using the XML attribute over an anonymous Java class:

    With Anonymous Java class we always have to specify an id for our elements, but with XML attribute id can be omitted.
    With Anonymous Java class we have to actively search for the element inside of the view (findViewById portion), but with the XML attribute Android does it for us.
    Anonymous Java class requires at least 5 lines of code, as we can see, but with the XML attribute 3 lines of code is sufficient.
    With Anonymous Java class we have to name of our method “onClick", but with the XML attribute we can add any name we want, which will dramatically help with the readability of our code.
    Xml “onClick” attribute has been added by Google during the API level 4 release, which means that it is a bit more modern syntax and modern syntax is almost always better.

    Of course, it is not always possible to use the Xml attribute, here are the reasons why we wouldn’t chose it:

     If we are working with fragments. onClick attribute can only be added to an activity, so if we have a fragment, we would have to use an anonymous class.
    If we would like to move the onClick listener to a separate class (maybe if it is very complicated and/or we would like to re-use it in different parts of our application), then we wouldn’t want to use the xml attribute either.
    35



     */

//        app1 = (Button) findViewById(R.id.app1);
//        app2 = (Button) findViewById(R.id.app2);
//        app3 = (Button) findViewById(R.id.app3);
//        app4 = (Button) findViewById(R.id.app4);
//        app5 = (Button) findViewById(R.id.app5);
//        app6 = (Button) findViewById(R.id.app6);

//        app1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Spotify Streamer", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        app2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Scores App", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        app3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Library App", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        app4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Build It Bigger", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        app5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "XYZ Reader", Snackbar.LENGTH_SHORT).show();
//            }
//        });
//        app6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "CapStone", Snackbar.LENGTH_SHORT).show();
//            }
//        });




}
