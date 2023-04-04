package pl.zajecia.filmy;


import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class VideoCasseteApi {

	private ArrayList<VideoCassete> lista = new ArrayList<VideoCassete>();

	public VideoCasseteApi(){
		lista.add(new VideoCassete(1L,"test1",(LocalDate.of(2022,1,3))));
		lista.add(new VideoCassete(2L,"test2",(LocalDate.of(2022,1,3))));
		lista.add(new VideoCassete(3L,"test3",(LocalDate.of(2022,1,3))));
	}


	@GetMapping("/Get")
	public ArrayList<VideoCassete> GetFilmy(){
		return lista;
	}
}
