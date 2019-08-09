package chapter02;

public class GoodsApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.setName("nickon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);

		camera.showInfo();
		
		
		System.out.println(camera.calcDiscountPrice(0.5f));
		
		
		System.out.println(Goods.countOfGoods);
		
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		Goods camera4 = new Goods();
		
		System.out.println(Goods.countOfGoods);
		
		
	}

}
