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
	
	public void setNumero(int num){
		this.numero=num;
	}
	
	public void setDate(LocalDate ldate){
		this.date=ldate;
	}
	
	public LocalDate getDate(){
		return this.date;
	}
}
