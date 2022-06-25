package com.bootcampers.designpatterns;

import com.bootcampers.designpatterns.singleton.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);

		Connection connection = Connection.getInstance();
		connection.connect();
		connection.disconnect();

		System.out.println("Espacio en memoria de objeto connection: " + connection);

		Connection connection2 = Connection.getInstance();
		connection2.connect();
		connection2.disconnect();

		System.out.println("Espacio en memoria de objeto connection 2: " + connection2);

		if (connection.equals(connection2)) {
			System.out.println("Los objetos connection y connection 2 tienen el mismo espacio en memoria, cumpliendo de esta manera con el patrón singleton");
		}
	}

}
