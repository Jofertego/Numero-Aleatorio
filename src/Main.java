import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num,adv=0,cont=0;
        Scanner Usuario = new Scanner(System.in);
        num=(int)((Math.random()*(50-1+1))+1);
        System.out.println("Tiene tres intentos para adivinar el numero entre 1 y 50");
        System.out.println("Intente adivinar un numero aleatorio");
        System.out.println("Escriba un numero: ");
        adv=Usuario.nextInt();
            while (num != adv) {
                cont= cont+1;
                if (cont == 3){
                    System.out.println("Supero el numero de intentos, el numero era: "+num);
                    break;}
                else{
                    System.out.println("Intento numero " + cont);
                    if (adv > num) {
                    System.out.println("Errro, el numero es menor al indicado, intente de nuevo");
                    adv = Usuario.nextInt();
                }
                    if (adv < num) {
                    System.out.println("Erro, El numero es mayor al indicado, intente de nuevo");
                    adv = Usuario.nextInt();
                }
                    if (adv == num) {
                        System.out.println("Acerto, adivino el numero en el intento numero " + cont);
                        break;
                    }
                }
            }
        }
    }
