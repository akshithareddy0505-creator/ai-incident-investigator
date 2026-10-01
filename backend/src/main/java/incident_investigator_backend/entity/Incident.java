package incident_investigator_backend.entity;

import incident_investigator_backend.enums.IncidentSeverity;
import incident_investigator_backend.enums.IncidentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Incident {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "severity")
    private IncidentSeverity severity;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private IncidentStatus status;

    @Column(name = "affected_service")
    private String affectedService;

    @Column(name = "environment")
    private String environment;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "resolved_at")
    private LocalDateTime resolvedAt;

}
