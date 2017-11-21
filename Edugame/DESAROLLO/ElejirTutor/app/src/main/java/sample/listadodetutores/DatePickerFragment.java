package sample.listadodetutores;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment
         implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {

        TextView tv1= (TextView) getActivity().findViewById(R.id.textView7);
        tv1.setText("Reservado!   Detalles: Año: "+view.getYear()+"  Mes: "+view.getMonth()+"  Día: "+view.getDayOfMonth());

    }
}