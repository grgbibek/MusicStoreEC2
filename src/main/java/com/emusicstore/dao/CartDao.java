package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by grgbibek22 on 8/2/2017.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
