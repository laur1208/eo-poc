package com.learning.eo_poc.address;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.StringReader;

@JsonDeserialize(using = InputAddressDeserializer.class)
final class InputJsonAddress extends JsonResource implements AddressInput {

    InputJsonAddress(String json) {
        this(Json.createReader(new StringReader(json)).readObject());
    }

    InputJsonAddress(JsonObject address) {
        super(address);
    }

    @Override
    public String city() {
        return this.getString("city");
    }

    @Override
    public String street() {
        return this.getString("street");
    }

    @Override
    public String nr() {
        return this.getString("nr");
    }
}
