package com.patuli.exampleFreeMarker.service;

import com.patuli.exampleFreeMarker.repository.Entity.ExternalEmail;
import com.patuli.exampleFreeMarker.repository.Entity.InternalEmail;
import com.patuli.exampleFreeMarker.repository.Repo.MailRepository;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Service
public class MailService {

    @Autowired
    private JavaMailSender sender;

    @Autowired
    private Configuration config;

    @Autowired
    MailRepository mailRepository;




    public ExternalEmail sendEmail(InternalEmail mail, Map<String, Object> model) {
        ExternalEmail response = new ExternalEmail();
        MimeMessage message = sender.createMimeMessage();
        try {

            // set mediaType
            MimeMessageHelper helper = new MimeMessageHelper(message);

            // add attachment
            Template t = config.getTemplate("email-template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(t,model);




            helper.setTo(mail.getToo().toString());
            helper.setText(html, true);
            helper.setSubject(mail.getSubject());
            helper.setFrom(mail.getFromm());
            sender.send(message);

            response.setMessage("mail send to : " + mail.getToo());
            response.setStatus(Boolean.TRUE);

        } catch ( IOException | TemplateException | MessagingException e) {
            response.setMessage("Mail Sending failure : "+e.getMessage());
            response.setStatus(Boolean.FALSE);
        }

        return response;
    }
    public InternalEmail addInternalEmail(InternalEmail internalEmail){
        return mailRepository.save(internalEmail);
    }
}
