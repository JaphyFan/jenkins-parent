package com.japhy.order.domain.order.service;

import com.japhy.order.domain.order.model.Order;
import java.util.List;

/**
 * OrderService.
 * @author Japhy
 * @since 2020/4/5 08:36
 */
public interface OrderService {

    /**
     * single.
     *
     * @param id
     * @return
     */
    Order getById(Long id);

    /**
     * multi.
     *
     * @param name
     * @return
     */
    List<Order> queryByName(String name);

}
