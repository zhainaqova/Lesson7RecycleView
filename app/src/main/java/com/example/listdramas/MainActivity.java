package com.example.listdramas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ArrayList<list_drama> dramas = new ArrayList<list_drama>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        DramaAdapter adapter = new DramaAdapter (this, dramas);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        dramas.add(new list_drama ("Итэвон класс", "драма,мелодрама,бизнес", R.drawable.itevon));
        dramas.add(new list_drama ("Аварийная посадка любви", "драма,мелодрама,комедия", R.drawable.posadka));
        dramas.add(new list_drama ("Бродяга", "драма, криминал, романтика, триллер, детектив", R.drawable.vagabond));
        dramas.add(new list_drama ("Мыслить как преступник", "боевик, триллер, драма, детектив", R.drawable.cm));
        dramas.add(new list_drama ("Королева Чорин", " исторический, комедия, гендерная интрига, фантастика, драма, романтика", R.drawable.mrqueenjpeg));

    }
}

