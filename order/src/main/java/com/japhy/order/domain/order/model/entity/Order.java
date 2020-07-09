package com.japhy.order.domain.order.model.entity;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Order.
 *
 * @author Japhy
 * @since 2020/4/5 08:37
 */
@ApiModel
@ToString
@Builder
@Getter
public class Order {

    @ApiModelProperty(name = "order id")
    private Long id;

    @ApiModelProperty(name = "order no")
    private String orderNo;

    @ApiModelProperty(name = "order name")
    private String name;

    public static List<Order> dict() {
        Order order1 = Order.builder().id(1L).name("order1aa").orderNo("0001").build();
        Order order2 = Order.builder().id(2L).name("order2ab").orderNo("0002").build();
        Order order3 = Order.builder().id(3L).name("order3ac").orderNo("0003").build();
        Order order4 = Order.builder().id(4L).name("order4bc").orderNo("0004").build();
        return Lists.newArrayList(order1, order2, order3, order4);
    }

}
