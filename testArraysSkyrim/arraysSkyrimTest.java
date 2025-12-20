package TestArrays;

import java.util.Scanner;

public class ArraysSkyrimTest {
    static void main() {
        int powerAkatosh = 100;
        int [] arrayIntAkatosh = new int [100];
        int valorInicialAkatosh = 0;
        for (int i = 0; i < 100; i++) {
            arrayIntAkatosh[i] = valorInicialAkatosh + i;
        }
        int powerArkay = 200;
        int [] arrayIntArkay = new int [100];
        int valorInicialArkay = 200;
        for (int i = 0; i < 100; i++) {
            arrayIntArkay[i] = valorInicialArkay + i;
        }
        int powerDibella = 300;
        int [] arrayIntDibella = new int [100];
        int valorInicialDibella = 300;
        for (int i = 0; i < 100; i++) {
            arrayIntDibella[i] = valorInicialDibella + i;
        }
        int powerJulianos = 400;
        int [] arrayIntJulianos = new int [100];
        int valorInicialJulianos = 400;
        for (int i = 0; i < 100; i++) {
            arrayIntJulianos[i] = valorInicialJulianos + i;
        }
        int powerKynareth = 500;
        int [] arrayIntKynareth = new int [100];
        int valorInicialKynareth = 500;
        for (int i = 0; i < 100; i++) {
            arrayIntKynareth[i] =valorInicialKynareth + i;
        }
        int powerMara = 600;;
        int [] arrayIntMara = new int [100];
        int valorInicialMara = 600;
        for (int i = 0; i < 100; i++) {
            arrayIntMara[i] = valorInicialMara + i;
        }
        int powerStendarr = 700;
        int [] arrayIntStendarr = new int [100];
        int valorInicialStendarr = 700;
        for (int i = 0; i < 100; i++) {
            arrayIntStendarr[i] =valorInicialStendarr + i;
        }
        int powerZenithar = 800;
        int [] arrayIntZenithar = new int [100];
        int valorInicialZenithar = 800;
        for (int i = 0; i < 100; i++) {
            arrayIntZenithar[i] =valorInicialZenithar + i;
        }
        int powerTalos = 900;
        int [] arrayIntTalos = new int [100];
        int valorInicialTalos = 900;
        for (int i = 0; i < 100; i++) {
            arrayIntTalos[i] =valorInicialTalos + i;
        }

            Scanner entrada = new Scanner(System.in);
            System.out.print("informe o Poder do Deus que você deseja conhecer, digite entre 100 - 999: ");
            String powerGod = entrada.next();
            Integer powerNumberGod = Integer.valueOf(powerGod);
    if (powerNumberGod >= 100 && powerNumberGod <= 199){
            System.out.println("O deus que você procura é Akatosh: O Deus Dragão do Tempo e líder dos Divinos.");
        }else if (powerNumberGod >= 200 && powerNumberGod <= 299){
            System.out.println("O deus que você procura é Arkay:O deus da vida e da morte.");
            }else if (powerNumberGod >= 300 && powerNumberGod <= 399){
            System.out.println("O deus que você procura é Dibella: A deusa da beleza, arte e amor.");
                }else if (powerNumberGod >= 400 && powerNumberGod <= 499){
            System.out.println("O deus que você procura é Julianos: O deus da sabedoria, lógica e magia.");
                    }else if (powerNumberGod >= 500 && powerNumberGod <= 599){
            System.out.println("O deus que você procura é Kynareth:A deusa do ar, ventos e elementos naturais.");
                        }else if (powerNumberGod >= 600 && powerNumberGod <= 699){
            System.out.println("O deus que você procura é Mara:A deusa do amor e da misericórdia.");
                            }else if (powerNumberGod >= 700 && powerNumberGod <= 799){
            System.out.println("O deus que você procura é Stendarr:O deus da misericórdia e da justiça.");
                                }else if (powerNumberGod >= 800 && powerNumberGod <= 899){
            System.out.println("O deus que você procura é Zenithar:O deus do trabalho, comércio e riqueza.");
                                    }else if (powerNumberGod >= 900 && powerNumberGod <= 999){
            System.out.println("O deus que você procura é Talos: O nono divino, um herói humano (Tiber Septim) "
                    + "que ascendeu à divindade.");} else {
                System.out.println("Nenhum deus encontrado com esse poder.");
            }
            entrada.close();
    }
}
