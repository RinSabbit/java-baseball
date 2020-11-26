package baseball;

import java.util.Scanner;
import utils.*;

public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int goStop = 1;
		// TODO ���� ����
		
		while(goStop == 1) {
			playGame();
			System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
			goStop = Integer.parseInt(scanner.nextLine());
			goStop = continueGame(String.valueOf(goStop));
		}
	}

	/**
	 * ���� ���� ������ ������ �����Ѵ�
	 */
	private static void playGame() {
		boolean win = false;
		CheckDuplicate checkDuplicate = new CheckDuplicate();
		String randomNum = checkDuplicate.makeRandomNumber();
		// System.out.println(randomNum);

		CheckInputNumber checkInputNumber = new CheckInputNumber();
		
		while(!win) {
			String input = checkInputNumber.inputNumber();
			// System.out.println(checkInputNumber.isValid(inputNum));

			StrikeBallNothingCorrect strikeBallNothingCorrect =
					new StrikeBallNothingCorrect(input, randomNum);
			win = strikeBallNothingCorrect.correctingNumbers();
			//System.out.println(test);
		}
	}
	
	
	/**
	 * ������ �������� ������ �˻��Ѵ�
	 * @param goStop
	 * @return int
	 */
	private static int continueGame(String goStop) {
		if(goStop.equals("1")) {
			return 1;
		} else if(goStop.equals("2")) {
			return 2;
		} else {
			throw new IllegalArgumentException("1 �Ǵ� 2�� �Է��ؾ� �մϴ�.");
		}
	}
	
	
}
