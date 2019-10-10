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
import javax.ejb.Stateful;

@Stateful
public class SessionBean implements RemoteBean {

    String nama = "", nilai = "";
    int sks = 0, bobot = 0;
    double skor = 0;
    
    @Override
    public void setIPK(String nama, int sks, String nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public double getSkor() {
        skor = bobot/sks;
        return skor;
    }

    @Override
    public int getBobot() {
        if("A".equals(nilai)){
            bobot = sks*4;
        }else if("B".equals(nilai)){
            bobot = sks*3;
        }else if("C".equals(nilai)){
            bobot = sks*2;
        }else if("D".equals(nilai)){
            bobot = sks*1;
        }else if("E".equals(nilai)){
            bobot = sks*0;
        }
        return bobot;
    }
    
}
