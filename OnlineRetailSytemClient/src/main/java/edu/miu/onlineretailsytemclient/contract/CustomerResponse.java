package edu.miu.onlineretailsytemclient.contract;

import edu.miu.onlineretailsytemclient.domain.Address;
import edu.miu.onlineretailsytemclient.domain.CreditCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private AddressResponse billingAddress;

    private List<AddressResponse> shippingAddresses = new ArrayList<>();

    private List<CreditCardResponse> creditCards = new ArrayList<>();

    List<ReviewResponse> reviewResponses = new ArrayList<>();

    public CustomerResponse(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setDefaultShippingAddress(AddressResponse defaultShippingAddress) {
    }

    //    public CustomerResponse(String aaron, String nguyen, String s, Address billingAddress, List<Address> shippingAddressList, List<CreditCard> creditCards) {
//    }
}
