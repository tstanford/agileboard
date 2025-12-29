package io.stanford.tim.agileboard_service.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ticket")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subject;

    private String detail;

    @OneToMany(mappedBy = "story", fetch = FetchType.LAZY)
    private List<Update> updates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<Update> getUpdates() {
        return updates;
    }

    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }
}
