package meikaiJava.Chap13.Ex1302;
/*演習13-2
 * 図形クラス群に直角二等辺三角形を表すクラス群を追加せよ.
 * 直角二等辺三角形を表す抽象クラスを作りそこから
 * 右上直角,左上直角,右下直角,左下直角に派生すること
 */
abstract class IsoscelesRightTriangle extends Shape{
	private int height;
	public IsoscelesRightTriangle(int height) {
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	public String toString() {
		return "IsoscelesRightTriangle(height:" + height + ")"; 
	}
}