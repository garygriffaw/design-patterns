package com.garygriffaw.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return (index < productCollection.products.size());
        }

        @Override
        public Object current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            if(!hasNext())
                throw new NoSuchElementException();

            index++;
        }
    }
}
