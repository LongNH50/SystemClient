package edu.miu.onlineretailsytemclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private Address billingAddress;

    private List<Address> shippingAddresses = new ArrayList<>();

    private Address defaultShippingAddress;

    private List<CreditCard> creditCards = new ArrayList<>();

    List<Review> reviews = new ArrayList<>();

    public void setDefaultShippingAddress(Address address) {
        if (shippingAddresses.contains(address)) {
            defaultShippingAddress = address;
        } else {
            throw new IllegalArgumentException("Address is not associated with the customer");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", billingAddress=" + billingAddress +
                ", shippingAddresses=" + shippingAddresses +
                ", defaultShippingAddress=" + defaultShippingAddress +
                ", creditCards=" + creditCards +
                ", reviews=" + reviews +
                '}';
    }
}
