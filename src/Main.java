import java.util.*;

class SkrivTal {

    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[1000];             //int med 1000 platser
        int antal = 0;                          //en int (antal) med värde 0
        while (sc.hasNextInt())                 //ökar antal med 1 för varje värde som läggs till
            list[antal++] = sc.nextInt();

        System.out.println("Talen är:");
        for (int i=0; i<antal; i++) {               //En loop som kollar alla tal och tar bort dubletter
            boolean dubbla = false;
            for (int j=0; j<i && !dubbla; j++)
                if (list[j] == list[i])
                    dubbla = true;
            if (!dubbla)
                System.out.print(list[i] + "  ");
        }
        System.out.flush();
    }
}