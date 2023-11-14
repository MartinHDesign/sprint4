package uppgift5aTelefonbok.server;

import java.time.LocalDate;
import java.util.List;

public class Dao {
    Kompis1 k1 = new Kompis1("Martin", "0701234567",
            LocalDate.of(1990,3,1),"m@mail.com");
    Kompis1 k2 = new Kompis1("johanna", "0701234567",
            LocalDate.of(1992,3,1),"j@mail.com");
    Kompis1 k3 = new Kompis1("lennart", "0701234567",
            LocalDate.of(1951,3,1),"l@mail.com");
    Kompis1 k4 = new Kompis1("irene", "0701234567",
            LocalDate.of(1953,3,1),"i@mail.com");

    List<Kompis1> dataList = List.of(k1,k2,k3,k4);

    public Dao(){}

    public Kompis1 searchKompis(String name1){
        for(Kompis1 k:dataList){
            if (k.getName1().equalsIgnoreCase(name1)){
                return k;
            }
        }
        return null;
    }

    public String printAllData(Kompis1 k){
        return k.name1 + " " + k.phoneNumber + " " + k.birthday.toString() + " " + k.email;
    }

}
