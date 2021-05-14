package local.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {

	public static void main(String[] args) {
		Sonata herCar = new Sonata(); //직접관리 했기에 직접 life cycle을 관리해야한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("local\\di\\sonataBean.xml");
		Sonata myCar = null;
		myCar = (Sonata)context.getBean("myCar");
		System.out.println(myCar.toString());
		Sonata yourCar = null;
		yourCar = (Sonata)context.getBean("yourCar");
		System.out.println(yourCar.toString());
		System.out.println("yourCar의 현재속도는"+yourCar.getSpeed());
		Sonata meCar = null;
		meCar = (Sonata)context.getBean("meCar"); //1. forward가 없어서  2. local이다보니 값을 받지 못함(Web에서 servlet의 값을 받아야 하는데 못받음. -session, request는 확인못함.)
		System.out.println(meCar.toString());
		System.out.println("yourCar의 현재속도는"+meCar.getSpeed());
		Sonata himCar = null;
		himCar = (Sonata)context.getBean("himCar");
		System.out.println(himCar.toString());
		System.out.println("himCar의 현재속도는"+himCar.getSpeed());
		
	}

}
