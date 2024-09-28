package com.learning.eo_poc.address;

import javax.json.JsonObject;

final class InputJsonAddress extends JsonResource implements Address {
    InputJsonAddress(JsonObject address) {
        super(address);
    }

    @Override
    public String id() {
        return this.getString("id");
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
