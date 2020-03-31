package com.plateer.service.impl;

import com.plateer.OrderServiceTestApplication;
import com.plateer.domain.orderstate.OrderType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderServiceTestApplication.class)
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Before
    public void before(){

    }

    @Test
    public void test(){
        System.out.println(orderService.findOrderListFromUserid("testid", OrderType.NORMAL));
        System.out.println(orderService.findOrderListFromUserid("testid", OrderType.EXCHANGE));
        System.out.println(orderService.findOrderListFromUserid("testid", OrderType.CANCEL));
        System.out.println(orderService.findOrderListFromUserid("testid", OrderType.RETURN));
    }

    @Test
    public void test2(){
        orderService.changeOrderState("202000012", OrderType.NORMAL, OrderType.CANCEL);
    }
}
