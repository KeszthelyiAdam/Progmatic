package com.company;

import education.Point;

public class Planet {
    static Pokemon[] ArrayOfAshPoks = {
            new Pokemon("Balbassaur", "leaf", "water"),
            new Pokemon("Pikatchu", "electric", "water"),
            new Pokemon("Charizard", "fire", "leaf"),
            new Pokemon("Squrtle", "water", "fire"),
            new Pokemon("Kingler", "water", "fire")};

   static Pokemon vadpokemon = new Pokemon("Odish", "leaf", "water");


    public static void main(String[] args) {

        Human human1 = new Human();
        human1.eyeColor = "blue";

        Human human2 = null;
        human2 = new Human();
        human2.eyeColor = "green";

        System.out.println(human1.toString());

        Human human3 = new Human("brown", 39, 75);
        System.out.println(human3.footSize);

// *******************************************************************************************
        Postit postit1 = new Postit(); // narancssárgát kék szöveggel: "Ötlet 1"
        postit1.textColor = "blue";
        postit1.text = "Ötlet1";
        postit1.backgroundColor = "orange";


        Postit postit2 = new Postit(); //  sárgát zöld szöveggel: "Megcsinálni a házit"
        postit1.textColor = "green";
        postit1.text = "Megcsinálni a házit";
        postit1.backgroundColor = "yellow";

        //

        BlogPost blogPost1 = new BlogPost();           // , írta Gipsz Jakab, posztolva: "2000.05.04."
        blogPost1.title = "Lorem Ipsum";   //   Lorem ipsum dolor sit amet.
        blogPost1.authorName = "Gipsz Jakab";
        blogPost1.text = " Lorem ipsum dolor sit amet.";
        blogPost1.publicationDate = "2000.05.04";

        //human3.eat();
        //System.out.println(human3.hungry);
        Human randi = new Human("blue", 1, 1);
        human3.gyertyaFenyesVacsora(randi);
        System.out.println(randi.weight);
        System.out.println(human3.weight);


        //  Hozz létre egy Animal classt
        //Mindegyik állatnak van egy éhség értéke, ami egy egész szám
        //Mindegyik állatnak van egy szomjúság értéke, ami egy egész szám
        //Amikor példányosítasz egy új Animal objektumot az előző értékek minden esetben 50-ről indulnak
        //Az állatok tudnak enni ami az éhséget csökkenti eggyel
        //Az állatok tudnak inni ami az szomjúságot csökkenti eggyel
        //Az állatok tudnak játszani ami a két értéket növeli eggyel

       /* Animal animal1 = new Animal();
        System.out.println("Animal 1 hungry "+animal1.hungry);
        System.out.println("Animal 1 thirsty "+animal1.thirsty);

        animal1.eat();
        animal1.drink();
        System.out.println("Animal 1 hungry "+animal1.hungry);
        System.out.println("Animal 1 thirsty "+animal1.thirsty);

        animal1.play();
        System.out.println("Animal 1 hungry "+animal1.hungry);
        System.out.println("Animal 1 thirsty "+animal1.thirsty);

        Animal animal2 = new Animal();
        animal1.playTogether(animal2);

        System.out.println("Animal 1 hungry "+animal1.hungry);
        System.out.println("Animal 1 thirsty "+animal1.thirsty);
        System.out.println("Animal 2 hungry "+animal2.hungry);
        System.out.println("Animal 2 thirsty "+animal2.thirsty);
*/
        // Counter

       /* Counter counter1 = new Counter(10);
        System.out.println(counter1.value);

        counter1.add();
        System.out.println(counter1.value);

        counter1.add(10);
        System.out.println(counter1.value);

        System.out.println("Get" + counter1.get());

        counter1.reset();
        System.out.println("Reset" + counter1.get());*/

        // Pokemon      *************************************************************

        // Ashnek van 5 pokemonja egy tömbben:
        // (Balbassaur, leaf, water),
        // (Pikatchu, electric, water),
        // (Charizard, fire, leaf),
        // (Squirtle, water, fire),
        // (Kingler, water, fire)
        //vadpokemon: (Odish, leaf, water)
/*

        Pokemon winnerPokemon;
        winnerPokemon = BestpokemonAgainst(vadpokemon);
        System.out.println("A jó pokemon:" + winnerPokemon.name);
*/
        Point point1 = new Point(-1,1);
        Point point2 = new Point(3,-3);

        point1.printInfo();
        point2.printInfo();

        System.out.println( point1.distance(point2));


    }

    // Írj egy metódust használva a Pokemon class metódsát, ami megmondja, hogy melyik pokemont kell használnia Ashnek!

    public static Pokemon BestpokemonAgainst(Pokemon pokemon) {

        for (int cntr = 0; cntr < ArrayOfAshPoks.length; cntr++) {

            if (ArrayOfAshPoks[cntr].isEffectiveAgainst(pokemon)) {

                return ArrayOfAshPoks[cntr];
            }
        }
        return null;
    }
}
