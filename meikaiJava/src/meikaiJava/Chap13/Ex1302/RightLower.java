package meikaiJava.Chap13.Ex1302;

public class RightLower extends IsoscelesRightTriangle{
	public RightLower(int height) {
		super(height);
	}

	@Override
	public void draw() {
		for(int i=1;i<=getHeight();i++){
			for (int j = 0; j < getHeight(); j++) {
				if(getHeight()-i>j){
					System.out.print(' ');
				}else{
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	
	public String toString() {
		return "RihgtLower(height:" + getHeight() + ")"; 
	}
}
