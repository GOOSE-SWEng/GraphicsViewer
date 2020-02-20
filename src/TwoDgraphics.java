import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.GridPane;

public class TwoDgraphics {
	
	public SubScene creategraphicsWindow(double x,double y) {
		Canvas canvas = new Canvas(1200,700);
		GridPane gp = new GridPane();
		Facet facet = new Facet();
		Line2 line0 = new Line2();
		Line2 line1 = new Line2();
		Line2 line2 = new Line2();
		Line2 line3 = new Line2();
		
		CartesianCoordinate a = new CartesianCoordinate();
		CartesianCoordinate b = new CartesianCoordinate();
		CartesianCoordinate c = new CartesianCoordinate();
		line0.setPosition(0f,0f,1200f,0f);
		line1.setPosition(1200f,0f,1200f,500f);
		line2.setPosition(1200f,500f,0f,500f);
		line3.setPosition(0f,500f,0f,0f);
		
		a.setXY(0,0);
		b.setXY(300,300);
		c.setXY(100,300);
		facet.setPoints(a,b,c);
		gp.add(canvas,0,0);
//		for(int i = 1; i<4;i++) {
//			gp.add(facet.getLine(i),0,0);
//		}
		gp.add(line0,0,0);
		gp.add(line1,0,0);
		gp.add(line2,0,0);
		gp.add(line3,0,0);
		
		SubScene GWin = new SubScene(gp,x,y);
		return(GWin);
	}
}




