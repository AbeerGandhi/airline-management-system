package com.example.airline.service;

import com.example.airline.exception.ResourceNotFoundException;
import com.example.airline.model.Ticket;
import com.example.airline.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
// to save the ticket
    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
// to see the ticket
    public Ticket getTicket(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ticket not found in the database "));
    }
// to cancel the ticket
    public void cancelTicket(Long id) {
        Ticket    ticket = getTicket(id);
        ticketRepository.delete(ticket);
    }
}
