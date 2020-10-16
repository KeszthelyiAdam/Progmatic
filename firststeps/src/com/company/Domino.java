package com.company;

// Hozz létre egy Domino classt
//melynek 2 int final fieldje van,
// melyben a domino jobb és bal oldalán lévő számok szerepelnek

//2 metódust tartalmaz, mely vissza adja a jobb vagy a bal oldalát.
//Hozz létre egy Dominos classt melyben példányosítod a következő dominókat:

// (5, 2)
// (4, 6)
// (1, 5)
// (6, 7)
// (2, 4)
// (7, 1)
// Tedd ezeket a dominókat egy tömbe, majd írj egy metódust, ami sorba rendezi őket valahogy így : [2, 4], [4, 3], [3, 5] ...

public class Domino {

  final int side1;
  final int side2;


   public Domino(int side1, int side2){

       this.side1 = side1;
       this.side2 = side2;
   }

}
