
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inheritanceDemo1();
		//inheritanceDemo2();
		//inheritanceDemo3();
		inheritanceDemo4();
	}
	
		private static void inheritanceDemo4() {
			
		}
	
		private static void	inheritanceDemo3()	{
			GradedActivity g = new GradedActivity();
			g.setScore(90);
			CurvedActivity c = new CurvedActivity(.1);
			c.setScore(90);
			
			GradedActivity [] GradedActivities = {g,c};
			for (GradedActivity currentGradedActivities: GradedActivities) {
				System.out.println(currentGradedActivities.getScore());
			}
			System.out.println(c.getRawScore());
			System.out.println(c.getScore());
			
		}
		
		private static void inheritanceDemo2() {
			Rectangle r = new Rectangle(4,2);
			
			
			Cube c = new Cube(3,6,8);
			Rectangle [] Rectangles = {r,c};
			
			for(Rectangle currentRectangles : Rectangles) {
				System.out.println(currentRectangles.getLength());
				System.out.println(currentRectangles.getWidth());
				System.out.println(currentRectangles.getArea());
			}
		}
		
		private static void inheritanceDemo1() {
		GradedActivity g = new GradedActivity();
		FinalExam f = new FinalExam(10, 2);
		
		GradedActivity [] activities = {g,f};
		
		for(GradedActivity currentActivity : activities) {
			System.out.println("Current Score: " + currentActivity.getScore());
			System.out.println("Current Score: " + currentActivity.getGrade());
		}
	}

}

