/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex30;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;

public class CollectionSequence implements Collection {

    private Pet[] pets = { new Pet("Fox"), new Pet("Wolf"), new Pet("Fish"), new Pet("Duck") };

    @Override    
    public int size() { return pets.length; }
    
    @Override
    public boolean isEmpty() {
        return pets.length == 0;
    }
    
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
        };
    }
    
    @Override
    public boolean contains(Object o) {
        if(!(o instanceof Pet)) return false;
        if(isEmpty()) return false;
        final Pet pet = (Pet) o;
        boolean isTherePet = false;
        for(Pet p: pets) {
            if(p == pet)
                isTherePet = true;
        }
        return isTherePet;
    }
    
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        if(!(e instanceof Pet)) return false;
        Pet[] arrExt = new Pet[pets.length+1];
        for(int i = 0; i < pets.length; i++) {
            arrExt[i] = pets[i];
        }
        arrExt[pets.length] = (Pet) e;
        return true;
        
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
