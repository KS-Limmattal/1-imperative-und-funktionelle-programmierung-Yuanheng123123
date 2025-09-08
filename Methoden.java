import java.lang.Math;
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
    public static double distance(int[] p1,  int[] p2 ){
        double distanceP1P2 = 0.0;
        
        int p1Length = p1.length;
        int p2Length = p2.length;
        if (p1Length != p2Length){
            System.out.println("Fehlerhafter Input");
            return -1;
        }
        for (int n = 0; n < p1Length; n++){
            distanceP1P2 = distanceP1P2 + p1[n]*p1[n] + p2[n]*p2[n];

        }
        distanceP1P2 = Math.sqrt(distanceP1P2);
        return distanceP1P2;



        
        
    

    }

    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(3000));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)

        System.out.println("Aufgabe b)");
        System.out.println(distance(new int[]{3,4,6}, new int[]{7,10,3}));
        System.out.println(distance(new int[]{3,4,6,0}, new int[]{7,10,3}));

        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
