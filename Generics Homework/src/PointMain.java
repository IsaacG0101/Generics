
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point <Integer> a = new Point<>(5,6) ;
		Point<Number> b = new Point<>(10,9);
		PointList<Integer, Point<Integer>> c = new PointList<>();
	//	PointList<? extends Number, Point<S>> d = new PointList<>();
		c.add(a);
		//d.add(a);
		
		
	}

	

}
