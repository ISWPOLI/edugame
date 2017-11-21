package sample.listadodetutores;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PersonListAdapter extends ArrayAdapter<Person> {

    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView name;
        TextView priceHour;
        TextView ciudad;
        TextView tutoria;
        ImageView imageF;
    }


    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String name = getItem(position).getName();
        String priceHour = getItem(position).getPriceHour();
        String ciudad = getItem(position).getCiudad();
        String tutoria = getItem(position).getTutoria();
        String imageF = getItem(position).getImageF();

        //Create the person object with the information
        Person person = new Person(name,priceHour,ciudad,tutoria,imageF);

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.textView1);
            holder.priceHour = (TextView) convertView.findViewById(R.id.textView2);
            holder.ciudad = (TextView) convertView.findViewById(R.id.textView3);
            holder.tutoria = (TextView) convertView.findViewById(R.id.textView4);
            holder.imageF = (ImageView) convertView.findViewById(R.id.imageView8);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(person.getName());
        holder.priceHour.setText(person.getPriceHour());
        holder.ciudad.setText(person.getCiudad());
        holder.tutoria.setText(person.getTutoria());
        holder.imageF.setImageResource(getImageId(mContext, person.getImageF()));


        return convertView;
    }

    // Devuelve el ID en entero del nombre de la imagen
    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}

























