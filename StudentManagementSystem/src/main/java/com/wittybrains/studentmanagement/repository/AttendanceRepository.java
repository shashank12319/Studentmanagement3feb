package com.wittybrains.studentmanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.studentmanagement.model.Attendance;



public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}
