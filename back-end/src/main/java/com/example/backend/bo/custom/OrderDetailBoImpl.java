package com.example.backend.bo.custom;

import com.example.backend.dao.DAOFactory;
import com.example.backend.dao.custom.OrderDetailDao;
import com.example.backend.dto.ItemDto;
import com.example.backend.dto.OrderDetailDto;
import com.example.backend.entity.Item;
import com.example.backend.entity.OrderDetails;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailBoImpl implements OrderDetailBo {

    OrderDetailDao orderDetailDao = (OrderDetailDao) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.OrderDetail);

    @Override
    public List<OrderDetailDto> getAllOrderDetails() throws SQLException {
        System.out.println("okkom awaaaw");
        List<OrderDetails> orderDetail = orderDetailDao.getAll();

        List<OrderDetailDto> orderDetailDtoList = new ArrayList<>();

        for (OrderDetails orderDetails : orderDetail) {
            orderDetailDtoList.add(
                    new OrderDetailDto(
                            orderDetails.getOrderId(),
                            orderDetails.getItemId(),
                            orderDetails.getQty()
                    )
            );
        }

        return orderDetailDtoList;
    }
}
