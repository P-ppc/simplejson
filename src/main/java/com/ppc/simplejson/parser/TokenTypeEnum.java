package com.ppc.simplejson.parser;

import lombok.Getter;

@Getter
public enum TokenTypeEnum {
    BEGIN_OBJECT(1), // {
    END_OBJECT(2), // }
    BEGIN_ARRAY(4), // [
    END_ARRAY(8), // ]
    NULL(16), // null
    NUMBER(32),
    STRING(64),
    BOOLEAN(128),
    SEP_COLON(256), // :
    SEP_COMMA(512), // ,
    END_DOCUMENT(1024);

    private int code;
    TokenTypeEnum(int code) {
        this.code = code;
    }
}
