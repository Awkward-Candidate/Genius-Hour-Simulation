package Simulation;

import java.awt.Graphics2D;

public class Animation implements SimulationObject {
	
	//make all the objects here
	Bomb norm;
	
	public Animation() {
		
		//initialize all the objects here
		
		norm = new ConventionalExplosive();
		//atom = new 
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//update everything here 
		bombControl();
	}
	
	public void bombControl() {//add stuff here I guess
		if(norm!=null) {
			norm.update();
			
			if(!norm.isFalling) {
				if(norm.isFinished()) {
					norm = null;
					restart();//drops another bomb
				}
			}
		}
	}
	
	public void restart() {
		norm = new ConventionalExplosive();
	}
	@Override
	public void draw(Graphics2D win) {
		// TODO Auto-generated method stub
		//draw everything here 
		if(norm!=null) norm.draw(win);
	}
	
	
	
	

}