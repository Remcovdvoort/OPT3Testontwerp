public class Cijfer {
    private Double cijfer;

    public Cijfer(Double cijfer){
        this.cijfer=cijfer;
    }
    public String getBeoordeling(){
        if(cijfer>=1.0 && cijfer<5.5){
            return "Onvoldoende";
        }
        if(cijfer>=5.5 && cijfer<7.0){
            return "Ruim voldoende";
        }
        if(cijfer>=7.0 && cijfer<=10.0){
            return "Goed";
        }
        return "Foutief cijfer ingevoerd";
    }
}
