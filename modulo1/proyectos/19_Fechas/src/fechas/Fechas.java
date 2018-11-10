package fechas;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args) {        
        // NUEVAS CLASES: FECHAS
        System.out.println("LocalDate:");
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1991, 02, 07);
        System.out.println(ld + " " + ld2);
        System.out.println(ld.isAfter(ld2));
        System.out.println(ld.isBefore(ld2));
        System.out.println("");
        
        // TIEMPOS
        System.out.println("LocalTime:");
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(2, 40);
        System.out.println(lt + " " + lt2);
        System.out.println(lt.isAfter(lt2));
        System.out.println(lt.isBefore(lt2));
        System.out.println("");
        
        // FECHA Y HORA
        System.out.println("LocalDateTime:");
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(1991, Month.FEBRUARY, 7, 12, 30);
        System.out.println(ldt + " " + ldt2);
        System.out.println(ldt.isAfter(ldt2));
        System.out.println(ldt.isBefore(ldt2));
        System.out.println("");
        
        // PERIODOS
        System.out.println("Periodos:");
        Period per = Period.between(ld2, ld);
        System.out.println(per.getDays() + " días");
        System.out.println(per.getMonths() + " meses");
        System.out.println(per.getYears() +" años");
        System.out.println("");

        // PARA FORMATEAR LAS FECHAS
        System.out.println("Formateo de fechas:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        System.out.println(formatter.format(ld));
    }
}
