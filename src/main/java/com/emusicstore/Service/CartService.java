package com.emusicstore.Service;

import com.emusicstore.model.Cart;

/**
 * Created by grgbibek22 on 8/9/2017.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
