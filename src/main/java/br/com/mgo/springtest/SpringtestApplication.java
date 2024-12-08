package br.com.mgo.springtest;

import br.com.mgo.springtest.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?i=tt3896198&apikey=ef3fc06e");
		System.out.println(json);

	}
}
