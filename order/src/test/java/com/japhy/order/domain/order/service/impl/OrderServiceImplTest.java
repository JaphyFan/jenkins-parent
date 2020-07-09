package com.japhy.order.domain.order.service.impl;

import com.japhy.order.domain.order.model.entity.Order;
import com.japhy.order.domain.order.service.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * test.
 *
 * @author Japhy
 * @since 2020/4/5 09:30
 */
@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    void getById() {
        Order order = orderService.getById(2L);
        Assertions.assertThat(order.getOrderNo()).isEqualTo("0002");

    }

    @Test
    void queryByName() {
        // not test
    }

    /**
     * just for test report purpose
     */
    @Test
    void report() {
        Assertions.assertThat(1).isEqualTo(1);
    }
}