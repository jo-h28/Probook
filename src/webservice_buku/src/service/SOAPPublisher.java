package service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8888/ws/bookservice", new BookWS());  
	}
}
