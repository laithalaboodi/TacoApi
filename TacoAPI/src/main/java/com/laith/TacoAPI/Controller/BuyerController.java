
package com.laith.TacoAPI.Controller;

import java.util.HashMap;

import java.util.Map;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laith.TacoAPI.Model.Order;


@RestController
public class BuyerController {


    @PostMapping("/order")
    public Map<String, Double> getOrder1Total(@RequestBody Order order) {
        Assert.notNull(order, "order cannot be null");
        HashMap<String, Double> map = new HashMap<>();
        map.put("order total", order.getOrderTotal());

        return map;
    }
}
