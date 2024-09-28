package com.learning.eo_poc.address;

import javax.json.JsonObject;

public interface AddressInput extends JsonObject {
    String city();
    String street();
    String nr();
}
