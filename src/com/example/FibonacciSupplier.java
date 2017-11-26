package com.example;
import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 * 
 * 
 * 完成一个上台阶的问题，一个人每次可以上1、2或者3级台阶，问10级台阶有多少种上法。
 */
public class FibonacciSupplier implements Supplier<Long> {

	private long f1=0;
	private long f2=0;
	private long f3=1;
	
	/*private long f1 = 1;
	private long f2 = 1;
	private long n=0;*/
	@Override
	public Long get() {
		long f=f3+f2+f1;
		f3=f2;
		f2=f1;
		f1=f;
		return f;
	}
	
	
	/*@Override
	 一个人每次可以上1或2级台阶，问10级台阶有多少种上法。
	public Long get() {
		if(n==0||n==1) {
			n++;
			return 1l;
	}
	
		long f;
		f=f1+f2;
		f1=f2;
		f2=f;
		n++;
		return f;
	
	
	
	}*/
  
}
