package chapter5;

public class Train{

	long x = 0;					//始点;
	long y = 100;				//終点;

	public	long goForward(long up) throws ReversePositionException{

		if(x>up){
			throw new ReversePositionException();

		}

		if(up>y){
			throw new ReversePositionException();
		}
		return up;
	}
}
