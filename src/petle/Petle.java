/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petle;

public class Petle {

    public static void main(String[] args) {
        
        String[] kurs =
        {
            "Java",
            "Java aplikacje",
            "Java strumienie",
            "Java zaawansowane",
            "Java android",
            "C#",
            "C# tworzenie aplikacji"
        };
        //pętla while
        int i = 0;
        while(i < kurs.length)
        {
            System.out.println(kurs[i]);
            i++;
        }
        
        //ćwiczenie tablica wypełniona dziesięciokrotnością kolejnych indeksów
        int[] tab;
        tab = new int[10];
        i = 0;
        do
        {
            tab[i] = (i+1)*10;
            System.out.println(tab[i]);
            i++;
        }while(i < 10);
        
        //pętla for
        
        for(i = 0; i < kurs.length; i++)
        {
            System.out.println(kurs[i]);
        }
        
        //Enhanced for
        
        for(String myValue: kurs)
        {
            System.out.println(myValue);
        }
        
    }
    
}
