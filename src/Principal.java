import br.com.cris.screenmatch.calculos.CalculadoraDeTempo;
import br.com.cris.screenmatch.modelos.Filme;
import br.com.cris.screenmatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("One Day");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia( 6);
        meuFilme.avalia(8);
        meuFilme.avalia( 9);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes =1;
        System.out.println(meuFilme.pegaMedia());

        Series greys = new Series();
        greys.setNome("Grey's");
        greys.setAnoDeLancamento(2005);
        greys.exibeFichaTecnica();
        greys.setTemporadas(22);
        greys.setMinutosPorEpisodio(50);
        greys.setEpisodiosPorTemporada(12);
        System.out.println("Duração para maratonar  Série: " + greys.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Pousando no Amor");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(greys);
        System.out.println(calculadora.getTempoTotal());;
    }
}
