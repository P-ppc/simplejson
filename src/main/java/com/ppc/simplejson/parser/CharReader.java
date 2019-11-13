package com.ppc.simplejson.parser;

import java.io.IOException;
import java.io.Reader;

public class CharReader {
    private static final int BUFFER_SIZE = 1024;
    private Reader reader;
    private char[] buffer;
    private int pos;
    private int size;

    public CharReader(Reader reader) {
        this.reader = reader;
        buffer = new char[BUFFER_SIZE];
    }

    public char peek() {
        return pos - 1 >= size ? (char) -1 : buffer[Math.max(0, pos - 1)];
    }

    public char next() throws IOException {
        return hasMore() ? buffer[pos++] : (char) -1;
    }

    public void back() {
        pos = Math.max(0, --pos);
    }

    public boolean hasMore() throws IOException {
        if (pos < size) {
            return true;
        }
        fillBuffer();
        return pos < size;
    }

    void fillBuffer() throws IOException {
        int n = reader.read(buffer);
        if (-1 == n) {
            return;
        }

        pos = 0;
        size = n;
    }
}
