package com.plateer.store.mybatis.mapper;

import com.plateer.domain.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderStoreMapper {

    List<OrderDto> findAll(String userid);
    OrderDto retriveOne(String orderid);
    int getLatestOrderId();
    int createNewOrder(OrderDto orderDto);
}
