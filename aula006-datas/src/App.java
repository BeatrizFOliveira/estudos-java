import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) throws Exception {

        //FUNÇÕES BÁSICAS COM LOCAL DATE ----------------------------------------------------------
        LocalDate data = LocalDate.now(); //Captura a data de hoje

        System.out.println(data);
        System.out.println("Dia da semana (nome): " + data.getDayOfWeek().name()); //Diz o dia da semana escrito
        System.out.println("Dia da semana (número): " + data.getDayOfWeek().ordinal()); //Diz o dia da semana em números (começando em 0)
        System.out.println("Mês (número): " + data.getMonthValue()); //Diz o número do mês
        System.out.println("Mês (nome): " + data.getMonth().name()); //Diz o nome do mês escrito
        System.out.println("Ano: " + data.getYear()); //Diz o ano
        System.out.println("Ano bissexto? " + data.isLeapYear()); //Diz se o ano é bissexto
        System.out.println("N° de dias do mês: " + data.lengthOfMonth()); //Diz o número de dias do mês
        System.out.println("N° de dias do ano: " + data.lengthOfYear()); //Diz o número de dias do ano

        //CÁLCULOS COM DATA --------------------------------------------------------------
        System.out.println("Ontem: " + data.minusDays(5)); //Diminui os dias
        System.out.println("Amanhã: " + data.plusDays(5));  //Adiciona dias
        System.out.println("Mês que vem: " + data.plusMonths(1));  //Adiciona meses
        System.out.println("Próximo ano: " + data.plusYears(1));  //Adiciona anos
        System.out.println("Último dia desse mês: " + data.with(TemporalAdjusters.lastDayOfMonth()));  //Calcula o último dia do mês
        System.out.println("Último dia de dezembro: " + data.withMonth(12).with(TemporalAdjusters.lastDayOfMonth())); //Cálcula o último dia de um mês especificado

        LocalDate nascimento = LocalDate.of(2001, 7, 23); //Guarda uma data especificada

        System.out.println("Igual: " + nascimento.isEqual(data)); //Compara se uma data é igual a outra
        System.out.println("Antes: " + nascimento.isAfter(data)); //Compara se uma data é antes da outra
        System.out.println("Depois: " + nascimento.isBefore(data)); //Compara se uma data é depois da outra

        //CÁLCULO DE PERÍODOS----------------------------------------------------------------
        Period periodo = Period.between(nascimento, data); //Guarda o período entre duas datas

        System.out.println(periodo.getYears() + " Anos " //Guarda a diferença entre os anos de duas datas
            + periodo.getMonths() + " Meses " //Guarda a diferença entre os meses de duas datas
            + periodo.getDays() + " Dias"); //Guarda a diferença entre os dias de duas datas

        System.out.println("Período em meses: " + periodo.toTotalMonths()); //Cálcula a quantidade total de meses passados entre duas datas

        //HORÁRIO------------------------------------------------------------

        LocalDateTime agora = LocalDateTime.now(); //Guarda a data e horário atual
        System.out.println(agora);

        ZonedDateTime horarioToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo")); //Guarda a data e horário de algum local específico
        System.out.println(horarioToquio);

        System.out.println("Hoje: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
