package edu.miu.onlineretailsytemclient.contract;

import edu.miu.onlineretailsytemclient.domain.AddressType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

    private int id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    private CustomerResponse customerResponse;

    private AddressTypeResponse addressTypeResponse;

    public AddressResponse(int id, String street, String city, String state, String zipCode, AddressTypeResponse addressTypeResponse) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.addressTypeResponse = addressTypeResponse;
    }
}
