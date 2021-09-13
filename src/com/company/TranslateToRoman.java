package com.company;

public class TranslateToRoman {
    public static void main(String[] args)
    {int x;
        x=73;
        System.out.println(Roman(x));
    }
    public static String Roman(int s)
    {
        String[] Roman10={"I","II","III","IV","V","VI","VII","VIII","IX","X"},
                Roman100={"X","XX","XXX","XL","L","LX","LXX","LXXXX","XC","C"};
        String Otvet="0";
        if (s<=10) {Otvet=Roman10[s-1];}
        else if (s>=11) {Otvet=Roman100[((s/10)-1)]+Roman10[s-1-((s/10)*10)];}
        return Otvet;
    }
}
