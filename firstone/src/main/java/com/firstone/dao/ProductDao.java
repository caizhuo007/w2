package com.firstone.dao;

import com.firstone.domain.Product;
import com.firstone.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public Product getProduct(String id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.firstone.dao.productmapper.getProduct", 1);
        return null;

    }
}
