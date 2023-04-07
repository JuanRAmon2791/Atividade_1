import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {
        
        String[] alunos = new String[25];
        Scanner sc = new Scanner(System.in);
        
        // cadastro dos primeiros 25 alunos
        for(int i=0; i<25; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            alunos[i] = sc.nextLine();
        }
        
        // cadastro dos 5 novos alunos
        for(int i=0; i<5; i++) {
            System.out.print("Digite o nome do novo aluno " + (i+1) + ": ");
            alunos[i+25] = sc.nextLine();
        }
        
        System.out.println("\nLista de alunos cadastrados:");
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
        
        sc.close();
    }

}
    

