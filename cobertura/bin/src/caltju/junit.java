package caltju;

public class junit {
	 public int judge(int x){
		  if(x < 1 || x > 83) {
	    	  return 0;   //²»ÄÜ
	      }else if(x == 4 || x == 9){
	          return 0;     
	      }else if(x >= 14 && x <= 19) {
	    	  return 0;
	      }else if(x == 24 || x == 29) {
	    	  return 0;
	      }else if(x >= 34 && x <= 49) {
	    	  return 0;
	      }else if(x == 54 || x == 59) {
	    	  return 0;
	      }else if(x >= 64 && x <= 70) {
	    	  return 0;
	      }else if(x == 74 || x == 79) {
	    	  return 0;
	      }else{
	          return 1;    //ÄÜ 
	      }
	 }
}
