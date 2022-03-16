package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class AarrayVetor {
	public static void main(String[] args) {
		
		try {
		double [] notas = {8.8,9.7,7.6,5.4};
		double [] notasLogica = {9.9,7.9,6.9,9.7};
			
		/*Cria��o do aluno*/	
		Aluno aluno = new Aluno();
		aluno.setNome("Douglas Oliveira");
		aluno.setNomeEscola("JavaDev");
		
		/*Cria��o da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		/*Cria��o do disciplina2*/
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de Programa��o");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Falha catastr�fica \n"+e.getMessage());
	}
}
}
