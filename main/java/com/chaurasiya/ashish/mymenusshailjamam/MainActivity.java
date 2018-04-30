package com.chaurasiya.ashish.mymenusshailjamam;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.image);
        btn=findViewById(R.id.button);
        registerForContextMenu(iv);

      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              PopupMenu popupMenu=new PopupMenu(MainActivity.this,btn);
              popupMenu.getMenuInflater().inflate(R.menu.menu_item,popupMenu.getMenu());
              popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                  @Override
                  public boolean onMenuItemClick(MenuItem item) {
                      Toast.makeText(MainActivity.this,"You clicked",Toast.LENGTH_LONG).show();
                      return true;
                  }
              });
              popupMenu.show();
          }
      });
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        // getMenuInflater().inflate(R.menu.menu,menu);
        // super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,"Save");
        menu.add(0,2,1,"Download");
        menu.add(0,3,2,"reset");


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int k=item.getItemId();
        switch (k){
            case 1:
                Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

            case 3:
                Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
