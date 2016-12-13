package ex;

/* 公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，該如何選購獎品，使得總花費最少且不超過預算?
說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據，第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， k 代表有 k 件物品可供選購。第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。
對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，則列印 “Impossible”，最後必須有換行字元

 * Date: 2016/12/12
 * Author: 105021056  王家恩
 */
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t;// 預算
		int m;// 員工數
		int k;// 幾種物品
		int x = 0;
		for (int i = 0; i < n; i++) {
			t = scn.nextInt();
			m = scn.nextInt();
			k = scn.nextInt();
			int data[] = new int[k];
			for (int j = 0; j < k; j++) { // 輸入k種售價
				data[j] = scn.nextInt();
			}

			for (int a = 0; a < data.length - 1; a++) { // 氣泡排序
				for (int b = 0; b < data.length - 1 - i; b++) {
					if (data[b + 1] < data[b]) {
						int temp = data[b + 1];
						data[b + 1] = data[b];
						data[b] = temp;
					}
				}
			}
			for (int u = 0; u < data.length; u++) {
				System.out.print(data[u] + " ");
			}
			System.out.println();
			for (int c = 0; c < m; c++) { // 加出前m個數的總和
				x = data[c] + x;

			}

			// System.out.println(x);
			if (x <= t) { // 判斷是否小於等於t
				System.out.println(x);
			} else if (x > t) {
				System.out.println("Impossible");
			}
			x = 0;
		}

	}
}