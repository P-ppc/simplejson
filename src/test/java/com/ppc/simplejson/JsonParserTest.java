package com.ppc.simplejson;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonParserTest {

    @Test
    public void fromJson() throws IOException {
        String jsonString = "{\"name\": \"ppc\", \"age\": 20, \"score\": [10, -10, -11.02, -2e+3, \"100\"]}";
        JsonParser jsonParser = new JsonParser();

        JsonObject jsonObject = (JsonObject) jsonParser.fromJSON(jsonString);
        assertEquals("ppc", jsonObject.get("name"));
        assertEquals(20, jsonObject.get("age"));
        assertEquals(-11.02, jsonObject.getJsonArray("score").get(2));
        assertEquals(-2e+3, jsonObject.getJsonArray("score").get(3));
    }
}
