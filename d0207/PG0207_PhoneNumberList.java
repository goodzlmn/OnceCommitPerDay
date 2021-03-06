package d0207;

import java.util.*;

public class PG0207_PhoneNumberList {
	private static int answer = 0;

	public static void main(String[] args) {
		// [119, 97674223, 1195524421]
		String[] phone_book = { "12", "123", "1235", "567", "88" };
		System.out.println((solution(phone_book)));

	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j]))
					return false;
				if(phone_book[j].startsWith(phone_book[i]))
					return false;
			}
		}
		return true;
	}
}