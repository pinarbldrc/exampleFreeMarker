package com.patuli.exampleFreeMarker.controller;

import com.patuli.exampleFreeMarker.repository.Entity.ExternalEmail;
import com.patuli.exampleFreeMarker.repository.Entity.InternalEmail;
import com.patuli.exampleFreeMarker.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping
public class FreeMarkerController {

    @Autowired
    private MailService service;

    @PostMapping("/sendingEmail")
    public ExternalEmail sendEmail(@RequestBody InternalEmail request) {
        Map<String, Object> model = new HashMap<>();
        model.put("Name", request.getFromm());
        model.put("location", "turkey");
        model.put("Subject",request.getSubject());
        return service.sendEmail(request, model);

    }
    @PostMapping("/addmail")
    public ResponseEntity<InternalEmail> addUser(@RequestBody InternalEmail internalEmail){
        return ResponseEntity.ok(service.addInternalEmail(internalEmail));
    }


}
