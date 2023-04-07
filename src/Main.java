import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        завдання 1
        Scanner scn= new Scanner(System.in);
        String[] wrds = new String[5];
        String sn ="";
        System.out.println("Введіть 5 слів: ");
        for (int i=0;i<wrds.length;i++){
            wrds[i]=scn.next();
            sn=sn.concat(wrds[i]+" ");
        }
        System.out.println(sn);
        System.out.println();


//        завдання 2
        for (int i=0;i<5;i++){
            System.out.println("Перша літера "+(i+1)+" слова: "+wrds[i].substring(0,1));
        }
        System.out.println();


//        завдання 3
        Scanner scnr= new Scanner(System.in);
        double dr []= new double[3];
        System.out.println("Введіть 3 дробових числа через ',': ");
        if (scnr.hasNextDouble()) {
            double c = dr[0];
            for (int i = 0; i < 3; i++) {
                dr[i] = scnr.nextDouble();
                if (dr[i]>c) c=dr[i];
            }
            System.out.println("Найбільше: "+c);
        }
        else System.out.println("Помилка! Ви ввели НЕ дріб!");
        System.out.println();


//        завдання 4
        Scanner scan= new Scanner(System.in);
        System.out.print("Перше ім'я - ");
        String name1=scan.next();
        System.out.print("Друге ім'я - ");
        String name2=scan.next();
        if (name1.equalsIgnoreCase(name2)==true) System.out.println("Ідентичні!");
        else System.out.println("Помилка! Імена НЕ однакові !");
        System.out.println();


//        завдання 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Перший рядок - ");
        String str1=scanner.nextLine();
        System.out.print("Другий рядок - ");
        String str2=scanner.nextLine();
        if (str1.length()>str2.length()) System.out.println("1 рядок більше");
        else if (str1.length()<str2.length()) System.out.println("2 рядок більше");
        else System.out.println("Рядки рівні за кількістю символів!");
        System.out.println();






    }
}