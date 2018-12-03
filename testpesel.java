public class testpesel {
    public static void main(String[] args) {
	int wynik;
	Pesel p1= new Pesel("86041404054");
	wynik=p1.spr();
	System.out.println("Cyfra kontrolna numeru pesel "+p1.pesel+" "+wynik);
    }
}
class Pesel{
    	String pesel;
    	Pesel(String numer){
    		pesel=numer;
    	}
    	int spr(){
    	int cyfraK=0;

    	int cyfry[] = new int[11];
    	int wagi[]={1,3,7,9,1,3,7,9,1,3,1};
    	if(pesel.length()!=11) cyfraK=11;
    	else{
    		int suma=0;
    		for(int i=0;i<11;i++){
    			cyfry[i]=3;
    			suma=suma+cyfry[i]*wagi[i];
    		}
    		cyfraK=suma%10;
    	}
    	return cyfraK;
    	}

}
