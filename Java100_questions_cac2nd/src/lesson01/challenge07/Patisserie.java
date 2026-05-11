/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250　・・・　残り" + num1 + "個");
		System.out.println("ショコラ      \\280　・・・　残り" + num2 + "個");
		System.out.println("ピスターシュ  \\320　・・・　残り" + num3 + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか?　(最大30個まで)\n");
		System.out.print("シトロン      >");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		double num4 = Double.parseDouble(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		double num5 = Double.parseDouble(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		double num6 = Double.parseDouble(str3);

		double sum = num4 + num5 + num6;
		int sum1 = (int) (num4 * 250 + num5 * 280 + num6 * 320);

		System.out.println("\nシトロン      " + num4 + "個");
		System.out.println("ショコラ      " + num5 + "個");
		System.out.println("ピスターシュ  " + num6 + "個\n");
		System.out.println("合計個数      " + sum + "個");
		System.out.println("合計金額      " + sum1 + "円\n");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250　・・・　残り" + (int) (num1 - num4) + "個");
		System.out.println("ショコラ      \\280　・・・　残り" + (int) (num2 - num5) + "個");
		System.out.println("ピスターシュ  \\320　・・・　残り" + (int) (num3 - num6) + "個");

	}

}
