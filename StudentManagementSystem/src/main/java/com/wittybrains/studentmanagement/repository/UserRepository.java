package com.wittybrains.studentmanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;


//public interface  UserRepository extends JpaRepository< User, Long> {
//	boolean existsByName(String name);
//}
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wittybrains.studentmanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT case when count(u) > 0 then true else false end FROM User u WHERE u.name = :name")
    boolean existsByName(@Param("name") String name);
}
