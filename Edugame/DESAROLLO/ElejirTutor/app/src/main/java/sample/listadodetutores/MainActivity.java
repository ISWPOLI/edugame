package sample.listadodetutores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Person p1 = new Person("ASHA, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p2 = new Person("MARLON, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p3 = new Person("MAURICIO, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p4 = new Person("SANDRA, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p5 = new Person("ALEJANDRA, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p6 = new Person("ERIKA, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p7 = new Person("NINA, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p8 = new Person("CARLOS, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p9 = new Person("JEISSON, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p10 = new Person("MYRIAM, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p11 = new Person("LAIKA, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p12 = new Person("BECKY, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p13 = new Person("JACK, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p14 = new Person("TONY, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p15 = new Person("MELISSA, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p16 = new Person("RICHARD, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p17 = new Person("CINDY, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p18 = new Person("BECKY, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p19 = new Person("DUSTIN, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p20 = new Person("RON, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p21 = new Person("ROB, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p22 = new Person("BOBBIE, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");
        Person p23 = new Person("SACK, 30","COSTO POR HORA $20","SAN DIEGO, CALIFORNIA", "Tutor para Ecología");
        Person p24 = new Person("PAO, 35","COSTO POR HORA $27","LOS ÁNGELES, CALIFORNIA", "Tutor para Cul. Ambiental");


        //Add the Person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);
        peopleList.add(p6);
        peopleList.add(p7);
        peopleList.add(p8);
        peopleList.add(p9);
        peopleList.add(p10);
        peopleList.add(p11);
        peopleList.add(p12);
        peopleList.add(p13);
        peopleList.add(p14);
        peopleList.add(p15);
        peopleList.add(p16);
        peopleList.add(p17);
        peopleList.add(p18);
        peopleList.add(p19);
        peopleList.add(p20);
        peopleList.add(p21);
        peopleList.add(p22);
        peopleList.add(p23);
        peopleList.add(p24);




        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

      public void perform_action(View v) {
          Intent i = new Intent(MainActivity.this, TutorDetails.class);
          startActivity(i);
      }


}



