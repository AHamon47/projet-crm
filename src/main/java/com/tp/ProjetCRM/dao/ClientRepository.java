package com.tp.ProjetCRM.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tp.ProjetCRM.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
