import java.util.ArrayList;

public class Facet {
	CartesianCoordinate normal;
	CartesianCoordinate v1;
	CartesianCoordinate v2;
	CartesianCoordinate v3;
	
	ArrayList<CartesianCoordinate> points = new ArrayList<CartesianCoordinate>();
	
	private Line2 linea = new Line2();
	private Line2 lineb = new Line2();
	private Line2 linec = new Line2();
	private int scalar = 100;
	
	public Facet(CartesianCoordinate normal, CartesianCoordinate v1, CartesianCoordinate v2, CartesianCoordinate v3) {
		this.normal = normal;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;	
	}
	public Facet() {
		this.normal = null;
		this.v1 = null;
		this.v2 = null;
		this.v3 = null;	
	}

	public CartesianCoordinate getNormal() {
		return normal;
	}

	public void setNormal(CartesianCoordinate normal) {
		this.normal = normal;
	}

	public CartesianCoordinate getV1() {
		return v1;
	}

	public void setV1(CartesianCoordinate v1) {
		this.v1 = v1;
	}

	public CartesianCoordinate getV2() {
		return v2;
	}

	public void setV2(CartesianCoordinate v2) {
		this.v2 = v2;
	}

	public CartesianCoordinate getV3() {
		return v3;
	}

	public void setV3(CartesianCoordinate v3) {
		this.v3 = v3;
	}
	public CartesianCoordinate getPoint(int p) {
		if (p==1) {
			return(v1);
		}
		else if(p==2) {
			return(v2);
		}
		else if(p==3) {
			return(v3);
		}
		else {
			return(null);
		}
	}
	public void setPoint(CartesianCoordinate point, int p) {
		linea.setPositionC(v1,v2);
		if (p ==1) {
			v1 = point;
		}
		else if (p ==2) {
			v2 = point;
		}
		else if (p == 3) {
			v3 = point;
		}
		else {}
	}
	public void setPoints(CartesianCoordinate a, CartesianCoordinate b, CartesianCoordinate c) {
		this.v1 = a;
		this.v2 = b;
		this.v3 = c;
		
	}
	public Line2 getLine(int k) {
		if (k == 1) {
			linea.setPositionC(v1,v2);
			return(linea);
		}
		else if (k ==2) {
			lineb.setPositionC(v2,v3);
			return(lineb);
		}
		else if (k ==3) {
			linec.setPositionC(v3,v1);
			return(linec);
		}
		else{
			return(null);
		}
	}
}
