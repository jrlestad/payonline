package com.payonlinesimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payonlinesimplificado.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
