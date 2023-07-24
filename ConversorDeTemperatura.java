public class ConversorDeTemperatura {

    double grados;


    public ConversorDeTemperatura(double grados){
        this.grados=grados;

    }

    public double celciusAfarenheit(double celcius){
        double celciusConvertidos=(celcius*9/5)+32;
        return celciusConvertidos;
    }

    public double farenheitAcelcius(double farenheit){
        double restaFarenheit=farenheit-32;
        double farenheitConvertidos=restaFarenheit*5/9;
        return farenheitConvertidos;
    }

    public void mostrarResultados(double resultados){
        System.out.println(resultados);
    }
}
