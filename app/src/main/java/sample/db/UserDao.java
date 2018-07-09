package sample.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import sample.Model.User;

@Dao
public abstract class UserDao {

    @Query("SELECT * FROM user")
    public abstract User getUser();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void UpdateUser(User user);
}
