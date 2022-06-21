package case_StudyModule2.severies;


import case_StudyModule2.model.OrderItem;

import java.util.List;

public interface IOderItemService {


    List<OrderItem> findAll();

    void add(OrderItem newOrderItem);

    void update(OrderItem newOrderItem);

    OrderItem getOrderItemById(int id);


}
