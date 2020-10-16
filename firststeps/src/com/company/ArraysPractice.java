
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    private static final String[] CITIES = {"Budapest", "Békéscsaba", "Debrecen", "Eger"};
    private static final int[][] DISTANCES =
            {       //            Bp      Bcsab   Debr    Eger
                    /*Bp*/        {0, 216, 231, 158},
                    /*Békéscsaba*/{216, 0, 137, 200},
                    /*Debrecen*/  {231, 137, 0, 136},
                    /*Eger*/      {158, 200, 136, 0},
            };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, num1, num2;

        int[] randomNums = new int[15];
        int[] randomNums2 = new int[5];

        int[] evenNumsArr = {18, 0, 6, 13, 18};
        int[] oddNumsArr = {1, 3, 6, 7, 9};
        int[] randomConst = {7, 7, 7, 1, 2, 3, 4, 5, 6, 7,};

        int[] minNumAndIndex = new int[2];

        int[][] matrix = new int[5][5];

        //       System.out.println("A legközelebbi városok távolsága:");
//        System.out.println(minOfMatrix(DISTANCES));
        //       System.out.println(CITIES[indexMinOfMatrix(DISTANCES)[1]]);
        //     System.out.println(CITIES[indexMinOfMatrix(DISTANCES)[0]]);

//        FillMatrix(matrix);
//        ShowMatrix(matrix);


//  Írj programot, ami megállapítja, hogy két tömb ugyanazokat az elemeket tartalmazza-e (függetelnül az elemek sorrendjétől)!


        FillArrayRandomNums(randomNums);

        System.out.println(Arrays.toString(randomNums));
        System.out.println(Arrays.toString(sortArrayByEvenOdd(randomNums)));

        System.out.println("Duplikált számok:" + Arrays.toString(duplicatedNumsInArray(randomNums)));

        System.out.println("Dupnums 1-5: (A helyek jelképezik a számokat. A számok a darabszámokat jelölik)" + Arrays.toString(dupNums(randomConst)));

        System.out.println("DupNums One Iteration: RandomConst" + Arrays.toString(randomConst));
        System.out.println(Arrays.toString(dupNumsOneIteration(randomConst)));


    }  // MAIN vége


    //   **** METÓDUSOK ****


    // Tegyük fel, hogy a tömb csak pozitív számokat tartalmaz és a tömb hossza nagyobb mint a benne található
    // legnagyobb értékű szám. Keress olyan megoldást, amiben egyszer iterálsz végig a tömbbön, és, aminek a
    // tárhely-igénye is minimális. A tömb elemeit módosíthatod. Tipp: mivel a tömb elemei pozitívak egy elemet -1-el
    // szorozva lényegében nem veszítünk információt az elemről (az abszolút értékét véve mindig visszakaphatjuk az
    // eredeti értéket).

    public static int[] markedDupNums(int[] array) {

        for (int cntr = 0; cntr < array.length; cntr++) {

            // HA a szám nem 10 és aszám mint index-hez tartozó szám SEM 10 és nem negatív - Akkor
            if (((array[cntr]) != array.length) && (array[array[cntr]] !=10) &&  (array[array[cntr]] >= 0)) {

                array[array[cntr]]*=-1;
            }

        }
        return array;
    }

    // Duplikátum keresés:
    // Írj programot, ami megadja, hogy egy egész számokat tartalmazó tömbben mely elemek fordulnak elő egynél többször!

    public static int[] duplicatedNumsInArray(int[] arrayToCheck) {

        int[] duplicatedNums = new int[arrayToCheck.length / 2];
        int numIdx = 0;

        for (int cntr = 0; cntr < arrayToCheck.length - 1; cntr++) {
            for (int i = (cntr + 1); i < arrayToCheck.length - 1; i++) {
                if (arrayToCheck[cntr] == arrayToCheck[i]) {
                    duplicatedNums[numIdx] = arrayToCheck[cntr];
                    numIdx++;
                }
            }

        }
        return duplicatedNums;
    }

    // Duplikátum (1-5)
    // a tömb csak 1-től 5-ig tartalmaz számokat? Meg tudod oldani feladatot úgy is hogy, csak
    // egyszer iterálsz végig a tömbbön?

    public static int[] dupNums(int[] arrayToCheck) {
        int[] dNums = new int[5];   // dNums tömb indexei(+1), az arrayToCheck-ben lévő 1-5 számok mennyiségét jelképezik.
        // pl.: dNums[0] == 2  Az (index+1) 1-es szám 2-szer szerepel arrayToCheck-ben.

        for (int cntr = 0; cntr < arrayToCheck.length - 1; cntr++) {
            dNums[arrayToCheck[cntr] - 1]++;
        }
        return dNums;
    }

    // Tfh.: a tömb pozitív számokat tartalmaz, tömb hossza nagyobb mint a benne található legnagyobb
    // értékű szám. Egyszer iterálsz végig a tömbbön, tárhely-igénye minimális.
    // A tömb elemeit módosíthatod.
    // Tipp: mivel a tömb elemei pozitívak egy elemet -1-el szorozva lényegében nem veszítünk
    // információt az elemről (az abszolút értékét véve mindig visszakaphatjuk az eredeti értéket).

    public static int[] dupNumsOneIteration(int[] arrayToCheck) {

        for (int cntr = 0; cntr < arrayToCheck.length - 1; cntr++) {

            if (arrayToCheck[cntr] < 0) {   // Már vizsgáltuk
                arrayToCheck[cntr] = arrayToCheck.length;
            } else {
                arrayToCheck[arrayToCheck[cntr]] *= -1;
            }

        }
        return arrayToCheck;
    }


    // BINÁRIS keresés

    public static int searchBinar(int[] array, int findNum) {
        int idx = 0, startIdx = 0, endIdx;

        endIdx = array.length;


        while ((endIdx - startIdx > 0)) {
            idx = (startIdx + endIdx) / 2;

            if (array[idx] == findNum) {
                return idx;
            } else if (array[idx] < findNum) {
                startIdx = idx;
            } else if (array[idx] > findNum) {
                endIdx = idx;
            }

        }


        return idx;
    }

    // Írj metódust, ami úgy alakít át egy tömböt, hogy a páros elemek a tömb elején, a páratlanok pedig a
    // tömb végén lesznek. Írd meg a metódust úgy is, hogy létrehoz egy új tömböt és úgy is, hogy a
    // paraméterként kapott tömböt módosítja.

    public static int[] sortArrayByEvenOdd(int[] rNums) {
        int oddIndex = 0, evenIndex = rNums.length - 1;
        int[] oddData = new int[3];
        int[] evenData = new int[3];
        int[] tempData = new int[3];

        oddData = findFirstOdd(rNums, oddIndex);
        evenData = findFirstEvenFromBehind(rNums, evenIndex);

        if (oddData[2] == 0) {
            System.out.println("Nincs páratlan szám benne");
            return rNums;
        }
        if (evenData[2] == 0) {
            System.out.println("Nincs páros szám benne");
            return rNums;
        }
        oddIndex = oddData[1];
        evenIndex = evenData[1];

        while (oddIndex < evenIndex) {
            // System.out.println(Arrays.toString(rNums));

            tempData = oddData;
            rNums[oddIndex] = rNums[evenIndex];
            rNums[evenIndex] = tempData[0];

            oddData = findFirstOdd(rNums, oddIndex);
            evenData = findFirstEvenFromBehind(rNums, evenIndex);

            oddIndex = oddData[1];
            evenIndex = evenData[1];

            System.out.println(Arrays.toString(rNums));

        }

        return rNums;
    }

    public static int[] findFirstOdd(int[] rNums, int index) {

        int[] oddNumAndIndex = new int[3];

        for (int counter = index; counter < rNums.length; counter++) {

            if (rNums[counter] % 2 != 0) {
                oddNumAndIndex[0] = rNums[counter];
                oddNumAndIndex[1] = counter;
                oddNumAndIndex[2] = 1;
                //   System.out.println(rNums[counter] + " " + counter + " Findfirst odd: páratlan");
                return oddNumAndIndex;
            } else {
                oddNumAndIndex[0] = 0;
                oddNumAndIndex[1] = 0;
                oddNumAndIndex[2] = 0;
                //   System.out.println(rNums[counter] + " " + counter + " Findfirst odd: páros");

            }

        }
        return oddNumAndIndex;
    }

    public static int[] findFirstEvenFromBehind(int[] rNums, int index) {

        int[] evenNumAndIndex = new int[3];

        for (int counter = index; counter >= 0; counter--) {

            if (rNums[counter] % 2 == 0) {
                evenNumAndIndex[0] = rNums[counter];
                evenNumAndIndex[1] = counter;
                evenNumAndIndex[2] = 1;
                // System.out.println(rNums[counter] + " " + counter + " FindfirstEvenFromBehind : páros");
                return evenNumAndIndex;
            } else {
                evenNumAndIndex[0] = 0;
                evenNumAndIndex[1] = 0;
                evenNumAndIndex[2] = 0;
                //   System.out.println(rNums[counter] + " " + counter + " FindfirstEvenFromBehind : páratlan");

            }

        }
        return evenNumAndIndex;

    }


    //  megállapítja, hogy két tömb ugyanazokat az elemeket tartalmazza-e (függetelnül az elemek sorrendjétől)!

    public static boolean isSameElements(int[] rNums1, int[] rNums2) {

        for (int counter = 0; counter < rNums1.length; counter++) {
            if (rNums1[counter] != rNums2[counter]) {
                return false;
            }
        }
        return true;
    }


    public static int DiagOfMatrix(int[][] matrix) {
        int sumint = 0;

        for (int i = 0; i < matrix.length; i++) {

            sumint += matrix[i][i];
        }
        return sumint;
    }


    public static int sumOfMatrix(int[][] matrix) {
        int sumint = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                sumint += matrix[i][j];
            }
        }
        return sumint;
    }


    public static int[] indexMinOfMatrix(int[][] matrix) {
        int minint = 0;
        int[] indexOfMin = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < minint) {
                    minint = matrix[i][j];
                    indexOfMin[0] = i;
                    indexOfMin[1] = j;
                }
            }

        }
        return indexOfMin;
    }

    public static int minOfMatrix(int[][] matrix) {
        int minint = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > minint) {
                    minint = matrix[i][j];
                }
            }

        }

        return minint;
    }

    public static int maxOfMatrix(int[][] matrix) {
        int maxint = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > maxint) {
                    maxint = matrix[i][j];
                }
            }

        }

        return maxint;
    }


    public static void FillMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + 1);

            }

        }
    }


    public static void ShowMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.print("{ ");

                }

                System.out.print(matrix[i][j]);

                if (j < matrix[i].length - 1) {
                    System.out.print(" , ");
                }

                if (j == matrix[i].length - 1) {
                    System.out.print(" } ");

                }

            }
            System.out.println();

        }


    }

//    public static int[] SortByMinNumAndIndex(int[] rNums){
//        int num;
//
//
//        minOfArrayGreaterThan(randomNums2, num,int index)
//
//    }


    //

    public static int[] firstNPrime(int num) {
        int primeCounter = 0;
        int[] result = new int[num];
        int nrToCheck = 2;

        while (primeCounter < num) {
            if (isPrime(nrToCheck)) {
                result[primeCounter] = nrToCheck;
                primeCounter++;
            }

            nrToCheck++;
        }
        return result;
    }

    // Buborék rendezés

    public static int[] orderBubble(int[] rNums) {
        int tempInt;
        int counter = 0;
        boolean ordered = true;
        int numOfOrderedNumbers = 0;

        while (ordered == true) {

            counter = 0;
            ordered = false;

            while (counter < rNums.length - 1 - numOfOrderedNumbers) {
                if (rNums[counter] > rNums[counter + 1]) {

                    tempInt = rNums[counter];
                    rNums[counter] = rNums[counter + 1];
                    rNums[counter + 1] = tempInt;
                    ordered = true;
                }
                counter++;
            }
            numOfOrderedNumbers++;
        }
        return rNums;

    }


    // Írjunk metódust amely novekvő sorrendbe rendezi a megadott tömböt!

    public static int[] orderingArray(int[] rNums) {
        int minNum = MinNumInArray(rNums);
        int[] orderedArray = new int[rNums.length];

        orderedArray[0] = minNum;

        for (int counter = 1; counter < rNums.length; counter++) {
            orderedArray[counter] = minOfArrayGreaterThan(rNums, orderedArray[counter - 1], counter)[1];
        }
        return orderedArray;
    }


    /**
     * Finds the minimum of nums which is greater than nr
     *
     * @param rNums the array in which we search for a minimum
     * @param nr    the returned value must be greater than this num
     * @return the minimum value of those values that are greater than nr
     */

    public static int[] minOfArrayGreaterThan(int[] rNums, int nr, int indx) {

        int[] minNumAndIndex = new int[2];
        int nextMinNum = biggestNumInArray(rNums);


        for (int counter = indx; counter < rNums.length; counter++) {
            if (rNums[counter] > nr && rNums[counter] < nextMinNum) {
                nextMinNum = rNums[counter];

                minNumAndIndex[1] = counter;
            }
        }

        minNumAndIndex[0] = nextMinNum;

        return minNumAndIndex;

    }

    public static int minOfArrayBiggerThan(int[] rNums, int num) {
        int min = Integer.MIN_VALUE;

        for (int counter = 0; counter < rNums.length; counter++) {
            if ((rNums[counter] < min) && (rNums[counter] > num)) {
                min = rNums[counter];
            }
        }
        return min;
    }


    //  Írj egy metódust, amely meghatározza, hogy mennyi a tömbben szereplő legkisebb érték!

    public static int MinNumInArray(int[] rNums) {
        int minNum = rNums[0];
        int indexOfMinNum = 0;
        for (int counter = 0; counter < rNums.length; counter++) {
            if (rNums[counter] < minNum) {
                minNum = rNums[counter];
            }
        }
        return minNum;
    }

    //  Meghatározza egy kapott tömb középső elemét. Ha a hossza páros akkor a két középső elem közül a bal oldalit.

    public static int midNumArray(int[] rNum) {
        int midnum = 0;

        if (rNum.length % 2 == 0) {
            midnum = rNum[(rNum.length / 2) - 1];

        } else {
            midnum = rNum[rNum.length / 2 - 1];
        }
        return midnum;
    }


    //Szorgalmi 1. Hozz létre egy új 10000 elemű tömböt.
    // Írj egy metódust amely egy paraméterként megkapott tömböt feltölt 0 és 20 közötti véletlen számokkal,
    // és megszámolja, hogy az egyes számokból hány darab van a tömbben. A metódus visszatérési értéke egy olyan
    // 20 elemű tömb legyen, amely leírja, hogy az adott számot hányszor generáltuk bele az eredeti tömbbe!

    public static int[] FillArrayRandomNums(int[] rNums) {

        int[] numOfRandomNums = new int[20];

        for (int counter = 0; counter < rNums.length; counter++) {  // Tömb feltöltése
            rNums[counter] = (int) (Math.random() * 20);
        }
        for (int counter = 0; counter < rNums.length; counter++) {
            numOfRandomNums[rNums[counter]]++;
        }

        return numOfRandomNums;
    }


    // 11. Írj egy olyan metódust, amely egy bemenetül kapott tömböt megfordít! (Hozz létre egy új tömböt,
    // és elemenként másold át a bemeneti tömbből az értékeket az új tömbbe! A visszatérési értéke a
    // metódusnak természetesen ilyenkor az új tömb.)

    public static int[] MirrorArray(int[] rNums) {

        int[] MirArr = new int[rNums.length];


        for (int counter = 0; counter < rNums.length; counter++) {
            MirArr[counter] = rNums[(rNums.length - 1) - counter];
        }

        return MirArr;
    }


    // 10. Írj egy metódust, amely meghatározza, hogy melyik a tömbben szereplő utolsó prímszám!
    // (Miben más ez a feladat a 6-os feladattól?)

    public static int lastPrimeInArray(int[] rNums) {

        int lastPrime = 0;
        for (int counter = 0; counter < rNums.length; counter++) {
            if (isPrime(rNums[counter])) {
                lastPrime = rNums[counter];
            }


        }
        return lastPrime;
    }


    // 9. Írd át fent írt printArray() metódust úgy, hogy a számokat fordított sorrendbe írja ki!
    // (Tehát az első kiírt szám a tömb utolsó legyen, stb.) Rendezni a tömböt nem kell.

    public static void printBackwardArray(int[] rNums) {

        for (int counter = 0; counter < rNums.length; counter++) {
            System.out.println(rNums[rNums.length - 1 - counter]);
        }

    }


    // 8. Írj egy printArray() metódust, amely kiírja a kapott tömb elemeit egymás alá a konzolra!

    public static void printArray(int[] rNums) {

        for (int counter = 0; counter < rNums.length; counter++) {
            System.out.print((counter + 1) + ".: " + rNums[counter] + "  ");
        }
        System.out.println();
    }

    // 7. Írj egy metódust, amely meghatározza, hogy hány prímszám található a tömbben!
    public static int CountedPrimesInArray(int[] rNums) {
        int primeCounter = 0;

        for (int counter = 0; counter < rNums.length; counter++) {
            if (isPrime(rNums[counter])) {
                primeCounter++;
            }


        }
        return primeCounter;
    }


    // 6. Írj egy metódust, amely meghatározza, hogy melyik a tömbben szereplő első prímszám!

    public static int firstPrimeInArray(int[] rNums) {


        for (int counter = 0; counter < rNums.length; counter++) {
            if (isPrime(rNums[counter])) {
                return rNums[counter];
            }


        }
        return 0;
    }

    // 5.b

    public static int biggestNumInArraySmallerThan(int[] rNums, int number) {
        int biggestNum = Integer.MIN_VALUE;

        for (int counter = 0; counter < rNums.length; counter++) {
            if ((rNums[counter] > biggestNum) && (rNums[counter]) < number) {
                biggestNum = rNums[counter];
            }
        }
        return biggestNum;
    }


    // 5. Írj egy metódust, amely meghatározza, hogy mennyi a tömbben szereplő legnagyobb érték!
    public static int biggestNumInArray(int[] rNums) {
        int biggestNum = Integer.MIN_VALUE;

        for (int counter = 0; counter < rNums.length; counter++) {
            if (rNums[counter] > biggestNum) {
                biggestNum = rNums[counter];
            }
        }
        return biggestNum;
    }


    // 4. Írj egy metódust amely meghatározza, hogy hányszor fordul elő olyan a tömbben, hogy egy páratlan számot egy páros követ!

    public static int numOfEvenOddNeighbor(int[] rNums) {
        int sumOfEvenOdd = 0, counter;

        for (counter = 0; counter < rNums.length - 1; counter++) {              // a tömb utolsó előtti eleméig megy,
            if (EvenOddNeighbor(rNums, counter)) {                              // mert az utolsó lesz a szomszédja.
                sumOfEvenOdd++;
                counter++;
            }
        }
        return sumOfEvenOdd;
    }
    // 4.a Jelzi ha a tömb egy bekért sorszámú eleme páratlan szám és azt egy páros követi!

    public static boolean EvenOddNeighbor(int[] rNums, int serialNum) {
        if (rNums[serialNum] % 2 == 0 && rNums[serialNum + 1] % 2 != 0) {
            return true;
        }
        return false;
    }

    // 3. Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok átlaga!

    public static int AvgOfEvenNum(int[] rndmNums) {
        int avg = 0;
        avg = sumOfEvenNum(rndmNums) / rndmNums.length;
        return avg;
    }


    // 2. Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok összege!

    public static int sumOfEvenNum(int[] rNums) {
        int sum = 0;
        for (int index = 0; index < rNums.length; index++) {
            if (rNums[index] % 2 == 0) {
                sum += rNums[index];
            }
        }
        return sum;
    }


    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static boolean isPrime(int nr) {             // Prím e?

        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int indexOfNum(int[] array, int num) {
        int index = -1;
        for (int counter = 0; counter < array.length - 1; counter++) {
            if (array[counter] == num) {
                index = counter;
                return counter;
            }
        }

        return index;
    }

}

