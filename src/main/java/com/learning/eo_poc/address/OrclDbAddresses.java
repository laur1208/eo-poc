package com.learning.eo_poc.address;

import org.springframework.stereotype.Component;

import javax.json.JsonObject;
import java.util.Iterator;

@Component
public class OrclDbAddresses implements Addresses {

    //future datasource reference

    @Override
    public Address create(JsonObject address) {
        //future insert logic
        return null;
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
