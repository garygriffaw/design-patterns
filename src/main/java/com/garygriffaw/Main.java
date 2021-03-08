package com.garygriffaw;

import com.garygriffaw.memento.Document;
import com.garygriffaw.memento.History;

public class Main {

    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("Hello world");
        document.setFontName("Times New Roman");
        document.setFontSize(10);
        history.push(document.createState());

        document.setContent("Hello world!");
        document.setFontName("Arial");
        document.setFontSize(12);
        history.push(document.createState());

        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document);
    }

}
