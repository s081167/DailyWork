package com.eric.jan.day28;
/**
 * 
 * @author Administrator
 *
 */
public class Lunchar {
	private static final int[] INT_ARR = {3,5,7};
	
	public void count(int finalNumber){
		if(finalNumber<=0){
			System.out.println("参数不能小于0");
		}else{
			int[] quenArr = new int[finalNumber];
			
			for(int i=1;i<=finalNumber;i++){
				if( containNumber(i,INT_ARR[0])){
					System.out.println("Fizz");
				}else if(0==i%INT_ARR[0]){
					if(0==i%INT_ARR[1]){
						System.out.println("FizzBuzz");
					}else if(0==i%INT_ARR[2]){
						System.out.println("FizzWhizz");
					}else{
						System.out.println("Fizz");
					}					
				}else if(0==i%INT_ARR[1]){
					if(0==i%INT_ARR[2]){
						System.out.println("BuzzWhizz");
					}else{
						System.out.println("Buzz");
					}
				}else if(0==i%INT_ARR[2]){
					System.out.println("Whizz");
				}else if(0==i%INT_ARR[0] && 0==i%INT_ARR[1]){
					System.out.println("FizzBuzz");
				}else if(0==i%INT_ARR[0] && 0==i%INT_ARR[1] && 0==i%INT_ARR[2]){
					System.out.println("FizzBuzzWhizz");
				}else{
					System.out.println(i);
				}
			}
		}
	}
	
	public boolean containNumber(int wholeNumber, int subNumber){
		return String.valueOf(wholeNumber).contains(String.valueOf(subNumber));	
	}
	
	public static void main(String[] args) {
		Lunchar lunchar = new Lunchar();
		
		lunchar.count(100);
	}
}
