package day34;

public class Apple {
	public String type;
	public String color;
	
	public Apple(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	public Apple() {
		
	}
	
	@Override
	public String toString() {
		return "type:" + type + ", color:" + color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Apple objApple = (Apple)obj;
		return this.type.equals(objApple.type) && this.color.equals(objApple.color); 
	}
	
	
}
