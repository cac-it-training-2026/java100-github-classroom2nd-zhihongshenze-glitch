/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + sum1);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * num4) + "・・・　" + (int) (((250 * num4) / sum1) * 100) + "％");
		System.out.println("ショコラ      \\" + (int) (280 * num5) + "・・・　" + (int) (((280 * num5) / sum1) * 100) + "％");
		System.out.println("ピスターシュ  \\" + (int) (320 * num6) + "・・・　" + (int) (((320 * num6) / sum1) * 100) + "％");
	}

}
