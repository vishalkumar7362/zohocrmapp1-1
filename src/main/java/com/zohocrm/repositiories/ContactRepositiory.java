package com.zohocrm.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contact;

public interface ContactRepositiory  extends JpaRepository<Contact,Long> {

}
