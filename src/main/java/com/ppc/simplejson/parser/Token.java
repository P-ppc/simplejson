package com.ppc.simplejson.parser;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Token {
    private TokenTypeEnum tokenType;
    private String value;
}
