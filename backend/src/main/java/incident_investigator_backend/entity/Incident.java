package incident_investigator_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Incident {

    @Id
    @GeneratedValue
    private Long id;

}
