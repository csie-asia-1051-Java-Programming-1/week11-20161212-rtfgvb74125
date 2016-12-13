package ex;
/*
 * Date: 2016/12/12
 * Author: 105021056  王家恩
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class ex02 {
	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		
		int size = scn.nextInt();
		double data[] = new double[size];
		double x = 0;
		for(int i = 0;i<data.length;i++){
			data[i] = scn.nextInt();
		}
			for(int j = 0;j<data.length;j++){
				x = x+data[j];
			}
			
			x = (x/(double)size);
			
		
		System.out.println(df.format(x));
	}
}