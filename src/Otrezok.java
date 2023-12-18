

//Ñîçäàòü ïğîãğàììó, êîòîğàÿ áóäåò ïğîâåğÿòü ïîïàëî ëè ñëó÷àéíî âûáğàííîå èç îòğåçêà [5;155] öåëîå ÷èñëî â èíòåğâàë (25;100) è ñîîáùàòü ğåçóëüòàò íà ıêğàí.
//Ïğèìåğû ğàáîòû ïğîãğàììû:
//×èñëî 113 íå ñîäåğæèòñÿ â èíòåğâàëå (25,100).
// ×èñëî 72 ñîäåğæèòñÿ â èíòåğâàëå (25,100).
//×èñëî 25 íå ñîäåğæèòñÿ â èíòåğâàëå (25,100)
// ×èñëî 155 íå ñîäåğæèòñÿ â èíòåğâàëå (25,100)
import java.util.Random;


    public class Otrezok {
        public static void main(String[] args) {

            Random rnd = new Random(System.currentTimeMillis());
            int min = 5;
            int max = 155;
            int number = min + rnd.nextInt(max - min + 1);

            if (number>=25 && number<=100) {
                System.out.println("×èñëî " + number + " ñîäåğæèòñÿ â èíòåğâàëå (25,100).");
            }
            else {
                System.out.println("×èñëî " + number + " íå ñîäåğæèòñÿ â èíòåğâàëå (25,100).");
            }
        }
    }
