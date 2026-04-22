/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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
		int num4 = Integer.parseInt(str1);

		System.out.print("ショコラ      >");

		String str2 = reader.readLine();
		int num5 = Integer.parseInt(str2);

		System.out.print("ピスターシュ  >");

		String str3 = reader.readLine();
		int num6 = Integer.parseInt(str3);

		int sum = num4 + num5 + num6;
		int sum1 = num4 * 250 + num5 * 280 + num6 * 320;

		System.out.println("\nシトロン      " + num4 + "個");
		System.out.println("ショコラ      " + num5 + "個");
		System.out.println("ピスターシュ  " + num6 + "個\n");
		System.out.println("合計個数      " + sum + "個");
		System.out.println("合計金額      " + sum1 + "円\n");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

	}

}
