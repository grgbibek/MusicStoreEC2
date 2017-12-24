package com.emusicstore.Service;

import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;


/**
 * Created by grgbibek22 on 8/9/2017.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
