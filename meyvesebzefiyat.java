package oyun;
import static javax.swing.JOptionPane.*;

public class meyvesebzefiyat {	
	
	public static void main(String[] args) {		
		float[] sonuc=new float[7];
        pazar p =new pazar(); 
    
        showMessageDialog(null," Ho�geldiniz"); 
        showMessageDialog(null, "Domates kg fiyat� = 4.95 tl \n" + "Salatalik kg fiyat� = 8.00 \n" 
        + "Erik kg fiyat� = 12.50 tl \n" + "Elma kg fiyat� = 6.15 tl \n"+ "Mandalina kg fiyat� = 8.45 tl \n"
        + "Portakal kg fiyat� = 8.95 tl \n"+ "Patl�can kg fiyat� = 8.45 tl \n");
        
        p.setDomateskilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Domates Ald�n�z ?")));       
        p.setSalatalikkilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Salatal�k Ald�n�z ?")));
        p.setErikkilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Erik Ald�n�z ?")));    
        p.setElmakilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Elma Ald�n�z ?")));     
        p.setMandalinakilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Mandalina Ald�n�z ?")));
        p.setPortakalkilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Portakal Ald�n�z ?")));      
        p.setPatl�cankilo(Float.valueOf(showInputDialog(null,"Ka� Kilo Patl�can Ald�n�z ?")));
        
        sonuc[0] = p.hesapla(p.domatesfiyat,p.getDomateskilo());
        sonuc[1] = p.hesapla(p.salatalikfiyat,p.getSalatalikkilo());
        sonuc[2] = p.hesapla(p.erikfiyat,p.getErikkilo());
        sonuc[3] = p.hesapla(p.elmafiyat,p.getElmakilo());
        sonuc[4] = p.hesapla(p.mandalinafiyat,p.getMandalinakilo());
        sonuc[5] = p.hesapla(p.portakalfiyat,p.getPortakalkilo());
        sonuc[6] = p.hesapla(p.patl�canfiyat,p.getPatl�cankilo());
        
        float toplamsonuc=p.toplamhesapla(sonuc);   
        
        showMessageDialog(null,p.getDomateskilo()+" kilo domates ald�n�z, Domates "+sonuc[0]+" tl tuttu.\n"
        		+p.getSalatalikkilo()+" kilo Salatalik ald�n�z, Salatalik "+sonuc[1]+" tl tuttu.\n"
        		+p.getErikkilo()+" kilo Erik ald�n�z, Erik "+sonuc[2]+" tl tuttu.\n"
        		+p.getElmakilo()+" kilo Elma ald�n�z, Maydanoz "+sonuc[3]+" tl tuttu.\n"
        		+p.getMandalinakilo()+" kilo Mandalina ald�n�z, Mandalina "+sonuc[4]+" tl tuttu.\n"
        		+p.getPortakalkilo()+" kilo Portakal ald�n�z, Portakal "+sonuc[5]+" tl tuttu.\n"
        		+p.getPatl�cankilo()+" kilo Patl�can ald�n�z, Patl�can "+sonuc[6]+" tl tuttu.\n"
        		+"Toplam tutar: "+toplamsonuc+" tl\n"
        		+"Toplam KDV de�eri: "+p.kdv(toplamsonuc)+" tl \n"
        		+"KDV'li toplam tutar: "+(toplamsonuc+p.kdv(toplamsonuc))+" tl");
        
        showMessageDialog(null,"�yi al��veri�ler dileriz ");               
    }  
 }
