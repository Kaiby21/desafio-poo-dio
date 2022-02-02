package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.dominio.Conteudo.XP_Padrao;

public class Curso extends Conteudo{

    int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_Padrao*cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
