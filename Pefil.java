package cadastroimc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pefil {

	private String name;
	private String cpf;
	private Date date;
	private List<Imc>listProcess=new ArrayList<>();
	
	public Pefil() {
		
	}

	public Pefil(String name, String cpf, Date date) {
		
		this.name = name;
		this.cpf = cpf;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDate() {
		return date;
	}

	
	public List<Imc> getListProcess() {
		return listProcess;
	}

	public void addForm(Imc form) {
		listProcess.add(form);
	}
	public void removeForm(Imc form) {
		listProcess.remove(form);
	}

	@Override
	public String toString() {
		return "Cadastro:\nname: " + name + "\ncpf: " + cpf + "\ndate: " + date;
	}
	
}
