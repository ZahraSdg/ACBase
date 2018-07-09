package ir.zahrasadeghi.acbase;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import ir.zahrasadeghi.acbase.Util.SharedData;
import sample.db.AppDatabase;


public class App extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "garsondb").build();

        SharedData.init(getSharedPreferences("myPreferences", Context.MODE_PRIVATE));

    }
}
