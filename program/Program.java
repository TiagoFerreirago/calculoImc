package cadastroimc.program;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import cadastroimc.Imc;
import cadastroimc.Pefil;
import cadastroimc.menu.Menu;

public class Program {
	public static void main( String [] args) throws ParseException {
	Random num = new Random();
	SimpleDateFormat clock = new SimpleDateFormat("dd/MM/yyyy");
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o nome:");
	String name= sc.nextLine();
	System.out.println("Informe o CPF:");
	String cpf= sc.nextLine();
	System.out.println("Informe a Data de nascimento:");
	Date date= clock.parse(sc.next()); 
	Pefil cadastro = new Pefil(name,cpf,date);
	
	//id//
	int id = num.nextInt(1000);
	System.out.println("Informe a altura:");
	double altura = sc.nextDouble();
	System.out.println("Informe o peso:");
	int peso =sc.nextInt();
	Imc save = new Imc(id,altura,peso);
	cadastro.addForm(save);
	Menu condicaoFisica = new Menu();
	System.out.println(cadastro);
	System.out.println(save);
	System.out.println("Resultado final:");
	System.out.printf("%.2f",save.calImc(peso, altura));
	System.out.println();
	condicaoFisica.condicional(save.calImc(peso, altura));
}
}