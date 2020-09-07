package ua.lviv.lgs.month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationMonth {

	static void menu() {
		System.out.println("натисн≥ть 1 щоб перев≥рити чи ≥снуЇ такий м≥с€ць");
		System.out.println("натисн≥ть 2 щоб вивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("натисн≥ть 3 щоб вивести вс≥ м≥с€ц≥, що мають таку саму к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 4 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 5 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 6 щоб вивести на екран наступну пору року");
		System.out.println("натисн≥ть 7 щоб вивести на екран попередню пору року");
		System.out.println("натисн≥ть 8 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 9 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 10 щоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");

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

				/* чи ≥снуЇ такий м≥с€ць */

				System.out.println("Enter month");

				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				monthExits(arrayOfMonth, month);

				break;
			}
			case "2": {

				/* вс≥ м≥с€ц≥ з такою ж порою року */

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

				/* мають таку саму к≥льк≥сть дн≥в */

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

				/* вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в */

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

				/* вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в */

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

				/* наступну пору року */

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

				/* попередню пору року */

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

				/*вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в*/

				for(Month m : arrayOfMonth) {
					if(m.getDayInMonth() % 2 == 0) {
						System.out.println(m.getNameOfMonth());
					}
				}
					
				break;
			}
			
		case "9": {

			/*вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в*/

			for(Month m : arrayOfMonth) {
				if(m.getDayInMonth() % 2 != 0) {
					System.out.println(m.getNameOfMonth());
				}
			}
				
			break;
			}
		case "10": {

			/*чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в*/

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
					System.out.println(arrayOfMonth.get(indexOfInputMonth).getNameOfMonth() + " маЇ парну к≥льк≥сть дн≥в");
				} else {
					System.out.println(arrayOfMonth.get(indexOfInputMonth).getNameOfMonth() + " маЇ не парну к≥льк≥сть дн≥в");
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
				System.out.println("“ј »… ћ≤—я÷№ ≤—Ќ”™ !!!");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("“ј ќ√ќ ћ≤—я÷я Ќ≈ ≤—Ќ”™ !!!");
		}
		return flag;
	}

}
