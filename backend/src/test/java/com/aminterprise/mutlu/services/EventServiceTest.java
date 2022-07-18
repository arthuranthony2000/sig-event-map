package com.aminterprise.mutlu.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.aminterprise.mutlu.entities.Event;
import com.aminterprise.mutlu.entities.OrderStatus;
import com.aminterprise.mutlu.repositories.EventRepository;
import com.aminterprise.mutlu.dto.EventDTO;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EventServiceTest {
	
	@Autowired
	private EventService service;
	
	@Autowired
	private EventRepository repository;
	
	@Test
	public void testFindAllEvents() {
		List<EventDTO> list = service.findAll();
		assert(list.size() > 0);
	}
	
	@Test
	public void testFindEventsActive() {
		Event event = repository.findById(1L).get();
		event.setStatus(OrderStatus.PENDING);
		
		service.updateEvent(event.getId(), new EventDTO(event));
		
		List<EventDTO> list = service.findActive();
		
		event.setStatus(null);
		
		service.updateEvent(event.getId(), new EventDTO(event));
		
		assert(list.size() > 0);
	}
	
	@Test
	public void testInsertEvent() {
		EventDTO event = new EventDTO(null, "Test", 50.00d, 10L, "address test", 1000.00d, 1000.00d, null, null, null, OrderStatus.PENDING);
		EventDTO eventReturned = service.insert(event);
		repository.deleteById(eventReturned.getId());
		assert(eventReturned != null);	
	}
	
	@Test
	public void testUpdateEvent() {
		EventDTO oldEvent = new EventDTO(null, "Test", 50.00d, 10L, "address test", 1000.00d, 1000.00d, null, null, null, OrderStatus.PENDING);
		
		EventDTO oldEventReturned = service.insert(oldEvent);
		oldEventReturned.setName("TestUpdated");		
		
		service.updateEvent(oldEventReturned.getId(), oldEventReturned);
		
		Event newEvent = repository.findById(oldEventReturned.getId()).get();	
		
		repository.deleteById(newEvent.getId());
		
		assert(newEvent.getName() != oldEvent.getName());	
	}
	
	@Test
	public void testSetConclusedEvent() {
		EventDTO oldEvent = new EventDTO(null, "Test", 50.00d, 10L, "address test", 1000.00d, 1000.00d, null, null, null, OrderStatus.PENDING);
		
		EventDTO oldEventReturned = service.insert(oldEvent);
		
		service.setConclused(oldEventReturned.getId());
		
		Event newEvent = repository.findById(oldEventReturned.getId()).get();	
		
		repository.deleteById(newEvent.getId());
		
		assert(newEvent.getStatus() != oldEvent.getStatus());	
	}
	
	@Test
	public void testSetPendingEvent() {
		EventDTO oldEvent = new EventDTO(null, "Test", 50.00d, 10L, "address test", 1000.00d, 1000.00d, null, null, null, OrderStatus.CONCLUSED);
		
		EventDTO oldEventReturned = service.insert(oldEvent);
		
		service.setPending(oldEventReturned.getId());
		
		Event newEvent = repository.findById(oldEventReturned.getId()).get();	
		
		repository.deleteById(newEvent.getId());
		
		assert(newEvent.getStatus() != oldEvent.getStatus());	
	}	
	
}

















