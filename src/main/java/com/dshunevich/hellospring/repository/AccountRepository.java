package com.dshunevich.hellospring.repository;

import com.dshunevich.hellospring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {



}
