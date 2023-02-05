package com.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
