package org.kaav.springrest.api.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kaav.springrest.api.model.Message;
import org.kaav.springrest.api.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService service=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return service.getAllMessages();
		
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public Message getMessage(@PathParam("messageId") long messageId) {
		return service.getMessage(messageId);
//		return "Got Path Param" + messageId;
		}

}
