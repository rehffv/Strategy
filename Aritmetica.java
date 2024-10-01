public class Aritmetica implements ICalcMedia 
{

    @Override
    public double calcularMedia(double p1, double p2) 
    {
        return (p1 + p2) / 2.0;
    }

    @Override
    public String verificarSituacao(double media) 
    {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}
