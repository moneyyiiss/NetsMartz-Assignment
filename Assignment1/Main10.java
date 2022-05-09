

class Main10{
	public static void main(String[] args) {
		box b = new box();
		b.setValue(2, 5, 6);
		b.area();
		b.volume();
	}
}
class box3d{
	int l;
	int b;
	int h;
	void setValue(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
}
class box extends box3d{
	void area() {
		System.out.println(2*l*b*h+2*l*h+2*h*b);
	}
	void volume() {
		System.out.println(l*b*h);
	}
}
