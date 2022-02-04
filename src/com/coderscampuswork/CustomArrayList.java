package com.coderscampuswork;



public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arrayLength = 0;
	
	@Override
	public boolean add(T item) {
		if (arrayLength == items.length) {
			items = growBackingOfArray();
		}
		items[arrayLength] = item;
		arrayLength++;
		return true;
	}

	private Object[] growBackingOfArray() {
		Object[] newArray = new Object[arrayLength*2];
		for (int i=0; i<arrayLength; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	
	public int getSize() {
		return arrayLength;
	}

	
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= arrayLength) throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
		
		return (T) items[index];
	}
	
}