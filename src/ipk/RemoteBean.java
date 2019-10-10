/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipk;

/**
 *
 * @author Faisal
 */
import javax.ejb.Remote;

@Remote
public interface RemoteBean {
    public void setIPK(String nama, int sks, String nilai);
    public double getSkor();
    public int getBobot();
}
