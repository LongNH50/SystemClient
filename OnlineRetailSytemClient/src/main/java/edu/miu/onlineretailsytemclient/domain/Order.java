package edu.miu.onlineretailsytemclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;

    private Customer customer;

    private Address shippingAddress;

    private OrderStatus status;

    private List<OrderLine> lineItems = new ArrayList<>();


}
