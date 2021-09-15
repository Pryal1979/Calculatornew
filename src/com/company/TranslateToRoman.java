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
                Roman100={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String Otvet="Ответ = ";
        if (s<0) Otvet="Недопустимая операция с римскими числами";
        else if (s==0) Otvet=Otvet+"0";
        else if ((s>0) && (s<=10)) Otvet=Otvet+Roman10[s-1];
        else if ((s>=11) && ((s%10)>=1)) Otvet=Otvet+Roman100[(s/10)-1]+Roman10[(s%10)-1];
        else if ((s>=11) && ((s%10)==0)) Otvet=Otvet+Roman100[(s/10)-1];

        return Otvet;
    }
}
