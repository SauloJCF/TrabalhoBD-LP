/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author SauloJCF
 */
public class Tickets {
    private int codTicket;
    private String refeicao;
    private Double precoAluno;
    private Double precoFuncionario;
    private Double precoVisitante;

    public int getCodTicket() {
        return codTicket;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codTicket;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tickets other = (Tickets) obj;
        if (this.codTicket != other.codTicket) {
            return false;
        }
        return true;
    }

    public void setCodTicket(int codTicket) {
        this.codTicket = codTicket;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    public Double getPrecoAluno() {
        return precoAluno;
    }

    public void setPrecoAluno(Double precoAluno) {
        this.precoAluno = precoAluno;
    }

    public Double getPrecoFuncionario() {
        return precoFuncionario;
    }

    public void setPrecoFuncionario(Double precoFuncionario) {
        this.precoFuncionario = precoFuncionario;
    }

    public Double getPrecoVisitante() {
        return precoVisitante;
    }

    public void setPrecoVisitante(Double precoVisitante) {
        this.precoVisitante = precoVisitante;
    }
    
}
