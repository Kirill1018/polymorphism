package polymorphism;

public class T {
	String passport, name;
	T(String behalf, String id) {
		this.passport = id;
		this.name = behalf;
	}
	public String toString() { return this.name + " " + this.passport; }
}