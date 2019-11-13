package com.ppc.simplejson.parser;

import java.util.ArrayList;
import java.util.List;

public class TokenList {
    private List<Token> tokenList = new ArrayList<>();
    private int pos = 0;

    public void add(Token token) {
        tokenList.add(token);
    }

    public Token peek() {
        return pos < tokenList.size() ? tokenList.get(pos) : null;
    }

    public Token peekPrevious() {
        return pos - 1 < 0 ? null : tokenList.get(pos - 2);
    }

    public Token next() {
        return tokenList.get(pos++);
    }

    public boolean hasMore() {
        return pos < tokenList.size();
    }
}
