package springmvc_mybatis_base.dao;

import java.util.List;

import springmvc_mybatis_base.pojo.DbTestBean;

public interface DbTestDAO {
	void test();

	List<DbTestBean> getHours();
}
