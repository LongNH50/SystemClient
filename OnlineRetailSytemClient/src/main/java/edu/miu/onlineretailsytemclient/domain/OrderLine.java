package edu.miu.onlineretailsytemclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {

    private int id;

    private Item item;

    private int quantity;
    private double discount;

}
