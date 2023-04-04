package pl.zajecia.filmy;

import java.time.LocalDate;

public class VideoCassete {

	Long id;
	String tytul;
	LocalDate rokProdukcji;

	public VideoCassete(Long id, String tytul, LocalDate rokProdukcji) {
		this.id = id;
		this.tytul = tytul;
		this.rokProdukcji = rokProdukcji;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public LocalDate getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(LocalDate rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}
}
