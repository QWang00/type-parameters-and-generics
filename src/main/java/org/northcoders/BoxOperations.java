package org.northcoders;

public interface BoxOperations<V extends Number & Comparable<V>> {

     V getLargestValue();
     void setLargestValue(V value1, V value2);
}
