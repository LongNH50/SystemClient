package edu.miu.onlineretailsytemclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private int id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    private Customer customer;

    private AddressType addressType;

}
