package ua.lviv.lgs.month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationMonth {

	static void menu() {
		System.out.println("�������� 1 ��� ��������� �� ���� ����� �����");
		System.out.println("�������� 2 ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 ��� ������� �� �����, �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6 ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9 ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10 ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

	public static void main(String[] args) {
		Seasons seas1 = new Seasons();
		Days day1 = new Days();
		Name name1 = new Name();

		List<Month> arrayOfMonth = new ArrayList<Month>();

		for (int i = 0; i < 12; i++) {
			Month monthi = new Month(name1.getNameOfMonth()[i], seas1.getSeason()[i], day1.getDays()[i]);
			arrayOfMonth.add(monthi);

		}
		System.out.println(arrayOfMonth);

		Scanner sc = new Scanner(System.in);

		while (true) {

			menu();

			String enter = sc.next();
			System.out.println("Enter number is " + enter);
//		int i = Integer.parseInt(enter);
//		if(i < 1 || i > 10 ) {
//			String message = "Sach function dont exists";
//			throw new WrongInputConsoleParametersException(message);
//			/*Exception of aut area*/
//		} else {
//		
			switch (enter) {

			case "1": {

				/* �� ���� ����� ����� */

				System.out.println("Enter month");

				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				monthExits(arrayOfMonth, month);

				break;
			}
			case "2": {

				/* �� ����� � ����� � ����� ���� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}

					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getSeasOfMonth()
								.equalsIgnoreCase(arrayOfMonth.get(indexOfInputMonth).getSeasOfMonth())) {
							System.out.println(arrayOfMonth.get(i).getNameOfMonth());
						}
					}

					break;
				} else {
					break;
				}

			}
			case "3": {

				/* ����� ���� ���� ������� ��� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}

					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getDayInMonth() == arrayOfMonth.get(indexOfInputMonth)
								.getDayInMonth()) {

							System.out.println(arrayOfMonth.get(i).getNameOfMonth());
						}
					}

					break;
				} else {
					break;
				}

			}
			case "4": {

				/* �� ����� �� ����� ����� ������� ��� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}

					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getDayInMonth() < arrayOfMonth.get(indexOfInputMonth).getDayInMonth()) {

							System.out.println(arrayOfMonth.get(i).getNameOfMonth());
						}
					}

					break;
				} else {
					break;
				}

			}
			case "5": {

				/* �� ����� �� ����� ����� ������� ��� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}

					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getDayInMonth() > arrayOfMonth.get(indexOfInputMonth).getDayInMonth()) {

							System.out.println(arrayOfMonth.get(i).getNameOfMonth());
						}
					}

					break;
				} else {
					break;
				}

			}
			case "6": {

				/* �������� ���� ���� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}
					for (int i = indexOfInputMonth + 1; i < arrayOfMonth.size(); i++) {
						if (!arrayOfMonth.get(i).getSeasOfMonth()
								.equalsIgnoreCase(arrayOfMonth.get(indexOfInputMonth).getSeasOfMonth())) {
							System.out.println(arrayOfMonth.get(i).getSeasOfMonth());
							break;
						}
					}

					break;
				} else {
					break;
				}

			}
			case "7": {

				/* ��������� ���� ���� */

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				if (monthExits(arrayOfMonth, month)) {

					int indexOfInputMonth = 0;
					for (int i = 0; i < arrayOfMonth.size(); i++) {
						if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
							indexOfInputMonth = i;
						}
					}
					for (int i = indexOfInputMonth - 1; i >= 0; i--) {
						if (!arrayOfMonth.get(i).getSeasOfMonth()
								.equalsIgnoreCase(arrayOfMonth.get(indexOfInputMonth).getSeasOfMonth())) {
							System.out.println(arrayOfMonth.get(i).getSeasOfMonth());
							break;
						}
					}

					break;
				} else {
					break;
				}

			}
			case "8": {

				/*�� ����� �� ����� ����� ������� ���*/

				for(Month m : arrayOfMonth) {
					if(m.getDayInMonth() % 2 == 0) {
						System.out.println(m.getNameOfMonth());
					}
				}
					
				break;
			}
			
		case "9": {

			/*�� ����� �� ����� ����� ������� ���*/

			for(Month m : arrayOfMonth) {
				if(m.getDayInMonth() % 2 != 0) {
					System.out.println(m.getNameOfMonth());
				}
			}
				
			break;
			}
		case "10": {

			/*�� �������� � ������ ����� �� ����� ������� ���*/

			System.out.println("Enter month");
			sc = new Scanner(System.in);
			String month = sc.next().toUpperCase();

			if (monthExits(arrayOfMonth, month)) {

				int indexOfInputMonth = 0;
				for (int i = 0; i < arrayOfMonth.size(); i++) {
					if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
						indexOfInputMonth = i;
					}
				}
				if( arrayOfMonth.get(indexOfInputMonth).getDayInMonth() % 2 == 0) {
					System.out.println(arrayOfMonth.get(indexOfInputMonth).getNameOfMonth() + " �� ����� ������� ���");
				} else {
					System.out.println(arrayOfMonth.get(indexOfInputMonth).getNameOfMonth() + " �� �� ����� ������� ���");
				}

				break;
			} else {
				break;
			}

		}
		}
			
		}
	}

	private static boolean monthExits(List<Month> arrayOfMonth, String month) {
		boolean flag = false;

		for (int i = 0; i < arrayOfMonth.size(); i++) {
			if (arrayOfMonth.get(i).getNameOfMonth().equalsIgnoreCase(month)) {
				System.out.println("����� ̲���� ���Ӫ !!!");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("������ ̲���� �� ���Ӫ !!!");
		}
		return flag;
	}

}
