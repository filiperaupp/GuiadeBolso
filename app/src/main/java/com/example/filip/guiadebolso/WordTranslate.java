package com.example.filip.guiadebolso;

import java.io.Serializable;
import java.util.ArrayList;

public class WordTranslate implements Serializable {
    private String theWord;
    private String translation;
    private String frase;

    public WordTranslate(String palavra, String traducao, String frase) {
        this.theWord = traducao;
        this.translation = palavra;
        this.frase = frase;
    }

    public WordTranslate(){}

    public String getTheWord() {
        return theWord;
    }

    public String getTranslation() {
        return translation;
    }

    public String getFrase() {return frase; }

    public static void addNewItem(ArrayList<WordTranslate> theArray, String palavra, String traducao, String frase){
        WordTranslate newItem = new WordTranslate(palavra, traducao, frase);
        theArray.add(newItem);
    }


    public static void makeNumbers(ArrayList<WordTranslate> theArray) {
        if (theArray.size()==0) {
            for (int i=0;i<10;i++) {
                WordTranslate newWord = new WordTranslate();
                theArray.add(newWord);
            }
        }

        //portugues
        theArray.get(0).theWord =  "Um";
        theArray.get(1).theWord = "Dois";
        theArray.get(2).theWord = "Três";
        theArray.get(3).theWord = "Quatro";
        theArray.get(4).theWord = "Cinco";
        theArray.get(5).theWord = "Seis";
        theArray.get(6).theWord = "Sete";
        theArray.get(7).theWord = "Oito";
        theArray.get(8).theWord = "Nove";
        theArray.get(9).theWord = "Dez";

        //inglês
        theArray.get(0).translation = "One";
        theArray.get(1).translation = "Two";
        theArray.get(2).translation = "Three";
        theArray.get(3).translation = "Four";
        theArray.get(4).translation = "Five";
        theArray.get(5).translation = "Six";
        theArray.get(6).translation = "Seven";
        theArray.get(7).translation = "Eight";
        theArray.get(8).translation = "Nine";
        theArray.get(9).translation = "Ten";

        //frase
        theArray.get(0).frase = "I have one book";
        theArray.get(1).frase = "I see two birds";
        theArray.get(2).frase = "Three dogs are running";
        theArray.get(3).frase = "Four mans in the WC";
        theArray.get(4).frase = "Five dollars in the pocket";
        theArray.get(5).frase = "Six candels in the ground";
        theArray.get(6).frase = "I am seven years old";
        theArray.get(7).frase = "Is not Eight ducks?";
        theArray.get(8).frase = "i do this nine times";
        theArray.get(9).frase = "Ten years ago...";
    }

    public static void makeFood(ArrayList<WordTranslate> theArray) {
        if (theArray.size()==0) {
            for (int i=0;i<10;i++) {
                WordTranslate newWord = new WordTranslate();
                theArray.add(newWord);
            }
        }

        //portugues
        theArray.get(0).theWord = "Comida";
        theArray.get(1).theWord = "Bebida";
        theArray.get(2).theWord = "Água";
        theArray.get(3).theWord = "Carne";
        theArray.get(4).theWord = "Batata frita";
        theArray.get(5).theWord = "Bala";
        theArray.get(6).theWord = "Sorvete";
        theArray.get(7).theWord = "Café da manhã";
        theArray.get(8).theWord = "Almoço";
        theArray.get(9).theWord = "Janta";

        //inglês
        theArray.get(0).translation = "Food";
        theArray.get(1).translation = "Beverage";
        theArray.get(2).translation = "Water";
        theArray.get(3).translation = "Beef";
        theArray.get(4).translation = "French frie";
        theArray.get(5).translation = "Candy";
        theArray.get(6).translation = "Ice Cream";
        theArray.get(7).translation = "Breakfast";
        theArray.get(8).translation = "Lunch";
        theArray.get(9).translation = "Dinner";

        //frase
        theArray.get(0).frase = "I need food";
        theArray.get(1).frase = "I like any beverage";
        theArray.get(2).frase = "A water, please";
        theArray.get(3).frase = "We need beef for dinner";
        theArray.get(4).frase = "I love french frie";
        theArray.get(5).frase = "My favorite candy is of strawberry";
        theArray.get(6).frase = "Is too cold to eat ice cream";
        theArray.get(7).frase = "I don't eat my breakfast this morning";
        theArray.get(8).frase = "The lunch was amazing";
        theArray.get(9).frase = "Want you dinne with me tonight?";
    }

    public static void makeFamily(ArrayList<WordTranslate> theArray) {
        if (theArray.size()==0) {
            for (int i=0;i<10;i++) {
                WordTranslate newWord = new WordTranslate();
                theArray.add(newWord);
            }
        }

        //portugues
        theArray.get(0).theWord = "Mãe";
        theArray.get(1).theWord = "Pai";
        theArray.get(2).theWord = "Irmão";
        theArray.get(3).theWord = "Irmã";
        theArray.get(4).theWord = "Filho";
        theArray.get(5).theWord = "Filha";
        theArray.get(6).theWord = "Avô";
        theArray.get(7).theWord = "Avó";
        theArray.get(8).theWord = "Tio";
        theArray.get(9).theWord = "Tia";

        //inglês
        theArray.get(0).translation = "Mother";
        theArray.get(1).translation = "Father";
        theArray.get(2).translation = "Brother";
        theArray.get(3).translation = "Sister";
        theArray.get(4).translation = "Son";
        theArray.get(5).translation = "Daughter";
        theArray.get(6).translation = "Grandfather";
        theArray.get(7).translation = "Grandmother";
        theArray.get(8).translation = "Uncle";
        theArray.get(9).translation = "Aunt";

        //frase
        theArray.get(0).frase = "My mother is the best";
        theArray.get(1).frase = "My father is very strong";
        theArray.get(2).frase = "My brother is stupid";
        theArray.get(3).frase = "Hey, sister, give the candy";
        theArray.get(4).frase = "My son is 5 years old";
        theArray.get(5).frase = "I see my daughter on the school";
        theArray.get(6).frase = "I love my grandfather";
        theArray.get(7).frase = "I love my grandmother";
        theArray.get(8).frase = "See you the uncle Billy today?";
        theArray.get(9).frase = "Aunt! Don't do this";
    }

    public static void makeExpressions(ArrayList<WordTranslate> theArray) {
        if (theArray.size()==0) {
            for (int i=0;i<10;i++) {
                WordTranslate newWord = new WordTranslate();
                theArray.add(newWord);
            }
        }

        //portugues
        theArray.get(0).theWord = "E aí, beleza?";
        theArray.get(1).theWord = "Não faço ideia";
        theArray.get(2).theWord = "Nunca ouvi falar";
        theArray.get(3).theWord = "Deixa pra lá";
        theArray.get(4).theWord = "Em breve";
        theArray.get(5).theWord = "Como assim?";
        theArray.get(6).theWord = "Até aqui, tudo bem";
        theArray.get(7).theWord = "Até onde eu sei";
        theArray.get(8).theWord = "Já estava na hora";
        theArray.get(9).theWord = "Salvo pelo gongo";

        //inglês
        theArray.get(0).translation = "What's up?";
        theArray.get(1).translation = "To have no clue";
        theArray.get(2).translation = "Never heard of";
        theArray.get(3).translation = "Never mind";
        theArray.get(4).translation = "Pretty soon";
        theArray.get(5).translation = "How come?";
        theArray.get(6).translation = "So far, so good";
        theArray.get(7).translation = "As far as I know";
        theArray.get(8).translation = "It is high time";
        theArray.get(9).translation = "Saved by the bell";

        //frase
        theArray.get(0).frase = "Hey, man! What's up?";
        theArray.get(1).frase = "I to have no clue of where is he.";
        theArray.get(2).frase = "I never heard of this word";
        theArray.get(3).frase = "Never mind, you don't understand";
        theArray.get(4).frase = "I will come pretty son";
        theArray.get(5).frase = "How come? Don't you know?";
        theArray.get(6).frase = "Well.. so far, so good";
        theArray.get(7).frase = "As far as I know, he doesn't works";
        theArray.get(8).frase = "It is high time! You are late!";
        theArray.get(9).frase = "You are saved by the bell";
    }
}
