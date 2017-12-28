package com.james.dao;

import java.util.List;

import com.james.entity.DVD;

public interface DvdDao {
	
	int addDVD(DVD dvd);
	
	DVD queryDVDbyId(Integer id);
	
	List<DVD> queryAllDVDs();
	
	int updateDVD(DVD dvd);
	
}
