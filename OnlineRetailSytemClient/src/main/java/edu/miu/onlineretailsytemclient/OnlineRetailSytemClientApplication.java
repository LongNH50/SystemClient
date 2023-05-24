package edu.miu.onlineretailsytemclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class OnlineRetailSytemClientApplication  {

//    RestTemplate restTemplate = new RestTemplate();
//
//    @Autowired
//    ModelMapper modelMapper;
//
    public static void main(String[] args) {
        SpringApplication.run(OnlineRetailSytemClientApplication.class, args);
    }
//
//    private String serverUrl = "http://localhost:8080/customers";
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        // --------------------Generate sample data ------------------------------
//
//        ItemResponse item1 = new IndividualItemResponse();
//        item1.setName("Item 1");
//        item1.setDescription("Description of Item 1");
//        item1.setPrice(25.0);
//        item1.setImage(new byte[]{/* image data */});
//        item1.setBarcodeNumber("123456789");
//        item1.setQuantityInStock(5);
//
//        ItemResponse item2 = new IndividualItemResponse();
//        item2.setName("Item 2");
//        item2.setDescription("Description of Item 2");
//        item2.setPrice(20.0);
//        item2.setImage(new byte[]{/* image data */});
//        item2.setBarcodeNumber("987654321");
//        item2.setQuantityInStock(10);
//
//
//        // composite items
//        ItemResponse item3 = new IndividualItemResponse();
//        item3.setName("Item 3");
//        item3.setDescription("Description of Item 3");
//        item3.setPrice(10.0);
//        item3.setImage(new byte[]{/* image data */});
//        item3.setBarcodeNumber("123456789");
//        item3.setQuantityInStock(5);
//
//        ItemResponse item4 = new IndividualItemResponse();
//        item4.setName("Item 2");
//        item4.setDescription("Description of Item 2");
//        item4.setPrice(20.0);
//        item4.setImage(new byte[]{/* image data */});
//        item4.setBarcodeNumber("987654321");
//        item4.setQuantityInStock(10);
//
//        CompositeItemResponse compositeItem = new CompositeItemResponse();
//        compositeItem.setName("Mystery Box");
//        compositeItem.addSubItem(item3);
//        compositeItem.addSubItem(item4);
//        compositeItem.setPrice(compositeItem.getPrice());
//
//
//        // Create reviews
//        ReviewResponse review1 = new ReviewResponse();
//        review1.setTitle("Review 1");
//        review1.setDescription("Description of Review 1");
//        review1.setStars(4);
//        review1.setDate(LocalDateTime.now());
//
//        ReviewResponse review2 = new ReviewResponse();
//        review2.setTitle("Review 2");
//        review2.setDescription("Description of Review 2");
//        review2.setStars(5);
//        review2.setDate(LocalDateTime.now());
//
//        // Create buyer
//        CustomerResponse buyer = new CustomerResponse();
//        buyer.setFirstName("John");
//        buyer.setLastName("Doe");
//        buyer.setEmail("john.doe@example.com");
//
//        List<AddressResponse> shippingAddressList = new ArrayList<>();
//
//        // Create shipping addresses with one default
//        AddressResponse defaultShippingAddress = new AddressResponse();
//        defaultShippingAddress.setId(3);
//        defaultShippingAddress.setCity("City 1");
//        defaultShippingAddress.setStreet("Street 1");
//        defaultShippingAddress.setState("State 1");
//        defaultShippingAddress.setZipCode("12345");
//        defaultShippingAddress.setAddressTypeResponse(AddressTypeResponse.SHIPPING_ADDRESS);
//
//
//        AddressResponse shippingAddress1 = new AddressResponse();
//        shippingAddress1.setId(2);
//        shippingAddress1.setCity("City 2");
//        shippingAddress1.setStreet("Street 2");
//        shippingAddress1.setState("State 2");
//        shippingAddress1.setZipCode("12345");
//        shippingAddress1.setAddressTypeResponse(AddressTypeResponse.SHIPPING_ADDRESS);
//
//        shippingAddressList.add(defaultShippingAddress);
//        shippingAddressList.add(shippingAddress1);
//
//
//        // Create billing address
//        AddressResponse billingAddress = new AddressResponse();
//        billingAddress.setCity("City 3");
//        billingAddress.setId(1);
//        billingAddress.setStreet("Street 3");
//        billingAddress.setState("State 3");
//        billingAddress.setZipCode("12345");
//        billingAddress.setAddressTypeResponse(AddressTypeResponse.BILLING_ADDRESS);
//
//        // Create credit cards
//        List<CreditCardResponse> creditCards = new ArrayList<>();
//
//        CreditCardResponse creditCard1 = new CreditCardResponse();
//        creditCard1.setNumber("1234567890123456");
//        creditCard1.setExpirationDate(LocalDateTime.now());
//        creditCard1.setSecurityCode("123");
//
//        CreditCardResponse creditCard2 = new CreditCardResponse();
//        creditCard2.setNumber("9876543210987654");
//        creditCard2.setExpirationDate(LocalDateTime.now());
//        creditCard2.setSecurityCode("321");
//
//        creditCards.add(creditCard1);
//        creditCards.add(creditCard2);
//        // Create order
//        OrderResponse order = new OrderResponse();
//        order.setCustomer(buyer);
//        order.setShippingAddress(shippingAddress1);
//        order.setStatus(OrderStatusResponse.NEW);
//
//        // Create line items
//        List<OrderLineResponse> orderLines = new ArrayList<>();
//        OrderLineResponse lineItem1 = new OrderLineResponse();
//        lineItem1.setItem(item1);
//        lineItem1.setQuantity(2);
//        lineItem1.setDiscount(0.0);
//
//        OrderLineResponse lineItem2 = new OrderLineResponse();
//        lineItem2.setItem(item2);
//        lineItem2.setQuantity(1);
//        lineItem2.setDiscount(5.0);
//
//        OrderLineResponse lineItem3 = new OrderLineResponse();
//        lineItem3.setItem(compositeItem);
//        lineItem3.setQuantity(1);
//        lineItem3.setDiscount(5.0);
//
//        orderLines.add(lineItem1);
//        orderLines.add(lineItem2);
//        orderLines.add(lineItem3);
//
//        // Establish relationships
////        List<Review> reviewItem1 = new ArrayList<>();
////        reviewItem1.add(review1);
////        item1.setReviews(reviewItem1);
////
////        List<Review> reviewItem2 = new ArrayList<>();
////        reviewItem2.add(review2);
////        item2.setReviews(reviewItem2);
//
//
////        buyer.setShippingAddresses(shippingAddressList);
////        buyer.setDefaultShippingAddress(defaultShippingAddress);
////        buyer.setBillingAddress(billingAddress);
////        buyer.setCreditCards(creditCards);
//
//        order.setLineItems(orderLines);
//        // --------------------Stop Generate sample data ------------------------------
//
//
//        // --------------------Start Create new customer ------------------------------
////        createCustomer(new CustomerResponse("Aaron", "Nguyen", "hlong1230@gmail.com"));
//        // --------------------End Create new customer ------------------------------
//
//
//        // --------------------Start get customer by ID------------------------------
////        getCustomerByID(1);
//        // --------------------Stop get customer by ID------------------------------
//
//
//        // --------------------Start update customer by ID------------------------------
////        updateCustomerByID(1);
//        // --------------------Stop update customer by ID------------------------------
//
//
//        // --------------------Start saveCustomerAddress------------------------------
////        saveCustomerAddress(1,
////                new AddressResponse(1, "123 Main St", "Example City", "Example State", "12345",
////                        AddressType.SHIPPING_ADDRESS));
//        // --------------------Stop Start saveCustomerAddress------------------------------
//        getCustomerAddress(1, 1);
//    }
//
//    public void createCustomer(CustomerResponse customerResponse) {
//        restTemplate.postForLocation(serverUrl, customerResponse);
//    }
//
//    public void getCustomerByID(int customerID) {
//        ResponseEntity<CustomerResponse> responseEntity = restTemplate.getForEntity(serverUrl + "/" + customerID, CustomerResponse.class);
//        if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            CustomerResponse customerResponse = responseEntity.getBody();
//            // Handle the customerResponse as needed
//            System.out.println(customerResponse);
//        } else {
//            // Handle other status codes
//            HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();
//            System.out.println("Error: " + statusCode);
//        }
//        System.out.println(responseEntity);
//    }
//
//    public void updateCustomerByID(int customerID) {
//        CustomerResponse customerResponseUpdate = new CustomerResponse();
//        customerResponseUpdate.setId(1);
//        customerResponseUpdate.setFirstName("Aaron Edit");
//        customerResponseUpdate.setLastName("Nguyen Edit");
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<CustomerResponse> requestEntity = new HttpEntity<>(customerResponseUpdate, headers);
//
//        ResponseEntity<Void> responseEntityUpdate = restTemplate.exchange(serverUrl + "/" + customerID, HttpMethod.PUT, requestEntity, Void.class);
//
//        if (responseEntityUpdate.getStatusCode() == HttpStatus.OK) {
//            // Get the Location header from the response
//            System.out.println(responseEntityUpdate);
//        } else {
//            // Handle other status codes
//            HttpStatus statusCode = (HttpStatus) responseEntityUpdate.getStatusCode();
//            System.out.println("Error: " + statusCode);
//        }
//    }
//
//    public void saveCustomerAddress(int customerID, AddressResponse addressResponse) {
//        String url = serverUrl + "/" + customerID + "/addresses";
//        restTemplate.postForLocation(url, addressResponse);
//    }
//
//    public void getCustomerAddress(int customerID, int addressID) {
//        String url = serverUrl + "/" + customerID + "/addresses";
//        ResponseEntity<Collection<AddressResponse>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Collection<AddressResponse>>() {});
////        ResponseEntity<Collection<AddressResponse>> responseEntity = restTemplate.getForEntity(url, AddressResponse.class);
//        if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            Collection<AddressResponse> addressResponse = responseEntity.getBody();
//            // Handle the customerResponse as needed
//            System.out.println(addressResponse);
//        } else {
//            // Handle other status codes
//            HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();
//            System.out.println("Error: " + statusCode);
//        }
//        System.out.println(responseEntity);
//    }
}
