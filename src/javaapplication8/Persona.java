/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author sena
 */
public class Persona {
    private int id;
    public void Setid(int idpara)
    {
    this.id=idpara;
    }
    public int getid()
    {
    return this.id;
    }
    public void dormir()       
    {
    System.out.print(id+"Esta dormido");
    }

    private String telefono;
    public void Settelefono(String telefonopara)
    {
    this.telefono=telefonopara;
    }
    public String gettelefono()
    {
    return this.telefono;
    }
    public void comer()       
    {
    System.out.print(telefono+"Esta comiendo");
    }
}
