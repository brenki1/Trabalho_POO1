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

    public static LocalDateTime dataHoraCorreta(String dataHora){
        return LocalDateTime.now();
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
                else return dia>=1 && dia <= 28;
        }
        return false;
    }
}
