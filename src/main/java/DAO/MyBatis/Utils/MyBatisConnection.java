package DAO.MyBatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class MyBatisConnection {
    final static Logger LOG = Logger.getLogger(MyBatisConnection.class);
    private SqlSessionFactory sqlSessionFactory;
    private Reader reader = null;

    public org.apache.ibatis.session.SqlSessionFactory getSqlSessionFactory() {
        try {
            reader = Resources.getResourceAsReader("mybatisconfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            LOG.error("IOException", e);
        }
        return sqlSessionFactory;
    }
}
