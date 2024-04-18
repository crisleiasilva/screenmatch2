package br.com.cris.screenmatch.calculos;

import br.com.cris.screenmatch.modelos.Filme;
import br.com.cris.screenmatch.modelos.Series;
import br.com.cris.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    
//
//    public void inclui(Filme f) {
//       this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Series s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
