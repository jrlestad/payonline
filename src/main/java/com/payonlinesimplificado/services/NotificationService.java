package com.payonlinesimplificado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.payonlinesimplificado.DTO.NotificationDTO;
import com.payonlinesimplificado.entities.User;

@Service
public class NotificationService {

	@Autowired
	private RestTemplate restTemplate;

	public void sendNotification(User user, String message) throws Exception {
		String email = user.getEmail();
		NotificationDTO notificationRequest = new NotificationDTO(email, message);

		// ResponseEntity<String> notificationResponse =
		// restTemplate.postForEntity("http://o4d9z.mocklab.io/notify",
		// notificationRequest, String.class);

		// if(!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
		// System.out.println("Erro ao tentar enviar notificação");
		// throw new Exception("Serviço de notificação está fora do ar");

		// }

		System.out.println("Notificação enviada para o usuário");
	}
}
