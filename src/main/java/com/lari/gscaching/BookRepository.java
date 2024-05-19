package com.lari.gscaching;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
