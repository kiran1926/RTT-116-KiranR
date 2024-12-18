package com.example.module309.database.dao;

import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfficeDAO extends JpaRepository<Office, Long> {

    @Query("select o from Office o where o.city = :city")
    List<Office> findByCity(String city);

    Office findByOfficeId(Integer id);

}
