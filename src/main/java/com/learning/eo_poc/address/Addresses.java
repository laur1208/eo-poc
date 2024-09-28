package com.learning.eo_poc.address;

import javax.json.JsonObject;

public interface Addresses extends Iterable<Address> {
    Address create(JsonObject address);
    Address get(String id);
}
