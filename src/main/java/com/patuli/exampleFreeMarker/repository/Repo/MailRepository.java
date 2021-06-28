package com.patuli.exampleFreeMarker.repository.Repo;

import com.patuli.exampleFreeMarker.repository.Entity.InternalEmail;
import org.springframework.data.jpa.repository.JpaRepository;

;import java.util.UUID;

public interface MailRepository extends JpaRepository<InternalEmail, UUID> {
}
