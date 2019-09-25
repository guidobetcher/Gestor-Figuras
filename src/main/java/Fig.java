public abstract class Fig implements  Comparable<Fig>{
	public abstract double area();

	public int compareTo(Fig o) {
		return (int)(this.area()-o.area());
	}
}


