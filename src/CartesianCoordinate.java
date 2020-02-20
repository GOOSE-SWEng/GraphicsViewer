
public class CartesianCoordinate {
	double x;
	double y;
	double z;
	int scalar = 10;
	public CartesianCoordinate(double x, double y, double z) {
		this.x = scalar*x;
		this.y = scalar*y;
		this.z = scalar*z;	
	}
	public CartesianCoordinate() {
		this.x = 0;
		this.y = 0;
		this.z = 0;	
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public void setXY(double xtemp, double ytemp) {
		setX(scalar*xtemp);
		setY(scalar*ytemp);
	}
	public void setXYZ(double xtemp, double ytemp, double ztemp) {
		setXY(scalar*xtemp,scalar*ytemp);
		setZ(scalar*ztemp);
	}
	
}
