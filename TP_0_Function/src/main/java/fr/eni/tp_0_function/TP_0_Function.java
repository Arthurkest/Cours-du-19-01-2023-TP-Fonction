/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_function;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class TP_0_Function {

    public static void main(String[] args) {
        
        int intResultatSoustraction = simpleSoustraction(3,4);
        System.out.println(intResultatSoustraction);

        tableDeMultiplication(5,13);
        
        String strChiffre = codeCesar("ABCD", 2);
        System.out.println(strChiffre);
        
        int intBinaireConverti = conversionBaseDix(111);
        System.out.println(intBinaireConverti);
        
        simpleAffichageSoustraction(3,4);

        simpleEntreeEtAffichage();
    }

     public static void simpleEntreeEtAffichage()
    {
        
        Scanner simpleEntree = new Scanner(System.in);
        
        System.out.print("Saisir un nombre : ");
        String nombreSaisi = simpleEntree.next();
        
        System.out.print(nombreSaisi);
        
    }
    public static int simpleSoustraction(int intA, int intB)
    {
        int somme = intA - intB;
        return somme;
    }
    
    public static void simpleAffichageSoustraction(int intA, int intB)
    {
       int somme = intA - intB;
       System.out.print(somme);
    }
    
    public static void tableDeMultiplication(int intTable, int intNbLimite)
    {
        if (intTable >0)
        {
            for (int compteur=1; compteur <=intNbLimite; compteur++)
            {
                System.out.print(intTable +" * "+ compteur +" = "+ (intTable * compteur) );
            }
        }
        else 
        {
             System.out.print("le nombre n'est pas accepté");
        }
    }
    
    public static int conversionBaseDix(int intNbrBinaireConvertir)
    {
        /*Pour cette foction il va faire utiliser la taille de "intNbrBinaireConvertir" et un for */
        
        /*
         * Pour cette fonction, il est conseillé de comprendre comment on 
         * convertit un nombre binaire en base 10, veuillez suivre ce lien :
         * https://fr.wikihow.com/convertir-un-nombre-binaire-en-nombre-d%C3%A9cimal
         * 
         * En effet, cette fonction va prendre en paramètre un nombre binaire,
         * il faudra alors retourner sa conversion en base 10.
         * Exemple si on appelle : conversionBaseDix(int 111);
         * il faudra retourner 7 (en effet, 1*2^0 + 1*2^1 + 1*2^2 = 7)
        */
    }
    
   public static String codeCesar(String strMot, int intDecalage) //QUESTION BONUS
    {
        /*
         * Ecrire une fonction qui va permettre de chiffre un mot strMot à 
         * l'aide d'un décalage intDecalage.
         * Par exemple, si on appelle : codeCesar("ABCD", 2);  
         * Il faudra retourner la chaîne suivante : "CDEF"
        */     
        
    }
}
