package prototype.improve;


import prototype.my.Sleep;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		System.out.println("ԭ��ģʽ��ɶ���Ĵ���");
		// TODO Auto-generated method stub
//		Sheep sheep = new Sheep("tom", 1, "��ɫ");
//
//		sheep.friend = new Sheep("jack", 2, "��ɫ");
//
//		Sheep sheep2 = (Sheep)sheep.clone(); //��¡
//		Sheep sheep3 = (Sheep)sheep.clone(); //��¡
//		Sheep sheep4 = (Sheep)sheep.clone(); //��¡
//		Sheep sheep5 = (Sheep)sheep.clone(); //��¡
//
//		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
//		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
//		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
//		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());

		Sleep sleep = new Sleep();
		sleep.setId(1);
		sleep.setNickName("��ľ��");
		sleep.setName("��̫��");

		Sleep sleep1 = sleep.deepClone();
		System.out.println(sleep1);

		List<Sleep> sleeps = new ArrayList<>();

	}

}
