package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class Principal {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Principal.class, args);
		Productor productor=(Productor) context.getBean("productor");
		productor.enviar(new Persona("Maria",20));
	}
}
