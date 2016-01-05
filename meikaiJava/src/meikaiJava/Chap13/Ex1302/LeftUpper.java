package meikaiJava.Chap13.Ex1302;

public class LeftUpper extends IsoscelesRightTriangle{
	public LeftUpper(int height) {
		super(height);
	}

	@Override
	public void draw() {
		for(int i=0;i<getHeight();i++){
			for (int j = 0; j < getHeight(); j++) {
				if(getHeight()-i>j){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
	
	public String toString() {
		return "LeftUpper(height:" + getHeight() + ")"; 
	}
}
