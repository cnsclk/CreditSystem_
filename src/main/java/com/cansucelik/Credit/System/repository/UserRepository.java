package com.cansucelik.Credit.System.repository;

import com.cansucelik.Credit.System.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
