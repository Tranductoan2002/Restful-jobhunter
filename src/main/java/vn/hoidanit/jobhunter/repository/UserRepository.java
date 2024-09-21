package vn.hoidanit.jobhunter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.hoidanit.jobhunter.domain.User;

public interface UserRepository  extends JpaRepository<User,Long>{
    
}
