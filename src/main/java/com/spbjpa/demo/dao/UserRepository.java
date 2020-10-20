package com.spbjpa.demo.dao;

import com.spbjpa.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User,Integer>{
    @Query(value = "SELECT * FROM android_cet4 WHERE id=:id",nativeQuery = true)
    List<User> getAll(@Param("id")String id);

}
