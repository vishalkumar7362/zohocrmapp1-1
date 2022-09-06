package com.zohocrm.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Lead;

public interface LeadRepositiory  extends JpaRepository<Lead,Long> {

}
