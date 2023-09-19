import java.util.Scanner;
class mountain{
    String name; // название страны
    double square; // площадь страны
    String place;
}
public class individual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
// ВВОД ИНФОРМАЦИИ О СТРАНАХ
        System.out.println("Enter count of mountains=>");
        int n=sc.nextInt(); // количество стран
        mountain[] gora =new mountain[n];
        System.out.println("Enter the information about mountains:");
        for (int i = 0; i < gora.length; i++) {
            sc.nextLine(); // очистка буфера
            gora[i]=new mountain();
            System.out.print("Name "+(i+1)+"th mountain =>");
            gora[i].name=sc.nextLine();
            System.out.print("High "+(i+1)+"th mountain =>");
            gora[i].square=sc.nextDouble();
            System.out.print("Place "+(i+1)+"th mountain =>");
            gora[i].place=sc.nextLine();
        }



// ВЫВОД ПОЛУЧЕННОЙ ИНФОРМАЦИИ
        System.out.println("\n Information:");
        for (mountain mountain : gora) {

            System.out.println(" " + mountain.name + "\t " + mountain.square + "м"+"\t" + mountain.place  );

        }
        int nommax=0; // номер элемента для страны с максимальной

// площадью (начальное значение)

        double max= gora[nommax].square; // максимальная площадь
// (начальное значение)

        for (int i = 0; i < gora.length; i++)
            if (gora[i].square>max) {
                max= gora[i].square;
                nommax=i;
            }
        System.out.println("\n Highest mountain: :");
        System.out.println(" "+gora[nommax].name+"\t"+gora[nommax].square +"м"+"\t" + gora[nommax].place);
// СОРТИРОВКА СТРАН ПО ПЛОЩАДИ
        for (int i = 0; i < gora.length-1; i++)
            for (int j = 0; j< gora.length-1-i; j++)
                if (gora[j].square>gora[j+1].square){
                    mountain rab=gora[j]; // rab – рабочая переменная для перестановки
                    gora[j]=gora[j+1];
                    gora[j+1]=rab;
                }
        System.out.println("\n Sorted list by height:");//
        for (int i = 0; i < gora.length; i++) {
            System.out.println(" "+gora[i].name+"\t"+gora[i].square+"м"+ "\t"+gora[i].place);
        }
// ПЛОЩАДЬ БОЛЬШЕ СРЕДНЕЙ
        double s=0; // суммарная площадь
        for (int i = 0; i < gora.length; i++)
            s+=gora[i].square;
        double sr=s/gora.length; ; // средняя площадь
        System.out.println("Average height ="+sr);
        System.out.println("\n Mountains with a height of more than 1000 m:");
        for (int i = 0; i < gora.length; i++) {
            if (gora[i].square>1000)

                System.out.println(gora[i].name +"\t"+gora[i].square +"м"+ "\t"+gora[i].place);
        }
// ПОИСК ПО НАЗВАНИЮ
        sc.nextLine(); // очистка буфера
        System.out.println("Enter the name of the mountain you are looking for=>");
        String name=sc.nextLine();
        int nom=-1; // 1 – страна с искомым названием отсутствует
        for (int i = 0; i < gora.length; i++)
            if (name.equalsIgnoreCase(gora[i].name))
                nom=i;
        if (nom!= -1) {
            System.out.println("Such a mountain is on the list. It is: " + gora[nom].name+" "+gora[nom].square+"м"+gora[nom].place);
            System.out.println("Enter field that you want to change");
            String indexxxx=sc.nextLine();
            System.out.println("Enter tha new value of a field");
            String newvalue=sc.nextLine();
            if(indexxxx=="place") {

            }
                


            

        }else System.out.println("Such a mountain is not on the list");
    }
}
