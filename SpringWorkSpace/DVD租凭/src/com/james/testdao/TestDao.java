package com.james.testdao;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.james.dao.DvdDao;

import com.james.entity.DVD;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring.xml","/spring-mybatis.xml","/spring-mvc.xml"})
public class TestDao {
	@Autowired
	private DvdDao dvdDao;

	

	@Test
	public void testAddDvd() {
		DVD dvd = new DVD(0, "worldwar1", 0, new Date(), "available");
		int res = dvdDao.addDVD(dvd);
		System.out.println(res);
	}
	
	@Test
	public void testQueryByID() {
		DVD dvd = dvdDao.queryDVDbyId(1);
		System.out.println(dvd);
	}
	
	@Test
	public void testQueryAll() {
		List<DVD> list = dvdDao.queryAllDVDs();
		System.out.println(list);
	}
	
	@Test
	public void testUpdate() {
		DVD dvd = new DVD(1, "worldwar1", 1, new Date(), "unavailable");
		int res = dvdDao.updateDVD(dvd);
		System.out.println(res);
	}
}


































