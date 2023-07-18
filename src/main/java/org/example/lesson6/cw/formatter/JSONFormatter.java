package org.example.lesson6.cw.formatter;

import org.example.lesson6.cw.book.ElectronBook;

public class JSONFormatter implements Formatter{
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в JSON");
    }
}
