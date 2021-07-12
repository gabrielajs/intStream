package br.com.g2b.intStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class IntStreamApplication {

	public static void main(String[] args) {
		var idade = 15;

		IntStream.of(1,2,3,4,5).forEach(n -> {System.out.println(n);});
		IntStream.range(0,3).forEach(n -> {System.out.println("Numero = "+n);});

		for (int i = 0; i <=10; i++){
			System.out.println(i);
		}

		if(idade >= 18){
			System.out.println("Pode tirar carta");
		} else {
			System.out.println("Você ainda é menor de idade, não pode tirar carta");
		}
	}

}
