package com.learning.eo_poc.address;

import javax.json.JsonObject;
import java.util.function.Supplier;

public class JsonAddress extends JsonResource implements Address {
    private final String id;
    JsonAddress(String id, Supplier<JsonObject> resource) {
        super(resource);
        this.id = id;
    }

    @Override
    public String id() {
        return this.id;
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
