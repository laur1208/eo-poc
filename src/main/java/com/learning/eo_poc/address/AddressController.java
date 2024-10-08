/**
 * Address controller for CRUD operations
 */
package com.learning.eo_poc.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.json.JsonObject;

@RestController
public class AddressController {

    private final Addresses addresses;

    @Autowired
    public AddressController(Addresses addresses) {
        this.addresses = addresses;
    }


    /**
     * Create address endpoint. Tried JsonObject and also InputJsonAddress on input, but not working
     */
    @PostMapping(
            value = "/address",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Address create(@RequestBody JsonObject address) {
        InputJsonAddress jsonAddress = new InputJsonAddress(address);
        return addresses.create(jsonAddress);
    }

    public Address get(String id) {
        //future get logic
        return null;
    }

}
