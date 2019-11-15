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
public class TicketsPedido {
    private Pedido codigoCompra;
    private Tickets codigoTicket;
    private int quant;

    public Pedido getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(Pedido codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Tickets getCodigoTicket() {
        return codigoTicket;
    }

    public void setCodigoTicket(Tickets codigoTicket) {
        this.codigoTicket = codigoTicket;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
}
