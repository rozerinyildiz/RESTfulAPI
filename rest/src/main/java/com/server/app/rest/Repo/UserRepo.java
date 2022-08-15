package com.server.app.rest.Repo;

import com.server.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

//userrepo get features from jpa.
public interface UserRepo extends JpaRepository<User, Long> {
}
