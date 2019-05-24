package com.sreyans.tutorx.Teacher.OfflineDataBase;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Tution.class,version = 1)
public abstract class TutionDataBase extends RoomDatabase {

    public abstract TutionDao tutionDao();
}
