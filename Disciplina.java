public class Disciplina 
{
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private ICalcMedia calcMedia;

    // Construtores
    public Disciplina(ICalcMedia calcMedia) 
    {
        this.calcMedia = calcMedia;
    }

    // Métodos
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setP1(double p1) 
    {
        this.p1 = p1;
    }

    public void setP2(double p2) 
    {
        this.p2 = p2;
    }

    public String getNome() 
    {
        return nome;
    }

    public double getP1() 
    {
        return p1;
    }

    public double getP2() 
    {
        return p2;
    }

    public double getMedia() 
    {
        return media;
    }

    public String getSituacao() 
    {
        return situacao;
    }

    public void CalcularMedia()
    {
        this.media = calcMedia.calcularMedia(p1, p2);
        this.situacao = calcMedia.verificarSituacao(media);
    }
}
