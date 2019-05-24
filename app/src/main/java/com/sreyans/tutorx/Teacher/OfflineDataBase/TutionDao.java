package com.sreyans.tutorx.Teacher.OfflineDataBase;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface TutionDao {

    @Insert
    public void addTution(Tution tution);

}
