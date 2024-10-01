import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEscolha a disciplina:");
        System.out.println("1. Disciplina de Média Aritmética");
        System.out.println("2. Disciplina de Média Geométrica");
        System.out.print("\nSua escolha: ");
        int escolha = scanner.nextInt();

        ICalcMedia calculo;

        if (escolha == 1) 
        {
            calculo = new Aritmetica();
        } 
        else 
        {
            calculo = new Geometrica();
        }

        Disciplina disciplina = new Disciplina(calculo);

        System.out.print("\nDigite o nome da disciplina: ");
        scanner.nextLine();
        String nomeDisciplina = scanner.nextLine();
        disciplina.setNome(nomeDisciplina);

        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();
        disciplina.setP1(p1);

        System.out.print("Digite a nota da P2: ");
        double p2 = scanner.nextDouble();
        disciplina.setP2(p2);

        disciplina.CalcularMedia();
        System.out.println(String.format(
            "\nDisciplina: %s\nP1: %.2f\nP2: %.2f\n\nMédia: %.2f\nSituação: %s\n\n",
            disciplina.getNome(), disciplina.getP1(), disciplina.getP2(),
            disciplina.getMedia(), disciplina.getSituacao()
        ));

        scanner.close();
    }
}
