package com.niittech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niittech.model.Model;

public interface Repository extends JpaRepository<Model,Long>
{
	
}

