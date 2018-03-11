import java.awt.Color;

public class AustinCircle extends CircleShape {
	private int count;

	public AustinCircle () {
		super();
		this.color=new Color(0,0,182);
		this.count=0;
		this.radius=10;
	}
	
	public void update (double dt) {
		this.x += dt*this.vx;
		this.y += dt*this.vy;		
		
		if (this.x < this.radius || this.x > CircleShape.boardWidth-this.radius || this.y < this.radius || this.y > CircleShape.boardHeight-this.radius){
			this.count++;
		}
		
		if (count%2==1) {
			this.x*= -1;
			this.y*= -1;
		} else if (count%2==1) {
			this.x*= -1;
			this.y*= -1;
		}
		this.keepOnBoard();
	}
}