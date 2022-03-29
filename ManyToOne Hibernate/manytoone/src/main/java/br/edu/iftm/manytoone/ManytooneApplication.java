package br.edu.iftm.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManytooneApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManytooneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria(null, "Alimentos");

		Item i1 = new Item(null, "Arroz", c1);
		Item i2 = new Item(null, "Feijão", c1);
		Item i3 = new Item(null, "Bolacha", c1);

		// salvar no db

		categoriaRepository.save(c1);

		itemRepository.save(i1);
		itemRepository.save(i2);
		itemRepository.save(i3);
	}

}
