package springmvc_mybatis_base.biz.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import springmvc_mybatis_base.biz.DbTestService;
import springmvc_mybatis_base.dao.DbTestDAO;
import springmvc_mybatis_base.pojo.DbTestBean;

public class ImplDbTestService implements DbTestService {
	public DbTestDAO dao;

	public void setDao(DbTestDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void test() {
		System.out.println(this);
		dao.test();
		List<DbTestBean> list = dao.getHours();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId_hour());
		}
	}
}
