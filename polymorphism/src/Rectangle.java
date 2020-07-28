import java.awt.*;
public class Rectangle extends Shape 
{
	private int height, width; 
	
	public Rectangle(Color color, int height, int width)
	{
		super(color);
		this.height = height; 
		this.width = width; 
		
	}
	
	@Override
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawRect(100, 100, width, height);
	}
}
