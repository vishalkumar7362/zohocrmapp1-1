package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositiories.BillingRepositiory;

@Service
public class BillingServiceImpl implements BillingService {

	
	@Autowired
	 private BillingRepositiory billingRepo;
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

}
