package com.ppc.simplejson;

import com.ppc.simplejson.parser.CharReader;
import com.ppc.simplejson.parser.TokenList;
import com.ppc.simplejson.parser.Tokenizer;

import java.io.IOException;
import java.io.StringReader;

public class JsonParser {

    private Tokenizer tokenizer = new Tokenizer();

    private Parser parser = new Parser();

    public Object fromJSON(String json) throws IOException {
        CharReader charReader = new CharReader(new StringReader(json));
        TokenList tokenList = tokenizer.tokenize(charReader);
        return parser.parse(tokenList);
    }
}
