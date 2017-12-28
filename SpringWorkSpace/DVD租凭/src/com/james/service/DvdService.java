package com.james.service;

import java.util.List;

import com.james.entity.DVD;

public interface DvdService {
	int addDVD(DVD dvd);
	
	DVD queryDVDbyId(Integer id);
	
	List<DVD> queryAllDVDs();
	
	int updateDVD(DVD dvd);
}
