package com.zohocrm.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Billing;

public interface BillingRepositiory extends JpaRepository<Billing, Long> {

}
