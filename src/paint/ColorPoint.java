package paint;

public class ColorPoint extends Point{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show();// 부분 재구현시 사용
		System.out.println("X[ " + getX() +" ] , " + "Y[ " + getY() +" ] " + "색 : " + color +"색을 그렸습니다.");
		
	}
	
	
}
