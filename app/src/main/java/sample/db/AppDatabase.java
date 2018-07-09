package sample.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import sample.Model.User;

@Database( entities = {User.class}, version = 1 )
public abstract  class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
