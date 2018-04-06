import java.util.*;

public class Main {
    public static void main(String[] args) {
            /*Map<Frakzia, List<PowerMan>> frakzia = new HashMap<>();


//        Map<String, PowerMan> frakziaOfDeputats = new HashMap<>();
        List<PowerMan> frakziaOfDeputats = new ArrayList<>();
        frakziaOfDeputats.add(new PowerMan(1234, 123,"Orest", "Kuplin", 12, false));


        Map<ArrayList<PowerMan> , Map<Frakzia, List<PowerMan> >> parlament = new HashMap<>();
        parlament.put((ArrayList<PowerMan>) frakziaOfDeputats, frakzia);


//        frakziaOfDeputats.put("one" ,new PowerMan("Orest", "Kuplin", 12, false));"one" ,new PowerMan("Orest", "Kuplin", 12, false));
//        parlament.put("Turkey", frakzia);

//        System.out.println(frakzia.put("two" ,new PowerMan("Nazar", "lox", 8, false)));


        frakzia.put(new Frakzia("Retro"), frakziaOfDeputats);
        System.out.println(parlament);


       *//* Map<String, PowerMan> turka = new HashMap<>();
        deputatsOfTurka.put("one" ,new PowerMan("Orest", "Kuplin", 12, false));

        Map<String, Map<String, PowerMan>> parlament = new HashMap<>();
        parlament.put("Turkey", turka);


        System.out.println(turka.put( "two" ,new PowerMan("Nazar","lox", 8, false)));
        System.out.println(parlament);*//*

*/
        while (true){menu();}
    }
/*-------------------------------------------------------Map&&List()--------------------------------------------------*/
    public static ArrayList<PowerMan> person1 = new ArrayList<>();
    public static ArrayList<PowerMan> person2 = new ArrayList<>();
    public static ArrayList<PowerMan> person3 = new ArrayList<>();
    public static ArrayList<PowerMan> person4 = new ArrayList<>();
    public static ArrayList<PowerMan> person5 = new ArrayList<>();

    public static Map<String, ArrayList<PowerMan>> parlament  = new HashMap<>();


/*--------------------------------------------------------Menu()------------------------------------------------------*/
    public static void menu(){

        parlament.put("Roman", new ArrayList<PowerMan>());
        parlament.put("Taras", new ArrayList<PowerMan>());
        parlament.put("Ira", new ArrayList<PowerMan>());



        System.out.println(
                "Вибери дію: \n" +
                "1.Створити фракцію \n" +
                "2.Видалити фракцію \n" +
                "3.Очистити фракцію \n" +
                "4.Вивести всі фракції \n" +
                "5.Вивести фракцію(показати депутатів з неї) \n" +
                "6.Додати депутата у фракцію \n" +
                "7.Видалити депутата \n" +
                "8.Вивести хабарників \n" +
                "9.Вивести найбільшого хабарника");
            switch (scannerOr()) {
                case 1:  creatFrakzia();  break;
                case 2:  removeFrakziaIterator(); break;
                case 3:    break;
                case 4:    break;
//                case 5:  soutFrakzia();  break;
                case 6:  creatDeputat(parlament); break;
                case 7:    break;
                case 8:    break;
                case 9:  getDeputatIterator(parlament);  break;
        }
    }

/*----------------------------------------------------creatFrakzia()--------------------------------------------------*/
    public static void creatFrakzia(){
        System.out.println(
                "Виберіть шаблон Фракції: \n" +
                "(1-5)");
      parlament.put(scannerString(), new ArrayList<PowerMan>());
        System.out.println(parlament);

//            switch (scannerOr()){
//
//            }
    }
/*---------------------------------------------------removeFrakzia()---------------------------------------------------*/

    public static void removeFrakziaIterator(){

//        System.out.println(parlament);
//        System.out.println("Введіть назву");
//        parlament.remove
//        System.out.println(parlament);

//        System.out.println(parlament);
//        for(Iterator<Map.Entry<Frakzia, ArrayList<PowerMan>>> it = parlament.entrySet().iterator(); it.hasNext(); ) {
//            Map.Entry<Frakzia, ArrayList<PowerMan>> entry = it.next();
//            if(entry.getKey().equals(scannerString())) {
//                it.remove();
//            }
//
//        }
//        System.out.println(parlament);
    }

/*---------------------------------------------------creatDeputat()---------------------------------------------------*/
    public static void creatDeputat(Map<String, ArrayList<PowerMan>> parlament){

        Iterator<String> parlament1 = parlament.keySet().iterator();
            parlament.entrySet();
        }

//        System.out.println(
//                "Введіть через enter: \n" +
//                "Фракцію \n" +
//                "Вагу депутата \n" +
//                "Висоту \n" +
//                "ім'я \n" +
//                "прізвище \n" +
//                "вік.");
//        switch (scannerOr()){
//            case 1:
//                person1.add(new PowerMan(scannerInteger(), scannerInteger(),
//                    scannerString(), scannerString(), scannerInteger(), false));   break;
//            case 2:
//                person2.add(new PowerMan(scannerInteger(), scannerInteger(),
//                    scannerString(), scannerString(), scannerInteger(), false));   break;
//            case 3:
//                person3.add(new PowerMan(scannerInteger(), scannerInteger(),
//                    scannerString(), scannerString(), scannerInteger(), false));   break;
//            case 4:
//                person4.add(new PowerMan(scannerInteger(), scannerInteger(),
//                    scannerString(), scannerString(), scannerInteger(), false));   break;
//            case 5:
//                person5.add(new PowerMan(scannerInteger(), scannerInteger(),
//                    scannerString(), scannerString(), scannerInteger(), false));   break;
//        }

/*--------------------------------------------------coutParlament()---------------------------------------------------*/
    public static void coutParlament(){
        System.out.println(parlament);
    }
/*------------------------------------------------------setJok()------------------------------------------------------*/


/*--------------------------------------------------soutFrakzia()------------------------------------------------------*/

    public static void getDeputatIterator(Map<String, ArrayList<PowerMan>> parlament){

//        Iterator<ArrayList<PowerMan>> person1 = person.iterator();
//        while (person1.hasNext()){
//            PowerMan powerMan = person1.next();
//            System.out.println(powerMan.getName());
//        }

        System.out.println(parlament.values());
    }

    public static void setJok(){

    }
/*------------------------------------------------------Scanner()-----------------------------------------------------*/
    public static Integer scannerOr(){
        Integer or = new Scanner(System.in).nextInt();
        return or;
    }
    public static Integer scannerInteger(){
        Integer Integer = new Scanner(System.in).nextInt();
        return Integer;
    }
    public static String scannerString(){
        String name = new Scanner(System.in).nextLine();
        return name;
    }
}

