package com.patuli.exampleFreeMarker.repository.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Tolerate;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.ap.internal.model.Constructor;
import lombok.AccessLevel;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

import java.util.List;
import java.util.UUID;


@Data
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "tbl_mail")
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(makeFinal = true, level = AccessLevel.PUBLIC)
public final class InternalEmail implements Serializable {






    @Id
    @GeneratedValue(generator = "UUID")
    private final UUID id=UUID.randomUUID();


    @Email
    private final String fromm;

    @Email
    private final String too;

    @Email
    private final String replyTo;

    private final String subject;

    private final  String htmlBody;










}
