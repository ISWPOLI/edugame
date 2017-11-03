package com.javatpoint.contextmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView listView1;
	String contacts[]={"nivel1","nivel2","nivel3","nivel4","nivel5"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView1=(ListView)findViewById(R.id.listView1);
        
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        listView1.setAdapter(adapter);
        
        // Register the ListView  for Context menu
        registerForContextMenu(listView1);
    }

    @Override 
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)
    {
            super.onCreateContextMenu(menu, v, menuInfo);
            menu.setHeaderTitle("Select The Action");  
            menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title 
            menu.add(0, v.getId(), 0, "SMS"); 

    } 
    
    @Override  
    public boolean onContextItemSelected(MenuItem item){  
            if(item.getTitle()=="Call"){
            	Toast.makeText(getApplicationContext(),"calling code",Toast.LENGTH_LONG).show();
            }  
            else if(item.getTitle()=="SMS"){
            	Toast.makeText(getApplicationContext(),"sending sms code",Toast.LENGTH_LONG).show();
            }else{
               return false;
            }  
          return true;  
                            
      }  
    
}
