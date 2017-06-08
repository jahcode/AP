package leArquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class leArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		String caminho = JOptionPane.showInputDialog(null,System.in,"D:/Desenvolvimento/labirinto.txt");
		File file = new File(caminho);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}

}


