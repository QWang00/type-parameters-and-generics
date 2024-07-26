package org.northcoders;

import java.util.List;

public interface BoxOperations<V extends Number & Comparable<V>> {

     V getLargestValue();
     void setLargestValue(V value1, V value2);

     void setLargestValueFromList(List<V> numbers);

}
