package ua.lviv.lgs.auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ua.lviv.lgs.auto.AutoList;
import ua.lviv.lgs.auto.EngineList;
import ua.lviv.lgs.auto.WheelList;

public class ApplicationAutoList {
	public static void main(String[] args) {
		
//		��������� ���������
		
		List<AutoList> list1 = new ArrayList();
		int sizeOfCollect =  new Random().nextInt(20 - 1) + 1;
		
//		���������� ���� ����������
		
		for(int i = 0; i < sizeOfCollect; i ++) {
			list1.add(new AutoList(new WheelList(), new EngineList()));
		}
//		System.out.println(sizeOfCollect);
//		System.out.println(list1);
		
//		��������� ����

		System.out.println("�������� 1 ��� ������� �������� ������ ������");
		System.out.println("�������� 2 ��� ��������� ����� ���������� ����������");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if (number == 1) {
				System.out.println(list1);
			}
			if (number == 2) {
				AutoList a1 = new AutoList(new WheelList(), new EngineList());
				for (int i = 0; i < sizeOfCollect; i++) {
					list1.set(i, a1);
					
				}

				System.out.println(list1);
			}
		}
		
	}

}
