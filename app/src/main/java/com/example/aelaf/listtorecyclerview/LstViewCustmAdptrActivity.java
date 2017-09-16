package com.example.aelaf.listtorecyclerview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LstViewCustmAdptrActivity extends AppCompatActivity {
private ListView listView ;
    private MyCustomAdapter myCustomAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_view_custm_adptr);
        listView = (ListView) findViewById(R.id.lstViewWitCustomAdapter);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String[] nameList  = {"TeraFormers","Age of UltraViolet","Residential Evil","Colonel JackSparrow","Yahoo In the Bottle"};
        myCustomAdapter = new MyCustomAdapter(this,R.layout.listviewcustomlayoutrow,nameList);
        listView.setAdapter(myCustomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              int tag =   (int)view.getTag();
                Toast.makeText(LstViewCustmAdptrActivity.this,nameList[tag],Toast.LENGTH_SHORT).show();
            }
        });
    }
    private class MyCustomAdapter extends ArrayAdapter<String>
    {
        private Context mContext;

        public MyCustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] movieTitles)
        {
            super(context, resource, movieTitles);
            mContext = context;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
          String name =   getItem(position);
            if (convertView==null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.listviewcustomlayoutrow,parent,false);
            }
            TextView txtTitle = (TextView) convertView.findViewById(R.id.txtTitleCustom);
            TextView txtDetail = (TextView) convertView.findViewById(R.id.txtContentDetail);
            txtTitle.setText(name.substring(0,1));
            txtDetail.setText(name);
            convertView.setTag(position);
            return convertView;
        }
    }
}
