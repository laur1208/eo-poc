package com.learning.eo_poc.address;

import javax.json.JsonObject;

public interface Addresses extends Iterable<Address> {
    Address create(AddressInput input);
    Address get(String id);
}
