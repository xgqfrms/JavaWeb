package second;

public abstract class Shape {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	int x,y;
	public abstract void draw();
	public void setAnchor(int x,int y){
		this.x=x;
		this.y=y;
	}

}
