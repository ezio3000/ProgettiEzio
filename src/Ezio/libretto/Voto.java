package Ezio.libretto;

import java.time.LocalDate;

public class Voto {
   private int voto;
   private String corso;
   private LocalDate date;    //oggetto per la gestione delle date
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public String getCorso() {
	return corso;
}
public void setCorso(String corso) {
	this.corso = corso;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
   
   
}
