package playBaseBall;

import java.util.Scanner;
import playBaseBall.RandomUtils;

public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		// TODO ���� ����
		CheckDuplicate checkDuplicate = new CheckDuplicate();
		int randomNum = CheckDuplicate.makeRandomNumber();
		//System.out.println(randomNum);
		
		
		//System.out.println(randomNumber);
		CheckInputNumber checkInputNumber = new CheckInputNumber();
		System.out.printf("���ڸ� ���ڸ� �Է��Ͻÿ� : ");
		String inputNum = scanner.nextLine();
		//System.out.println(checkInputNumber.isValid(inputNum));

	}
	
	
}
