package com.learning.eo_poc.address;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.json.JsonObject;

public interface Address extends JsonObject {
    String id();
    String city();
    String street();
    String nr();
}
