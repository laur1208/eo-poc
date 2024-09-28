package com.learning.eo_poc.address;

import org.springframework.stereotype.Component;

import javax.json.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@Component
public class OrclDbAddresses implements Addresses {

    //future datasource reference
    private Map<String, Address> addresses = new HashMap<>();

    @Override
    public Address create(AddressInput input) {
        final String id = UUID.randomUUID().toString();
        this.addresses.put(id, new JsonAddress(
            id,
            () -> input
        ));
        return this.addresses.get(id);
    }

    @Override
    public Address get(String id) {
        return null;
    }

    @Override
    public Iterator<Address> iterator() {
        return null;
    }
}
