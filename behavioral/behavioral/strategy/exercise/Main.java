package behavioral.strategy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("Joao da Silva", 305));
		alunos.add(new Aluno("Mauro Oliveira", 307));
		alunos.add(new Aluno("Renata Andrade", 302));
		alunos.add(new Aluno("Adriada Silva", 303));
		alunos.add(new Aluno("Ricardo Moura", 301));
		
		// Collections.sort aceita dois argumentos:
		// O primeiro eh a estrutura de dados (para ordenar) e o
		// Segundo eh o Strategy com o algoritmo de comparacao
		// O Strategy neste caso eh uma implementacao da interface
		// Comparator
		
		// Implementar interface Comparator para alunos
		// De acordo com:
		// https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
		// Considerando Nome (alfanumerico crescente)
		Comparator c1 = new AlunoNomeComparator();
		// Considerando Matricula (numerico crescente)
		Comparator c2 = new AlunoMatriculaComparator();

		// Ordenar pelo nome (crescente)
		Collections.sort(alunos, c1);
		
		System.out.println("Alunos ordenados pelo nome:");
		for (Aluno aluno : alunos) {
			aluno.print();
		}
		
		// Agora ordenar pela matricula (crescente)
		Collections.sort(alunos, c2);
		
		System.out.println("\nAlunos ordenados pela matricula:");
		for (Aluno aluno : alunos) {
			aluno.print();
		}
	}
}
