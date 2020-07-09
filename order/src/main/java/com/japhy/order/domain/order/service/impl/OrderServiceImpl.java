package com.japhy.order.domain.order.service.impl;

import com.japhy.order.domain.order.model.entity.Order;
import com.japhy.order.domain.order.service.OrderService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * impl.
 *
 * @author Japhy
 * @since 2020/4/5 08:40
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order getById(Long id) {
        Optional<Order> first = Order.dict().stream().filter(order -> order.getId().equals(id))
                .findFirst();
        return first.orElse(Order.builder().build());
    }

    @Override
    public List<Order> queryByName(String name) {
        return Order.dict().stream().filter(order -> order.getName().contains(name))
                .collect(Collectors.toList());
    }
}
