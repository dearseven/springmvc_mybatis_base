package springmvc_mybatis_base.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import springmvc_mybatis_base.dao.DbTestDAO;

public class ImplDbTestDAO implements DbTestDAO {
	private SqlSessionFactory sqlSessionFactory;
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public void test() {
		System.out.println(this);
		System.out.println(sqlSessionFactory);
	}
	
}
