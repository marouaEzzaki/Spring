package configuration;

import org.springframework.context.annotation.ComponentScan;

//Esto aplica igual que ene XML, es decir, busca anotaciones Spring en
//los paquetes que le digamos
@ComponentScan(basePackages = "modelo.entidad")
public class ConfiguracionSpring {
	

}
