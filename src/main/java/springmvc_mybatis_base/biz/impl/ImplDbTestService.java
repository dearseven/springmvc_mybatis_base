package springmvc_mybatis_base.biz.impl;

import org.springframework.transaction.annotation.Transactional;

import springmvc_mybatis_base.biz.DbTestService;
import springmvc_mybatis_base.dao.DbTestDAO;

public class ImplDbTestService implements DbTestService {
	public DbTestDAO dao;

	public void setDao(DbTestDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void test() {
		System.out.println(this);
		dao.test();
	}
}
