package baseball;

import java.util.Scanner;
import utils.randomGenerator;

public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		// TODO ���� ����

		int randomNumber = randomGenerator.nextInt(100, 999);
		System.out.println(randomNumber);
		CheckInputNumber checkInputNumber = new CheckInputNumber();
		System.out.printf("���ڸ� ���ڸ� �Է��Ͻÿ� : ");
		String inputNum = scanner.nextLine();
		System.out.println(checkInputNumber.isValid(inputNum));

	}
}
