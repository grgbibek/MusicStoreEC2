package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by grgbibek22 on 8/9/2017.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao{

    @Autowired
    private SessionFactory sessionFactory;

    public Cart getCartById(int cartId){
        Session session = sessionFactory.getCurrentSession();

        return (Cart) session.get(Cart.class,cartId);
    }

    public void update(Cart cart){
        //to do later

    }




}
