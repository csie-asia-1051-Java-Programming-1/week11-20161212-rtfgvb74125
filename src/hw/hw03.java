package hw;
/*請撰寫一個二元樹的程式，建立 BinTree class 及 Node class，並提供前序、中序及後序搜尋以顯示資料。
 * Date: 2016/12/12
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw03 {
private static BinTree  bTree;
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char contChar = 'Y';
		float v1 = 0;
		boolean flag = true;
		while(contChar=='Y'||contChar=='y'){
			flag = true;
			System.out.print("Number");
			v1 = scn.nextInt();
			if(bTree==null){
				bTree=new BinTree(v1);
			}else{
				bTree.addNode(v1);
			}
			bTree.inOrder(bTree.root);
			System.out.println();
			System.out.println("輸入y/n");
			contChar=scn.next().charAt(0);
			
		}
		System.out.println("程式已結束");
	}
}