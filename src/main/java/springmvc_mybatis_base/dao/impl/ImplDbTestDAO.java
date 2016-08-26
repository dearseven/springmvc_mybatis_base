package springmvc_mybatis_base.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import springmvc_mybatis_base.dao.DbTestDAO;
import springmvc_mybatis_base.pojo.DbTestBean;

public class ImplDbTestDAO extends SqlSessionDaoSupport implements DbTestDAO {
	// private SqlSessionFactory sqlSessionFactory;
	// public SqlSessionFactory getSqlSessionFactory() {
	// return sqlSessionFactory;
	// }
	// public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	// this.sqlSessionFactory = sqlSessionFactory;
	// }

	public void test() {
		System.out.println(this);

	}

	public List<DbTestBean> getHours() {
		try {
			DbTestBean p = new DbTestBean();
			p.setId_hour(12);
			List<DbTestBean> list = getSqlSession()
					.selectList(
							"springmvc_mybatis_base.dao.impl.ImplDbTestDAO.getHours",
							p);
			return list;
		} catch (Exception e) {
		} finally {

		}
		return new ArrayList<DbTestBean>(0);
	}

}
