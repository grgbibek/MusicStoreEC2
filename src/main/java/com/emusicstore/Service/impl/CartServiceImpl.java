package com.emusicstore.Service.impl;

import com.emusicstore.Service.CartService;
import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by grgbibek22 on 8/9/2017.
 */
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        //to do

    }
}
