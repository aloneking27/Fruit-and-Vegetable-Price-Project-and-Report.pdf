package oyun;
import static javax.swing.JOptionPane.*;

public class meyvesebzefiyat {	
	
	public static void main(String[] args) {		
		float[] sonuc=new float[7];
        pazar p =new pazar(); 
    
        showMessageDialog(null," Hoþgeldiniz"); 
        showMessageDialog(null, "Domates kg fiyatý = 4.95 tl \n" + "Salatalik kg fiyatý = 8.00 \n" 
        + "Erik kg fiyatý = 12.50 tl \n" + "Elma kg fiyatý = 6.15 tl \n"+ "Mandalina kg fiyatý = 8.45 tl \n"
        + "Portakal kg fiyatý = 8.95 tl \n"+ "Patlýcan kg fiyatý = 8.45 tl \n");
        
        p.setDomateskilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Domates Aldýnýz ?")));       
        p.setSalatalikkilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Salatalýk Aldýnýz ?")));
        p.setErikkilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Erik Aldýnýz ?")));    
        p.setElmakilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Elma Aldýnýz ?")));     
        p.setMandalinakilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Mandalina Aldýnýz ?")));
        p.setPortakalkilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Portakal Aldýnýz ?")));      
        p.setPatlýcankilo(Float.valueOf(showInputDialog(null,"Kaç Kilo Patlýcan Aldýnýz ?")));
        
        sonuc[0] = p.hesapla(p.domatesfiyat,p.getDomateskilo());
        sonuc[1] = p.hesapla(p.salatalikfiyat,p.getSalatalikkilo());
        sonuc[2] = p.hesapla(p.erikfiyat,p.getErikkilo());
        sonuc[3] = p.hesapla(p.elmafiyat,p.getElmakilo());
        sonuc[4] = p.hesapla(p.mandalinafiyat,p.getMandalinakilo());
        sonuc[5] = p.hesapla(p.portakalfiyat,p.getPortakalkilo());
        sonuc[6] = p.hesapla(p.patlýcanfiyat,p.getPatlýcankilo());
        
        float toplamsonuc=p.toplamhesapla(sonuc);   
        
        showMessageDialog(null,p.getDomateskilo()+" kilo domates aldýnýz, Domates "+sonuc[0]+" tl tuttu.\n"
        		+p.getSalatalikkilo()+" kilo Salatalik aldýnýz, Salatalik "+sonuc[1]+" tl tuttu.\n"
        		+p.getErikkilo()+" kilo Erik aldýnýz, Erik "+sonuc[2]+" tl tuttu.\n"
        		+p.getElmakilo()+" kilo Elma aldýnýz, Maydanoz "+sonuc[3]+" tl tuttu.\n"
        		+p.getMandalinakilo()+" kilo Mandalina aldýnýz, Mandalina "+sonuc[4]+" tl tuttu.\n"
        		+p.getPortakalkilo()+" kilo Portakal aldýnýz, Portakal "+sonuc[5]+" tl tuttu.\n"
        		+p.getPatlýcankilo()+" kilo Patlýcan aldýnýz, Patlýcan "+sonuc[6]+" tl tuttu.\n"
        		+"Toplam tutar: "+toplamsonuc+" tl\n"
        		+"Toplam KDV deðeri: "+p.kdv(toplamsonuc)+" tl \n"
        		+"KDV'li toplam tutar: "+(toplamsonuc+p.kdv(toplamsonuc))+" tl");
        
        showMessageDialog(null,"Ýyi alýþveriþler dileriz ");               
    }  
 }
