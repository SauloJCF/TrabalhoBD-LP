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
public class QuantidadeTicket {
    private Usuario codUsuario;
    private Tickets codTicket;
    private int quant;

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Tickets getCodTicket() {
        return codTicket;
    }

    public void setCodTicket(Tickets codTicket) {
        this.codTicket = codTicket;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
