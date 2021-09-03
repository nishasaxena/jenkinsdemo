package com.nisha.restAPIMain.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nisha.restAPIMain.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

}
