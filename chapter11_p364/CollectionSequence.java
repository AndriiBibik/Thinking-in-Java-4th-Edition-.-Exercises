/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p364;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Collection;

public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = { new Pet("Fox"), new Pet("Wolf"), new Pet("Fish"), new Pet("Duck") };
    
    public int size() { return pets.length; }
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            
            public void remove() {
                throw new UnsupportedOperationException();
            }

            
        };
        
    }
    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
    
}
