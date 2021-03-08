package com.garygriffaw.memento;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class MementoIT {

    @Test
    void validPop() {
        Document document = new Document();
        History history = new History();

        document.setContent("Hello world");
        document.setFontName("Times New Roman");
        document.setFontSize(10);
        history.push(document.createState());

        document.setContent("Hello world!");
        document.setFontName("Arial");
        document.setFontSize(12);

        document.restore(history.pop());

        assertEquals("Hello world", document.getContent());
        assertEquals("Times New Roman", document.getFontName());
        assertEquals(10, document.getFontSize());
    }

    @Test
    void tooManyPops() {
        Document document = new Document();
        History history = new History();

        document.setContent("Hello world");
        document.setFontName("Times New Roman");
        document.setFontSize(10);
        history.push(document.createState());

        document.setContent("Hello world!");
        document.setFontName("Arial");
        document.setFontSize(12);

        document.restore(history.pop());

        assertThrows(EmptyStackException.class, () -> {history.pop();});

    }
}