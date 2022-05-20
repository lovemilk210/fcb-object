package tw.com.fcb.fcb_object;

public class StringApp {

	public static void main(String[] args) {
		String a = "Hello!";
		String b = "Hello!";

		System.out.println(a == b);

		String c = new String("Hello!");
		String d = new String("Hello!");
		System.out.println(c == d);
		System.out.println("c.equals(d) = " + c.equals(d));

		Song song1 = new Song();
		song1.setName("ABC");

		Song song2 = new Song();
		song2.setName("ABC");

		// 比位置
		System.out.println(song1 == song2);
		// 比值(但值是物件 song1 song2)
		System.out.println("song1.equals(song2) = " + song1.equals(song2));
		// 比值 而且get剛剛set的name
		System.out.println("song1.equals(song2) = " + song1.getName().equals(song2.getName()));

		// concat 將字串相加
		String str1 = "Hello ".concat("Kitty");
		System.out.println("str1 = " + str1);

		int number10 = 10;
		String str2 = String.valueOf(number10);
		String str3 = Integer.toString(number10);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);

		String str4 = "This is a book. That is a pen.";
		// 找尋她出現的第一個位置 從0開始 如果沒有 會出現-1
		int indexPosition = str4.indexOf("book");
		System.out.println("indexPosition = " + indexPosition);

		// 不是看位元 是看位置 所以中文也是1個
		str4 = "This is 一 book. That is a pen.";
		indexPosition = str4.indexOf("book");
		System.out.println("indexPosition = " + indexPosition);

		// 從第幾個開始往後印出
		System.out.println("str4.substring(10) = " + str4.substring(10));

		// 跟cobol不一樣哦 他是印第10~14 不是從10開始印14個字
		System.out.println("str4.substring(10,14) = " + str4.substring(10, 14));

		// 以分隔號去拆成陣列
		String str5 = ("1, First Bank, 02-1111-2222");
		String[] data = str5.split(",");
		System.out.println("data = " + data[1]);
		// 把空格弄掉
		System.out.println("data = " + data[1].trim());

		// 轉大寫
		String str6 = "a123123456";
		System.out.println("str6 = " + str6.toUpperCase());

		// 轉小寫
		String str7 = "A123123456";
		System.out.println("str7 = " + str7.toLowerCase());
		
		System.out.println("str7.length = " + str7.length());

	}

}
