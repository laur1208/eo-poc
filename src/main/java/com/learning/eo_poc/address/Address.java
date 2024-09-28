package com.learning.eo_poc.address;

import javax.json.JsonObject;

public interface Address extends JsonObject {
    String id();
    String city();
    String street();
    String nr();
}
