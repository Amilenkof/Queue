package model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

//Хранилище всех выданных билетов
@Repository
@Scope
public class RepositoryTickets implements RepositoryTicketService {
    List<Ticket> tickets;

    public RepositoryTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public Ticket add(Ticket ticket) {
        tickets.add(ticket.getIdTicket(),ticket);
        return ticket;
    }

    @Override
    public Ticket read(Ticket ticket) {

        return tickets.get(ticket.getIdTicket());
    }

    @Override
    public Ticket update(Ticket ticket) {
        return tickets.set(ticket.getIdTicket(), ticket);
    }

    @Override
    public Ticket delete(Ticket ticket) {
        return tickets.remove(ticket.getIdTicket());
    }
}
