package org.example.lesson6.cw.search;


import org.example.lesson6.cw.book.Book;

import java.util.List;


public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
