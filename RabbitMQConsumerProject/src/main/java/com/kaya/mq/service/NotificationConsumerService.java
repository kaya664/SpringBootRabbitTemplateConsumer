package com.kaya.mq.service;

import org.springframework.stereotype.Component;

import com.kaya.mq.receiver.IReceiver;

@Component
public class NotificationConsumerService implements IReceiver {

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Receive Message: " + message);
	}

	/*
	 * @PostConstruct private void init() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("Initializing"); ConnectionFactory factory =
	 * new ConnectionFactory(); factory.setHost("localhost");
	 * 
	 * try { Connection connection = factory.newConnection(); Channel channel =
	 * connection.createChannel(); channel.queueDeclare(QUEUE_NAME, false, false,
	 * false, null);
	 * System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
	 * DeliverCallback deliverCallback = (consumerTag, delivery) -> { String message
	 * = new String(delivery.getBody(), "UTF-8");
	 * System.out.println(" [x] Received '" + message + "'"); };
	 * channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
	 * } catch (Exception e) {
	 * 
	 * } }
	 */

}
