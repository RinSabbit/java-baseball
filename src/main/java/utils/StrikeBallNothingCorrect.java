package utils;

/**
 * �Էµ� ���� ������ ���Ͽ� ����� ������ Ŭ����
 */
public class StrikeBallNothingCorrect {

	private static int TRUE_SIZE = 3;

	private String randomNum;
	private String inputNum;
	private int strike;
	private int ball;

	public StrikeBallNothingCorrect(String inputNum, String randomNum) {
		this.inputNum = inputNum;
		this.randomNum = randomNum;
		strike = 0;
		ball = 0;
	}

	/**
	 * �Է°��� ������ ���Ͽ� ������ true�� ��ȯ�Ѵ�.
	 * @return boolean
	 */
	public boolean correctingNumbers() {
		for (int i = 0; i < TRUE_SIZE; i++) {
			countStrike(i);
		}
		return showResult();
	}

	/**
	 * ��Ʈ����ũ�� ��� ��Ʈ����ũ ���� ���Ѵ�. ��Ʈ����ũ�� �ƴ� ��� ������ �˻��Ѵ�.
	 * @param i
	 */
	private void countStrike(int i) {
		if (inputNum.charAt(i) == randomNum.charAt(i)) {
			strike++;
		} else {
			countBall(i);
		}
	}

	/**
	 * ���� ��� �� ���� ���Ѵ�.
	 * @param i
	 */
	private void countBall(int i) {
		if (randomNum.contains(String.valueOf(inputNum.charAt(i)))) {
			ball++;
		}
	}

	/**
	 * ������� ����ϰ� ��� ������ ��� true�� ��ȯ�Ѵ�.
	 * @return boolean
	 */
	private boolean showResult() {
		if (strike == 0 && ball == 0) {
			System.out.println("����");
		} else if (strike == 0) {
			System.out.printf("%d��\n", ball);
		} else if (ball == 0) {
			System.out.printf("%d��Ʈ����ũ\n", strike);
		} else {
			System.out.printf("%d�� %d��Ʈ����ũ\n", ball, strike);
		}
		if (strike == TRUE_SIZE) {
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			return true;
		}
		return false;
	}

}
