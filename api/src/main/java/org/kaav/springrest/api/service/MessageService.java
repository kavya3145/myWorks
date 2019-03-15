package org.kaav.springrest.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kaav.springrest.api.database.DatabaseClass;
import org.kaav.springrest.api.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages=DatabaseClass.getMessages();
	
//	public List<Message> getAllMessages(){
//		Message m1=new Message(1L,"Hello","Kavya");
//		Message m2=new Message(5L,"How are you?","Krishna");
//		Message m3=new Message(8L,"Morning","Raja");
//		List<Message> list=new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		return list;
		
		public MessageService() {
			messages.put(1L,new Message(1,"Hello World","Kavya"));
			messages.put(2L,new Message(2,"How are you?","Krishna"));
			
		}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message) {
		if(message.getId() <=0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
		
	}
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	

}
