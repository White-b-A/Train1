package chapter5;

public class SeaSideLine {

	public static void main(String[] args) {
		Train tr = new Train();

		try{
			tr.goForward(-26);
			System.out.println("成功");
		}catch(ReversePositionException e){
			System.out.println("エラー");
		}
	}

}
