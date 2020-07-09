package com.japhy.order.interfaces.http;

import com.japhy.order.domain.order.model.entity.Order;
import com.japhy.order.domain.order.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * order api class.
 *
 * @author Japhy
 * @since 2020/4/5 08:32
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderApi {

    @Autowired
    private OrderService orderService;

    @GetMapping("/id/{orderId}")
    @ApiOperation(value = "order service", notes = "find order by id")
    @ApiResponse(code = 200, response = Order.class, message = "success")
    public ResponseEntity<Order> getOrderById(
        @ApiParam(value = "order id", required = true) @PathVariable Long orderId) {
        Order order = orderService.getById(orderId);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value = "order service", notes = "find order by name pattern")
    @ApiResponse(code = 200, response = Order.class, message = "success")
    public ResponseEntity<List<Order>> queryOrderByName(
        @ApiParam(value = "name pattern", required = true, example = "aa,ab,ac")
        @PathVariable String name) {
        List<Order> orders = orderService.queryByName(name);
        return ResponseEntity.ok(orders);
    }

}
