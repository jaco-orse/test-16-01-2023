package it.ntt.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria extends BaseEntity{
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "categoria")
    private List<Skill> skills;
}
