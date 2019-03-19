package Lab;


public class Cal {
	
	public boolean coin ( int money ){
		
		if ( money >= 50 ){
			money -= 50;
			if ( judge(money) ) {
				return true;
			}
		}
        if( money >= 20 ){
			money -= 20;
			if ( judge(money) ) {
				return true;
			}
		} 
        if( money >= 5 ){
			money -= 5;
			if ( judge(money) ) {
				return true;
			}
		}
        if( money >= 5){
			money -= 5;
			if ( judge(money) ) {
				return true;
			}
		}
        if( money >= 1 ){
			money -= 1;
			if ( judge(money) ) {
				return true;
			}
		}
        if( money >= 1 ){
			money -= 1;
			if ( judge(money) ) {
				return true;
			}
		}
        if( money >= 1 ){
			money -= 1;
			if ( judge(money) ) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean judge ( int money ){
		
		if ( money == 0 ){
			return true; 
		}else {
			return false;
		}
	}

}
