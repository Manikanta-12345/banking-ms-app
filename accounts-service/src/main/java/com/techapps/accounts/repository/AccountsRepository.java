package com.techapps.accounts.repository;

import com.techapps.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Integer> {

     Accounts findByCustomerId(String customerId);
}
