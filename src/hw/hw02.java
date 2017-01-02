package hw;

/*一個含 N 個整數的序列中，出現頻率超過 N/2 的整數稱為『過半元素』。寫一個程式求一整數序列是否有過半元素(一整數序列以空白鍵隔開數字;0 < N < 11; 序列中的數字都是 integer; 輸入包含多 行，一行為一筆測資。若有 過半元素， 輸出該數; 否則輸出 NO)
 * Date: 2016/12/12
 * Author: 105021056  王家恩
 */
import java.util.Scanner;

public class hw02 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String data[] = str.split(" ");
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i].equals(data[j])) {
					sum++;
				}
			}
			if (sum >= (data.length / 2) && flag==false) {
				System.out.println(data[i]);
				flag = true;
			}
			sum = 0; 
		}
		if(flag==false){
			System.out.println("NO");
		}
	}
}