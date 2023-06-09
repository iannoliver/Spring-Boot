package com.projetopessoal.userdept;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetopessoal.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
