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
		
		miSumatoriaBean.setResultado(miSumatoriaBean.getValor1()+miSumatoriaBean.getValor2());
		System.out.println("Mensaje: " + miSumatoriaBean.getMensaje() + miSumatoriaBean.getResultado());
	}

}
