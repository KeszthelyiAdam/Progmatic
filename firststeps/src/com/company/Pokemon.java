package com.company;
// Hozz létre egy Pokemon classt
//melynek van 3 String fieldje, melyben name, type, effectiveAgainst

//isEffectiveAgainst(Pokemon …) metódus: Elmondja, hogy az adott pokemon hatásos vagy sem a másik pokemon típusa ellen

//Ashnek van 5 pokemonja egy tömbben: (Balbassaur, leaf, water), (Pikatchu, electric, water), (Charizard, fire, leaf),
// (Squirtle, water, fire), (Kingler, water, fire)

//Egyszer csak felbukkan egy vadpokemon: (Odish, leaf, water)
//Írj egy metódust használva a Pokemon class metódsát, ami megmondja, hogy melyik pokemont kell használnia Ashnek!

public class Pokemon {
    String name, type, effectiveAgainst;

    public Pokemon(String name, String type, String effectiveAgainst){
        this.name=name;
        this.type=type;
        this.effectiveAgainst=effectiveAgainst;
    }

    public Pokemon(){

    }
    public boolean isEffectiveAgainst(Pokemon pokemon){
        if (this.effectiveAgainst == pokemon.effectiveAgainst){
            return true;
        }

        return false;
    }
}
