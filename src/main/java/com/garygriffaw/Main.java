package com.garygriffaw;

import com.garygriffaw.iterator.Iterator;
import com.garygriffaw.iterator.Product;
import com.garygriffaw.iterator.ProductCollection;
import com.garygriffaw.state.DirectionService;
import com.garygriffaw.state.DrivingMode;
import com.garygriffaw.state.WalkingMode;

public class Main {

    public static void main(String[] args) {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "desktop computer"));
        productCollection.add(new Product(2, "laptop computer"));
        productCollection.add(new Product(3, "mouse"));

        Iterator<Product> iterator =productCollection.createIterator();
        while(iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }

    }

}
