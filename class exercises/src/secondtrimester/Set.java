package secondtrimester;

// CODIGO DE IVAN

public class Set {
	private int[] content;
	private int capacity;
	private int size;
	private static final int DEFAULT_CAPACITY = 16;

	Set() {
		this(DEFAULT_CAPACITY);
	}

	Set(int capacity) {
		this.capacity = capacity;
		content = new int[this.capacity];
	}

	Set(int[] content) {
		this.content = content;
		capacity = content.length;
		size = content.length;
	}

	private void arrange(int position) {
		for (int i = position; i < size - 1; i++) {
			content[i] = content[i + 1];
		}
		content[size - 1] = 0;
	}

	private boolean dump(Set c) {
		boolean successful = true;
		for (int i = 0; i < c.size; i++) {
			successful = addElement(c.content[i]);
		}
		return successful;
	}

	public boolean isEmpty() {
		return (content[0] == 0);
	}

	public String toString() {
		String output = "";
		if (!isEmpty()) {
			for (int i = 0; i < size; i++) {
				output += content[i];
			}
		}
		return output;
	}

	public boolean belongs(int x) {
		for (int i = 0; i < content.length; i++) {
			if (content[i] == x) {
				return true;
			}
		}
		return false;
	}

	public boolean addElement(int x) {
		if (size < capacity) {
			content[size] = x;
			size++;
			return true;
		} else {
			return false;
		}
	}

	public boolean removeElement(int x) {
		if (!isEmpty()) {
			for (int i = 0; i < size; i++) {
				if (content[i] == x) {
					arrange(i);
					size--;
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	public int cardinality() {
		return size;
	}

	public boolean equal(Set c) {
		for (int i = 0; i < size; i++) {
			int j = 0;
			boolean match = false;
			while (!match && j < c.size) {
				if (content[i] == c.content[j]) {
					match = true;
				}
				j++;
			}
			if (!match) {
				return false;
			}
		}
		return true;
	}

	public boolean isSubSet(Set c) {
		for (int i = 0; i < c.size; i++) {
			int j = 0;
			boolean match = false;
			while (!match && j < size) {
				if (c.content[i] == content[j]) {
					match = true;
				}
				j++;
			}
			if (!match) {
				return false;
			}
		}
		return true;
	}

	public Set merge(Set c) {
		Set output = new Set(capacity + c.capacity);
		output.dump(this);
		output.dump(c);
		return output;
	}

	public Set intersection(Set c) {
		Set output = new Set(c.capacity);
		for (int i = 0; i < c.size; i++) {
			if (belongs(c.content[i])) {
				output.addElement(c.content[i]);
			}
		}
		return output;
	}

	public Set difference(Set c) {
		Set output = new Set(capacity);
		for (int i = 0; i < size; i++) {
			if (!c.belongs(content[i])) {
				output.addElement(content[i]);
			}
		}
		return output;
	}
}