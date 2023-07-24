import javax.swing.*;

public class Main {

    public static void interfazConvertor(int eleccionDeOperacion){
        switch (eleccionDeOperacion){
            case(1):
                System.out.println("convertir celcius a farenheit: ");
                resultadosConvercion(eleccionDeOperacion);
            break;
            case(2):
                System.out.println("convertir farenheit a celcius");
                resultadosConvercion(eleccionDeOperacion);
            break;
        }

    }

    public static void resultadosConvercion(int operacion){
        double numGrados=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de grados que quiere convertir"));
        ConversorDeTemperatura grados=new ConversorDeTemperatura(numGrados);
        if(operacion==1){
            double resultadosConvercion=grados.celciusAfarenheit(numGrados);
            System.out.println("grados farenheit: ");
            grados.mostrarResultados(resultadosConvercion);
        }if(operacion==2){
            double resultadosConvercion=grados.farenheitAcelcius(numGrados);
            System.out.println("grados celcius");
            grados.mostrarResultados(resultadosConvercion);
        }

    }
    public static void main(String[] args) {
        /*crea una clase llamada combersor de temperaturas que permita convertir temperaturas de grados celcius a farenheit y vicebersa. la clase debe de tener metodos
        * para realizar ambas comberciones y un metodo para mostrar el resultado, ademas debe tener un constructor que inicialice los valores necesarios*/

        int repetirPrograma;

    do{

        int eleccionDeOperacion=Integer.parseInt(JOptionPane.showInputDialog("Que convercion quiere hacer, 1-celcius a farenheit 2-farenheit a celcius"));
        interfazConvertor(eleccionDeOperacion);

        repetirPrograma=Integer.parseInt(JOptionPane.showInputDialog("desea realizar otra convercion 1-si 2-no"));

    }while(repetirPrograma==1);

        System.out.println("programa finalizado");


    }
}