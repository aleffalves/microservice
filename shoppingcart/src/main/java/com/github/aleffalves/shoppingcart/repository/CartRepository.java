package com.github.aleffalves.shoppingcart.repository;

import com.github.aleffalves.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Integer> {
}
