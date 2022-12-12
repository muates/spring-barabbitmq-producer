package com.bilgeadam.springbarabbitmqproducer.producer;

import com.bilgeadam.springbarabbitmqproducer.model.Member;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bilgeadam.springbarabbitmqproducer.config.RabbitConfiguration.*;

@RestController
@RequestMapping("/member")
public class MemberProducer {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Member member) {
        template.convertAndSend(EXCHANGE, ROUTING, member);
        return "Mesaj başarılı bir şekilde gönderildi";
    }
}
