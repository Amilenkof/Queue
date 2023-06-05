package model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;
@Component
@Scope("prototype")
public class Ticket {
    private static int ticketCounter=0;
    private  final int idTicket;
    private  final LocalDateTime registrationDate;// дата получения билета
    private  final Service idService;
    private final LocalDateTime dateRealisation;//время оказания услуги

    public Ticket(int idService) {
//        this.idService = idService;
        this.idService=
        ticketCounter++;
        this.idTicket =ticketCounter;
        this.registrationDate = LocalDateTime.now();
        this.dateRealisation=registrationDate;//Добавить нормативное время
    }

    @Override
    public String toString() {
        return "{Ticket " + '\n'+
                "№ талона=" + idTicket + '\n'+
                "время получения талона=" + registrationDate + '\n'+
                "код услуги=" + idService + '\n'+
                "ожидаемое время оказания услуги=" + dateRealisation +"}"+
                '\n';
    }

    public static int getTicketCounter() {
        return ticketCounter;
    }

    public static void setTicketCounter(int ticketCounter) {
        Ticket.ticketCounter = ticketCounter;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public int getIdService() {
        return idService;
    }

    public LocalDateTime getDateRealisation() {
        return dateRealisation;
    }
}
