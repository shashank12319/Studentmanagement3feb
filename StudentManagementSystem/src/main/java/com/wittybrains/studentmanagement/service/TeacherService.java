package com.wittybrains.studentmanagement.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.wittybrains.studentmanagement.model.Attendance;
import com.wittybrains.studentmanagement.model.Student;
import com.wittybrains.studentmanagement.model.Teacher;
import com.wittybrains.studentmanagement.repository.AttendanceRepository;
import com.wittybrains.studentmanagement.repository.StudentRepository;
import com.wittybrains.studentmanagement.repository.TeacherRepository;
//
//
//@Service
//public class TeacherService {
//
// private final StudentRepository studentRepository;
// private final AttendanceRepository attendanceRepository;
// 
// public TeacherService(StudentRepository studentRepository, AttendanceRepository attendanceRepository) {
//   this.studentRepository = studentRepository;
//   this.attendanceRepository = attendanceRepository;
// }
//
// public void markAttendance(Long studentId) {
//   Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
//   student.setAttendance(true);
//   studentRepository.save(student);
//
//   Attendance attendance = new Attendance();
//   attendance.setStudent(student);
//   attendance.setDate(LocalDate.now());
//   attendance.setStatus(true);
//   attendanceRepository.save(attendance);
// }
//}
//
@Service
public class TeacherService {

 private final TeacherRepository teacherRepository;
 private final StudentRepository studentRepository;
 private final AttendanceRepository attendanceRepository;
 
 public TeacherService(TeacherRepository teacherRepository, StudentRepository studentRepository, AttendanceRepository attendanceRepository) {
   this.teacherRepository = teacherRepository;
   this.studentRepository = studentRepository;
   this.attendanceRepository = attendanceRepository;
 }

 public Teacher saveTeacher(Teacher teacher) {
   return teacherRepository.save(teacher);
 }

 public void markAttendance(Long studentId) {
   Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
   student.setAttendance(true);
   studentRepository.save(student);

   Attendance attendance = new Attendance();
   attendance.setStudent(student);
   attendance.setDate(LocalDate.now());
   attendance.setStatus(true);
   attendanceRepository.save(attendance);
 }
}

