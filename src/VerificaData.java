import java.time.*;
import java.time.format.DateTimeFormatter;

public class VerificaData {
    private int ano, mes, dia;

    public static LocalDate dataCorreta(int ano, int mes, int dia){
        if(verificaAno(ano) && verificaMes(mes)){
            if(verificaDia(ano,mes,dia)) {
                return LocalDate.of(ano, mes, dia);
            }
        }
        return LocalDate.now();

    }

    public static LocalDate dataCorreta(String data){
        String anoStr = data.substring(0,4);
        String mesStr = data.substring(5,7);
        String diaStr = data.substring(8,10);

        int anoInt = Integer.parseInt(anoStr);
        int mesInt = Integer.parseInt(mesStr);
        int diaInt = Integer.parseInt(diaStr);

        return dataCorreta(anoInt,mesInt,diaInt);
    }

    public static LocalDateTime dataHoraCorreta(int ano, int mes, int dia, int hora, int minuto, int segundo){
        if(verificaAno(ano) && verificaMes(mes) && verificaDia(ano,mes,dia) && verificaHora(hora) && verificaMinuto(minuto) && verificaSegundo(segundo)) {
            return LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
        }

        return LocalDateTime.now();
    }
    public static LocalDateTime dataHoraCorreta(String dataHora){
        String anoStr = dataHora.substring(0,4);
        String mesStr = dataHora.substring(5,7);
        String diaStr = dataHora.substring(8,10);
        String horaStr = dataHora.substring(11,13);
        String minutoStr = dataHora.substring(14,16);
        String segundoStr = dataHora.substring(17,19);

        int anoInt = Integer.parseInt(anoStr);
        int mesInt = Integer.parseInt(mesStr);
        int diaInt = Integer.parseInt(diaStr);
        int horaInt = Integer.parseInt(horaStr);
        int minutoInt = Integer.parseInt(minutoStr);
        int segundoInt = Integer.parseInt(segundoStr);

        return dataHoraCorreta(anoInt,mesInt,diaInt,horaInt,minutoInt,segundoInt);
    }

    public static boolean verificaData(String data){
        String anoStr = data.substring(0,4);
        String mesStr = data.substring(5,7);
        String diaStr = data.substring(8,10);

        int anoInt = Integer.parseInt(anoStr);
        int mesInt = Integer.parseInt(mesStr);
        int diaInt = Integer.parseInt(diaStr);

        if(verificaAno(anoInt) && verificaMes(mesInt)){
            if(verificaDia(anoInt,mesInt,diaInt)) {
                return true;
            }
        }
        return false;

    }

    public static boolean verificaDataHora(String dataHora){
        String anoStr = dataHora.substring(0,4);
        String mesStr = dataHora.substring(5,7);
        String diaStr = dataHora.substring(8,10);
        String horaStr = dataHora.substring(11,13);
        String minutoStr = dataHora.substring(14,16);
        String segundoStr = dataHora.substring(17,19);

        int anoInt = Integer.parseInt(anoStr);
        int mesInt = Integer.parseInt(mesStr);
        int diaInt = Integer.parseInt(diaStr);
        int horaInt = Integer.parseInt(horaStr);
        int minutoInt = Integer.parseInt(minutoStr);
        int segundoInt = Integer.parseInt(segundoStr);

        if(verificaAno(anoInt) && verificaMes(mesInt) && verificaDia(anoInt,mesInt,diaInt) && verificaHora(horaInt) && verificaMinuto(minutoInt) && verificaSegundo(segundoInt)) {
            return true;
        }

        return false;
    }

    private static boolean verificaAno(int ano){
        return ano >= 1900 && ano <= 2030;
    }

    private static boolean verificaMes(int mes){
        return mes >= 1 && mes <= 12;
    }



    private static boolean verificaDia(int ano, int mes, int dia){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return dia >= 1 && dia <= 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return dia>=1 && dia <= 30;
            case 2:
                if(dia == 29 && !LocalDate.of(ano,mes,1).isLeapYear()){
                    return false;
                }
                else if(dia == 29 && LocalDate.of(ano,mes,1).isLeapYear()){
                    return true;
                }
                else{
                    return dia >=1 && dia <= 28;
                }
        }
        return false;
    }

    private static boolean verificaHora(int hora){
        return hora >=0 && hora < 24;
    }

    private static boolean verificaMinuto(int minuto){
        return minuto >=0 && minuto < 60;
    }
    private static boolean verificaSegundo(int segundo){
        return segundo >=0 && segundo < 60;
    }
}
