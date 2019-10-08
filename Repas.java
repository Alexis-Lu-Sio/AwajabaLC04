import java.date.LocalDate;
class Repas{
	public int numero;
	public LocalDate date;

	
	Repas(int numero, LocalDate date){
		this.numero = numero;
		this.date = date;
	}
	public int getNumero(){
		return this.numero	
	}
	
	public int setNumero(int num){
		this.numero=num;
	}
}
