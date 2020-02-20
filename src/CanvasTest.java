import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class CanvasTest {
	
	ArrayList<Facet> shape = new ArrayList<>();
	
	public SubScene test(int i) {
		Group root = new Group();
		GridPane gp = new GridPane();
		Canvas canvas = new Canvas(1280,684);
		GraphicsContext gc = canvas.getGraphicsContext2D();	
		drawShapes(gc,i);
		root.getChildren().add(canvas);
		gp.add(root,0,0);
		SubScene CWin = new SubScene(gp,1280,684);
		return (CWin);
	}
	
	private void drawShapes(GraphicsContext gc,int rot) {
		shape = StlParser2.getFacets();
		Facet facet0 = new Facet();
		CartesianCoordinate a = new CartesianCoordinate();
		CartesianCoordinate b = new CartesianCoordinate();
		CartesianCoordinate c = new CartesianCoordinate();
		
		a.setXY(0,0);
		b.setXY(300,300);
		c.setXY(0,300);
		facet0.setPoints(a,b,c);
		
		gc.setStroke(Color.MAGENTA);
		gc.setLineWidth(5);
		
		for (int i = 0; i<12; i++) {
			if (shape.get(i).getNormal().getZ()>=0) {
				gc.setStroke(Color.MAGENTA);
				drawFacet(shape.get(i),gc);
			}
		}
	}
	private void lineBetweenPoints(CartesianCoordinate a, CartesianCoordinate b, GraphicsContext gc) {
		gc.strokeLine(a.getX()+200,a.getY()+200,b.getX()+200,b.getY()+200);
	}
	private void drawFacet(Facet f, GraphicsContext gc) {
		lineBetweenPoints(f.getPoint(1),f.getPoint(2),gc);
		lineBetweenPoints(f.getPoint(2),f.getPoint(3),gc);
		lineBetweenPoints(f.getPoint(3),f.getPoint(1),gc);
	}
}
