package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.SumatoriaBeanSpring;

public class SumatoriaSpring {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = context;
		SumatoriaBeanSpring miSumatoriaBean = (SumatoriaBeanSpring) factory.getBean("miSumatoriaBean");
		int variable1 = 1;
		int variable2 = 4;
		float resultado = 0;
		resultado = variable1 + variable2;
		System.out.println("Mensaje: " + miSumatoriaBean.getMensaje() + resultado);
	}

}
