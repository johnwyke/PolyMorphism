import java.awt.*; 
import javax.swing.*; 
import java.util.*;

public class PolyDemo extends JFrame {

	private ArrayList <Shape> list = new ArrayList<Shape>();
	
	public PolyDemo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list.add(new Circle(Color.RED, 50));
		list.add( new Rectangle(Color.blue, 20, 100));
		list.add( new Triangle(Color.green, 10,35,50,150,200,50));
		
		add(new Picture());
		setSize(400, 500);
		setVisible(true);
	}
	
	public class Picture extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			for(Shape s : list)
				s.draw(g);
			
		}
	}
	
	public static void main(String[] args) 
	{
		new PolyDemo();

	}

}
