package oyun;

public class hesap {

	public float hesapla(double fiyat,float kilo) {
		
		return (float) (fiyat * kilo);
		
		
	}
	
	public float toplamhesapla(float[] array) {
		
		float toplam = 0;
		for(int i = 0 ; i<array.length; i++) toplam += array[i];
		return toplam ;
		
	}
	
	public float kdv(float toplam) {
		
		return (toplam*8)/100;
		
	}
	
}
