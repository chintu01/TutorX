package com.sreyans.tutorx.Teacher.OfflineDataBase;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Tutions")
public class Tution {

    @PrimaryKey
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String SubjectName;

   @ColumnInfo(name="Alias Tution name")
   private String AliasName;

   private String TutorName;

   private String TutorQualification;

   private String Years_of_Experience;

    public int getId() {
        return id;
    }

    private String Address;

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getAliasName() {
        return AliasName;
    }

    public void setAliasName(String aliasName) {
        AliasName = aliasName;
    }

    public String getTutorName() {
        return TutorName;
    }

    public void setTutorName(String tutorName) {
        TutorName = tutorName;
    }

    public String getTutorQualification() {
        return TutorQualification;
    }

    public void setTutorQualification(String tutorQualification) {
        TutorQualification = tutorQualification;
    }

    public String getYears_of_Experience() {
        return Years_of_Experience;
    }

    public void setYears_of_Experience(String years_of_Experience) {
        Years_of_Experience = years_of_Experience;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
