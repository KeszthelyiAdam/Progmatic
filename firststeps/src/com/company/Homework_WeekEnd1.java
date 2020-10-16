package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework_WeekEnd1 {

    public static void main(String[] args) {

        int num1, num2, num3, userNumber;
        double dnum1, dnum2, dnum3;
        boolean bool_1;

        String str1, str2, str3;

        Scanner sc = new Scanner(System.in);


    /*  *** Több soros Kikommentelés ***

        // Írj programot, ami bekér a felhasználótól két számot, és megmondja, hogy a második szám osztója-e az elsőnek
        // (első szám másodikkal vett osztási maradéka nulla-e).

        System.out.println("Adj meg két számot és megmondom, hogy a második szám osztója-e az elsőnek!");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        if (num1 % num2 == 0) {
            System.out.println("A második szám osztója az elsőnek  ");
        } else {
            System.out.println("A második szám NEM osztója az elsőnek  ");
        }
        // *** ELSŐ VÉGE







        // Írj Frodo-reference-age programot. Frodo 33 éves a Lord of the Rings elején, és 50, amikor útnak indul a
        // gyűrűvel. Írj programot, ami bekéri a felhasználó korát, és megadja, hogy az hogyan viszonyul Frodo e két
        // életkorához. Pl., ha a felhasználó 40 éves, a program ezt írja ki: "Ön 7 évvel idősebb, mint Frodo Bilbó
        // 101-edik születésnapján, és 10 évvel fiatalbb mint amikor útrakelt."


        System.out.println("Add meg a korodat!");
        int userAge = sc.nextInt();

        if (userAge < 33) {
            System.out.println((33 - userAge) + "-évvel fiatalabb mint...101... ");

        } else if (userAge == 33) {
            System.out.println("Ön pont annyi idős mint..101... ");

        }else {
            System.out.println( (userAge-33) + "évvel idősebb mint...101... " );
        }

        if (userAge < 50) {
            System.out.println((50 - userAge) + "-évvel fiatalabb mint...útnak indul... ");

        } else if (userAge == 50) {
            System.out.println("Ön pont annyi idős mint..útnak indul... ");

        }else {
            System.out.println( (userAge-50) + "évvel idősebb mint...útnak indul... " );
        }
        // *** 2. Frodó VÉGE




       // Írj programot, ami bekér a felhasználótól egy számot, majd hozzáad egyet. Az új számot kiírja a képernyőre,
       // és ha az új szám nagyobb mint az előző (nem elírás), akkor kiírja, hogy "Bi-bi-bíííí, én nyertem".
       // Ha kisebb, akkor pedig azt, hogy ("Ohh. Te nyertél"). Tudsz nyerni ebben a játékban? (Tipp: igen, tudsz).

        System.out.println("Adj meg egy számot!");
        int num1 = sc.nextInt();

        System.out.println(num1+1);

        if (num1+1 < num1) {
            System.out.println( "Bibibiii én nyertem ");

        } else {
            System.out.println("Te nyertél.. mert mínusz számot adtál meg..");

        }
       // *** 3. Bi-bi-biii ..  VÉGE




        // Írj a négy alapműveletet tudó számológépet. A prgram kérjen be a felhasználótól két számot és egy műveleti
        // jelet. A műveleti jel lehet: +, - *, /. Ezután a program alkalmazza a műveleti jelet a két számra és írja ki
        // az eredményt!

        System.out.println("Adj meg két számot és egy műveleti jelet! ( + , - , * , / )");

        float num11 = sc.nextInt();
        float num22 = sc.nextInt();
        String sign = sc.next();

        if (sign.equals("+")) {
            System.out.println("A két szám összege: " + (num11 + num22));

        } else if (sign.equals("-")) {
            System.out.println("A két szám különbsége: " + (num11 - num22));

        } else if (sign.equals("*")) {
            System.out.println("A két szám szorzata: " + (num11 * num22));

        } else if (sign.equals("/")) {
            if (num22 == 0) {
                System.out.println("Nullával nem osztunk! ");
            } else {
                System.out.println("A két szám hányadosa: " + (num11 / num22));

            }
        } else {
            System.out.println("A megadott karaktert nem tudom értelmezni. " + sign);
        }
        // *** 3. Bi-bi-biii ..  VÉGE




        // Írj gondoltam egy számot játékot! A program generáljon egy véletlen számot 1 és 20 között, majd kérdezze
        // meg a felhasználót: "Szerinted mely számra gondoltam?". Ellenőrizze, hogy a felhasználó által beírt tipp
        // megegyezik-e az általa generált véletlen számmal. Ha nem, írja ki, hogy “Tippelj újra!”, és adjon
        // lehetőséget az újabb tippre. Ha a felhasználó eltalálta a generált számot, akkor a program írja ki, hogy
        // “GRATULÁLOK”, majd álljon le!

        //  Módosítsd a fenti programot úgy, hogy rossz tipp esetén azt is írja ki, hogy a program által generált
        //  véletlenszám nagyobb vagy kisebb-e a felhasználó tippjénél!


        Random rand = new Random();
        int randNum = rand.nextInt(20);
        System.out.println("Gondoltam egy  számra 1-től 20-ig..Tippelj melyik az!   " + randNum);


        int num1 = sc.nextInt();
        boolean foundout = false;

        while (foundout == false) {
            if (randNum == num1) {
                System.out.println("Gratulálok!! :) " + randNum);
                foundout = true;
            } else {
                System.out.println("Nem talált " + randNum);
                if (num1 < randNum) {
                    System.out.println("Ennél több..");

                } else {
                    System.out.println("Ennél kevesebb..");

                }

                System.out.println("Tippelj újra! " + randNum);
                num1 = sc.nextInt();
            }
        }

        // *** Gondoltam egy számra ..  VÉGE



        // Egy bolha az alábbi módszer szerint ugrál egy bálna hátán: egyet (egy cm-t) előre, egyet hátra, kettőt előre,
        // egyet hátra, hármat előre, egyet hátra, stb… (tehát előre ugrás után mindig ugrik egyet hátra, és hátra ugrás
        // után eggyel nagyobbat ugrik előre mint az előző előre ugrásban ugrott - időközben ugyanis megerősödik és
        // egyre nagyobbakat tud ugrani).

        //Hol lesz a bolha száz ugrás után? (1225)
        //A bálna hátán 5 cm-enként vannak csiklandós pontok. Hány csiklandós pontot érint a bolha, ha a bálna 10 m
        // hosszú (a bolha a bálna orra hegyétől indul, ami maga is egy csiklandós pont)? (19)

        int jumpNum, forward, position, numOfPoints;
        forward = 1;
        position = 0;
        numOfPoints = 0;

        System.out.println("Hányat ugorjon a bolha?");
        jumpNum = sc.nextInt();

        for (int jumpPair = 1; jumpPair <= jumpNum / 2; jumpPair++) {
            System.out.println(jumpPair + "-adik ugráspárnál");
            System.out.println((forward) + "-t ugrott utoljára előre");
            System.out.println(position + "-ik cm-nél tart");

            if ((position + 1) % 5 == 0) {
                numOfPoints++;
            }
            if (position % 5 == 0) {
                numOfPoints++;
            }
            System.out.println(numOfPoints + "db Csikis pontot érintett.");
            position += forward++;
        }


        forward = 1;
        position = 0;
        numOfPoints = 0;
        while (position <= 1000) {
            System.out.println(position + "-ik cm-nél tart");
            if ((position + 1) % 5 == 0) {
                numOfPoints++;
                System.out.println((position+1) + "is Csikis pont");
            }
            if (position % 5 == 0) {
                numOfPoints++;
                System.out.println((position) + "is Csikis pont");
            }
            position += forward++;
            System.out.println(numOfPoints + "db Csikis pontot érintett.");

        }
        System.out.println((numOfPoints+1) + "db Csikis pontot érintett a bolha HA azt feltételezzűk," +
                " hogy az utolsó ugrásánál pont a bálna végére ugrik.");

*/

        /*  *** Több soros Kikommentelés ***

         *** Több soros Kikommentelés VÉGE    */



     /* System.out.println("Kérek egy számot!");
        userNumber = sc.nextInt();

        numdiv7 = isDiv7(userNumber);

        if (isDiv7(userNumber)) {
            System.out.println("Osztható 7-el");
        } else {
            System.out.println("Nem Osztható 7-el");
        }


// ***


        System.out.println("Adja meg az A oldalt!");
        num1 = sc.nextInt();
        System.out.println("Adja meg az B oldalt!");
        num2 = sc.nextInt();
        System.out.println("Adja meg az C oldalt!");
        num3 = sc.nextInt();

        if (ableToDrawTriangle(num1, num2, num3)) {
            System.out.println("Készíthető háromszög.");
        } else {
            System.out.println("Nem Készíthető háromszög.");
        }


        System.out.println("Adja meg az A oldalt!");
        num1 = sc.nextInt();
        System.out.println("Adja meg az B oldalt!");
        num2 = sc.nextInt();
        System.out.println("A derékszögű háromszög átfogója:");
        dnum3 = rightAngleTriangle(num1, num2);
        System.out.println(num3);


        System.out.println("Kérek egy számot!");
        userNumber = sc.nextInt();
        num1 = countDivisors(userNumber);
        System.out.println(num1 + "  osztója van");

        num1 = sumDivisors(userNumber);
        System.out.println(num1 + "  az osztóinak összege.");

        bool_1 = partOfFibonacci(userNumber);
        System.out.println(" Fibonacci sorozat része e? " + bool_1);


        System.out.println("Kérek két számot!");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        bool_1 = twinPrime(num1, num2);
        System.out.println("A két szám ikerprim e? " + bool_1);

        System.out.println("Hányszor dobjak a kockával?  ");
        num1 = sc.nextInt();
        num2 = diceNtimes(num1);
        System.out.println("A dobott Hat-osok száma: " + num2);


        System.out.println(" 1 és általad megadott szám között megszámoljuk a tokéletes számokat:");
        userNumber = sc.nextInt();
        num1 = perfectNumTh(userNumber);
        System.out.println(" 1 és N közötti tokéletes számok száma:" + num1);



        System.out.println(" Általad megadott számnál nagyobb  tokéletes számot keresünk:");
        userNumber = sc.nextInt();
        num1 = perfectNumBiggerThan(userNumber);
        System.out.println(" Általad megadott számnál nagyobb  tokéletes szám:" + num1);



        System.out.println(" sumDivisorsFull ellenőrzése ");
        userNumber = sc.nextInt();
        num1 = sumDivisorsFull(userNumber);
        System.out.println(" Általad megadott szám osztóösszege " + num1);

        System.out.println(" szuperpörfikt :))  ellenőrzése ");
        userNumber = sc.nextInt();
        bool_1 = superPerfect(userNumber);
        System.out.println(" igazhamis :  " + bool_1);

        System.out.println(" Five szuperpörfikt :))  ellenőrzése ");
        fiveSuperPerfect(userNumber);

        System.out.println(" Stringek összeadásának ellenőrzése ");
        System.out.println("add meg az első sztringet");
        str1 = sc.next();
        System.out.println("add meg a második sztringet");
        str2 = sc.next();
        num1=AddedStringsLength(str1, str2);
        System.out.println("az összeadott sztringek hossza: "+ num1);

        System.out.println(" isMKPerfect  ellenőrzése, adja meg  m-,k- és N számokat! ");
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        userNumber = sc.nextInt();

        for (num1 = 1; num1 <= userNumber; num1++) {
            if (isMKPerfect(num2, num3, num1)) {
                bool_1 = true;
                System.out.println(num1 + " " + num2 +" "+ num3 + " perfect :  " + bool_1);
            }
        }
*/

    }  // Main vége


    // Metódusok ***

    // Írj metódust, ami kiszámolja,hogy két String együttesen (összefűzve) milyen hosszú lesz!

    public static int AddedStringsLength(String s1, String s2) {
        String s3 = s1 + s2;
        int stringLength = 0;
        stringLength = s3.length();
        return stringLength;
    }

    // Egy n számot (m, k)-tökéletesnek nevezünk, ha véve a szám osztóösszegét, majd az eredmény osztóösszegét, majd… (összesen m-szer) épp a szám k-szorosát kapjuk.
    //Pl. 42 (2,6)-tökéletes szám, mivel 42 osztóösszegének az osztóösszege épp 6*42.
    //Vagy pl. egy k szám (3,6) tökéletes, ha 3-szor véve az osztóösszegét az eredeti 6-szorosát kapjuk, azaz
    //
    //osztóösszeg(osztóösszeg(osztóösszeg(k))) = 6k
    //Vegyük észre, hogy a tökéletes számok (1,2)-tökéletesek, a szupertökéletesek pedig (2, 2)-tökéletesek.
    //Írjunk metódust, ami eldönti, hogy egy szám (m-k) tökéletes-e!
    //Metódusunk szignatúrája legyen az alábbi:
    //
    //boolean isMKPerfect(int m, int k, int number)
    //
    //Határozzuk meg az első 3 (2,10)-tökéletes számot!
    //Írd át azt a metódusodat, ami a eldöntötte, hogy egy szám tökéletes-e úgy hogy az (m,k) tökéletes metódust
    // használja. Hasonlóan írd át a szupertökéletességet eldöntő metódusodat is!

    public static boolean isMKPerfect(int m, int k, int number) {
        int counter = 1;
        int actualNum;
        actualNum = number;

        for (counter = 1; counter <= m; counter++) {
            actualNum = sumDivisorsFull(actualNum);
        }
        if (actualNum == number * k) {
            return true;
        } else {
            return false;
        }

    }


    //15.  Egy szám osztóösszegének nevezzük az összes osztójának (beleértve az 1-et és önmagát is) az összegét.
    // Egy számot szupertökéletesnek nevezünk, ha osztóöszzegének az osztóösszege megegyezik a szám kétszeresével.
    //Pl. a 4 szupertökéletes szám, mert 4 osztóösszege: 1+2+4 = 7, és 7 osztóösszege: 1+7=8, ami épp 2*4.
    //Írj metódust, ami egy számról eldönti, hogy szupertökéletes-e!

    public static boolean superPerfect(int number) {
        if (sumDivisorsFull(sumDivisorsFull(number)) == 2 * number) {
            return true;
        }
        return false;
    }


    //Írj programot, ami megkeresi az első 5 szupertökéletes számot!

    public static int fiveSuperPerfect(int number) {
        int checknum = 1;
        int count = 0;
        while (count <= 5) {

            if (sumDivisorsFull(sumDivisorsFull(checknum)) == 2 * checknum) {
                count++;
                System.out.println(checknum + "szuper tökéletes szám");
                checknum++;
            } else {
                checknum++;
            }

        }
        return checknum;
    }


    //15.1 Osztóösszeg

    public static int sumDivisorsFull(int number) {
        int divider = 1;
        int sum = 0;
        int numOfDivider = 0;
        while (divider <= number) {
            if (number % divider == 0) {
                sum += divider;
                numOfDivider++;
            }

            divider++;
        }
        return sum;
    }


    //   14.  Írj metódust, ami megkeresi az egy paraméterül kapott számnál nagyobb első tökéletes számot!

    public static int perfectNumBiggerThan(int num) {
        int checknum = num + 1;
        boolean numFound = false;

        while (!numFound) {
            if (perfectNum(checknum)) {
                numFound = true;
                return checknum;
            }
            checknum++;
        }
        return checknum;
    }


    // 13.  Írj metódust, ami megszámolja, hogy 1 és (int num) között hány tökéletes szám van!

    public static int perfectNumTh(int num) {
        int checkNum, counter = 0;
        for (checkNum = 1; checkNum <= num; checkNum++) {
            if (perfectNum(checkNum)) {
                System.out.println(checkNum + "Tökéletes szám");
                counter++;
            }

        }
        return counter;
    }

    //A számelméletben tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál kisebb
    // osztóik összegével. Pl. tökéletes szám a 6, mert önmagánál kisebb osztói: 1, 2, 3 és 1+2+3=6.
    // Írj metódust, ami egy számról eldönti, hogy tökéletes szám-e!

    public static boolean perfectNum(int num) {
        int divSum = sumDivisors(num);
        if (divSum == num) {
            return true;
        }
        return false;
    }


    //10.  Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hányszor sikerült két 6-ost dobni
    // egymás után.(Az 1, 6, 6, 6, 1 sorozatban az első két hatos számít egy duplának, a harmadik hatos már nem.
    // Az 1, 6, 6, 6, 6, 1 sorozatban két dupla 6-os van egymás után.)

    // 9.     Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hány 6-ost sikerült eközben dobni.

    public static int diceNtimes(int num) {
        int diceIsSix = 0;
        int diceIsSixDouble = 0;
        Random rand = new Random();
        int randNum;

        for (int i = 1; i <= num; i++) {

            randNum = rand.nextInt(6) + 1;
            System.out.println("A dobott szám: " + randNum);
            if (randNum == 6) {
                diceIsSix++;
                if (diceIsSix == 2) {
                    diceIsSixDouble++;
                    diceIsSix = 0;
                }
            } else {
                diceIsSix = 0;
            }
        }
        return diceIsSixDouble;
    }


    //  8.     Írj egy metódust, amely visszaadja egy bemenetül kapott egész szám számjegyeinek az összegét!


    // Írj metódust, amely két bemeneti számról eldönti, hogy azok ikerprímek-e. (Ikerprímnek két olyan prímszám
    // együttesét nevezzük, amelyek 2-vel térnek el egymástól: például 5 és 7, vagy 41 és 43.)

    public static boolean twinPrime(int num1, int num2) {
        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int nr) {             // Prím e?

        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }


    //  Írj egy metódust, mely egy számról eldönti, hogy eleme-e a Fibonacci-sorozatnak!

    public static boolean partOfFibonacci(int numberToCheck) {
        int a, b = 1;
        int sum = 1;
        while (sum <= numberToCheck) {
            if (sum == numberToCheck) {
                return true;
            } else {
                a = b;
                b = sum;
                sum = a + b;
            }


        }
        return false;


    }


    //  Írj metódust, amely visszaadja egy szám nála kisebb osztóinak összegét! (Tehát a 8-ra ez az összeg 1+2+4 = 7.)
    //static int sumDivisors(int n);

    public static int sumDivisors(int number) {
        int divider = 1;
        int sum = 0;
        int numOfDivider = 0;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                sum += divider;
                numOfDivider++;
            }

            divider++;
        }
        return sum;
    }


    // Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott int számnak hány osztója van!
    // static int countDivisors(int n);

    public static int countDivisors(int number) {
        int divider = 1;
        int numOfDivider = 0;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                System.out.println(divider + "  osztója a számnak.");
                numOfDivider++;
            }
            divider++;
        }
        return numOfDivider;
    }


    // Írj metódust, ami a két befogó hosszát paraméterül adva kiszámolja, hogy mennyi a derékszögű háromszög átfogója!
    // static double rightAngleTriangle(double a, double b);


    public static double rightAngleTriangle(double sideA, double sideB) {
        return Math.sqrt((sideA * sideA) + (sideB * sideB));

    }


    // Írj egy metódust, amely eldönti három (nem feltétlen egész) számról, hogy lehet-e ilyen hosszú szakaszokból
    // háromszöget szerkeszteni! (Megj: akkor szerkeszthető háromszög, ha mindhárom oldal kisebb, mint a másik kettő
    // összege.) static boolean canDrawTriangle(double a, double b, double c);


    public static boolean ableToDrawTriangle(int sideA, int sideB, int sideC) {
        if ((sideA + sideB > sideC) && (sideA < sideB + sideC) && (sideA + sideC > sideB)) {
            System.out.println("Készíthető háromszög. Metóduson belül");
            return true;
        }
        return false;
    }

    // Írj metódust, ami kiszámolja két egész szám minimumát!

    public static int minOfInts(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }

    }
    // Írj metódust, ami kiszámolja két egész szám maximumát!

    public static int mmaxOfInts(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }

    }

    //   Írj metódust, amely eldönti egy bemenetként kapott int számról, hogy az osztható-e 7-tel!

    public static boolean isDiv7(int n) {
        if (n % 7 == 0) {
            return true;
        }
        return false;
    }


    // Metódusok VÉGE ***

}  // public class Homework_WeekEnd1
