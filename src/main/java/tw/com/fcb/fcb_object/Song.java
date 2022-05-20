package tw.com.fcb.fcb_object;

import java.util.Objects;

public class Song {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(name, other.name);
	}
}
