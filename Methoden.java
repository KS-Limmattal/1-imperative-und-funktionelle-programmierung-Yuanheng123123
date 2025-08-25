public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static String hours(Integer Sekunden){
        int stunden = Sekunden / 3600;          
        int minuten = (Sekunden % 3600) / 60;  
        int sek = Sekunden % 60;  



        String hh = (stunden < 10 ? "0" : "") + stunden;
        String mm = (minuten < 10 ? "0" : "") + minuten;
        String ss = (sek < 10 ? "0" : "") + sek;
        String hours = hh + ":" + mm + ":" + ss;


        
        return hours;

        

    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
