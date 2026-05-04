

package com.palle1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.palle1.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}