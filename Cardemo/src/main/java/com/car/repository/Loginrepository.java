package com.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.model.Login;

@Repository
public interface Loginrepository extends JpaRepository<Login,Integer>{

}
