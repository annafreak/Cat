import java.time.LocalDate;


 public class Kot{
  private  String imie;
 private  LocalDate dataUrodzenia;
 private  double waga;
 private  String imieOpiekuna;




 public Kot ( String imie, LocalDate dataUrodzenia, double waga, String imieOpiekuna ){
   this.imie = imie;
   this.dataUrodzenia = dataUrodzenia;
  this.waga = waga;
  this.imieOpiekuna = imieOpiekuna;

 }

 public String introduceMyMaster() {
  return imie + " "  +
          dataUrodzenia + " "  +
          waga + " "  +
          imieOpiekuna;
 }

  public static void main(String[] args) {

   Kot kot = new Kot("Admiroslaw Bachaczov ", LocalDate.of (2021,05,11), 110.1,"Arbagadov");
   System.out.println(kot.introduceMyMaster());
  }
 }