import javafx.scene.shape.Line;

public class Line2 extends Line {
	public void setPosition(double x1,double y1,double x2,double y2) {
		setStartX(x1);
		setStartY(y1);
		setEndX(x2);
		setEndY(y2);
	}
	public void setPositionC(CartesianCoordinate a, CartesianCoordinate b) {
		setStartX(a.getX());
		setStartY(a.getY());
		setEndX(b.getX());
		setEndY(b.getY());
	}
	public void setPositionCAdd(CartesianCoordinate a, CartesianCoordinate b) {
		setStartX(a.getX()+200);
		setStartY(a.getY()+200);
		setEndX(b.getX()+200);
		setEndY(b.getY()+200);
	}
}
