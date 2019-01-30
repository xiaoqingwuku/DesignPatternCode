package com.zyxcba.diagrammatize;


import java.util.ArrayList;
import java.util.List;

/**
 * class_name: BookShelf
 * package: com.zyxcba
 * describe: 书架类
 * creat_user: Felix.Wang
 * creat_date: 2019/1/29
 * creat_time: 14:43
 **/

public class BookShelf implements Aggregate {

    private List<Book> books;


    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
