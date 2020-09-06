package com.jay.dao;


import com.jay.domain.FixedDepositDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixedDepositDao extends JpaRepository<FixedDepositDetails, Long> {

}
