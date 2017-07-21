package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component(value="productor")
public class Productor {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public void enviar(Persona persona){
		jmsTemplate.convertAndSend("prueba.cola",persona);
	}

}
