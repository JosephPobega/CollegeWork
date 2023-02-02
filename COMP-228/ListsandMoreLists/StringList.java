package adts;

public class StringList {
	
	protected String[] list;
	
	protected final int DEFAULT_CAPACITY = 10;
	protected int numElements;
	
	//found and location are set by the find helper method
	protected boolean found;
	protected int location;
	
	
	public StringList() {
		list = new String[DEFAULT_CAPACITY];
		numElements = 0;
	}
	
	public StringList(int capacity) {
		list = new String[capacity];
		numElements = 0;
	}

	public void add(String element) {
		list[numElements] = element;
		numElements++; // i.e, numElements = numElements + 1
	}
	
	public void find(String target) {
		found = false;
		for(location = 0; location < numElements; location++;) {
			if (list[location].equals(target)) {
				found = true;
				break;
			}
		}
	}
	
	public boolean remove(String element) {
		boolean found = false;
		int location = 0; // needs to be set correctly
		
		for (location = 0; location < numElements; location++;) {
			if(list[location].equals(element)) {
				found = true;
				break;
			}
		}
		if (found) {
		list[location] = list[numElements - 1];
		list[numElements - 1] = null;
		numElements--;
		}
		
	}
	
	public boolean contains(String element) {
	find(element);
	return found;
	}
	
	public String get(String element) {
		find(element);
		if (found) {
		return list[location];
		}
		else {
			return null;
		}
	}
	
	public String get(int index) {
		if (index < 0 || index > numElements - 1) {
		return null;
		}
		return list[index];
	}
	
	public String toString() {
		StringBuilder listStr = new StringBuilder("\n-------------\n");
		for (int i = 0; i < numElements; i++) {
			listStr.append(list[i] + "/n");	
		}
		return listStr.toString();
		
	}
	
}
