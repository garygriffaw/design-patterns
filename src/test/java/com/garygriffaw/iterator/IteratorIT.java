package com.garygriffaw.iterator;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IteratorIT {

    @Test
    void validateProductValues() {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "desktop computer"));
        productCollection.add(new Product(73, "laptop computer"));
        productCollection.add(new Product(12, "mouse"));

        Iterator<Product> iterator =productCollection.createIterator();

        var product = iterator.current();
        assertEquals(1, product.getId());
        assertEquals("desktop computer", product.getName());

        iterator.next();
        product = iterator.current();
        assertEquals(73, product.getId());
        assertEquals("laptop computer", product.getName());

        iterator.next();
        product = iterator.current();
        assertEquals(12, product.getId());
        assertEquals("mouse", product.getName());
    }

    @Test
    void validateProductIterations() {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "desktop computer"));
        productCollection.add(new Product(73, "laptop computer"));
        productCollection.add(new Product(12, "mouse"));

        Iterator<Product> iterator = productCollection.createIterator();
        int count = 0;
        while(iterator.hasNext()) {
            count++;
            iterator.next();
        }

        assertEquals(3, count);
    }

    @Test
    void validateZeroIterations() {
        var productCollection = new ProductCollection();

        Iterator<Product> iterator = productCollection.createIterator();
        int count = 0;
        while(iterator.hasNext()) {
            count++;
            iterator.next();
        }

        assertEquals(0, count);
    }


    @Test
    void noSuchElementException() {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "desktop computer"));

        Iterator<Product> iterator = productCollection.createIterator();
        iterator.next();
        assertThrows(NoSuchElementException.class, () -> {iterator.next();});
    }
}