package com.james.service.imple;

import java.util.List;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.dao.DvdDao;
import com.james.entity.DVD;
import com.james.service.DvdService;

@Service("dvdService")
public class DvdServiceImple implements DvdService {
	
	@Autowired
	private DvdDao dvdDao;
	
	@Override
	public int addDVD(DVD dvd) {
		return dvdDao.addDVD(dvd);
	}

	@Override
	public DVD queryDVDbyId(Integer id) {
		return dvdDao.queryDVDbyId(id);
	}

	@Override
	public List<DVD> queryAllDVDs() {
		return dvdDao.queryAllDVDs();
	}

	@Override
	public int updateDVD(DVD dvd) {
		return dvdDao.updateDVD(dvd);
	}

}
