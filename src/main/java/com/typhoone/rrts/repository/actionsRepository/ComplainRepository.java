package com.typhoone.rrts.repository.actionsRepository;

import com.typhoone.rrts.entity.actions.Complain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ComplainRepository extends JpaRepository<Complain, Long> {


    //sql jpa query to get all complain by area in function

    @Query(value = "SELECT * FROM complain WHERE area = ?1", nativeQuery = true)
    List<Complain> findByArea(String area);



}
