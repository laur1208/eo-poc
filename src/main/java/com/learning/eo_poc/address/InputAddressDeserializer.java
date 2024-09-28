package com.learning.eo_poc.address;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class InputAddressDeserializer extends StdDeserializer<InputJsonAddress> {
    public InputAddressDeserializer() {
        this(null);
    }

    public InputAddressDeserializer(Class<InputJsonAddress> vc) {
        super(vc);
    }

    @Override
    public InputJsonAddress deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return new InputJsonAddress(node.toString());
    }
}
