package com.example.roomdemo;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UniversityDAO {
    @Query("Select * from department")
    public List<Department> getAllDepartments();

    @Query("Select * from course where deptId = :deptId") //getter until specific id
    public List<Course> getCourses(long deptId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)  //if we want to insert instead of update
    public long insertDepartment(Department dept);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCourses(Course... courses);

    @Update
    public void updateDepartment(Department dept);

    @Update
    public void updateCourses(Course... dept);

    @Delete
    public void deleteDepartment(Department dept);

    @Delete
    public void deleteCourses(Course... dept);

}
