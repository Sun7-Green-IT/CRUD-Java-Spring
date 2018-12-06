package com.example.postgresdemo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id", updatable = false, nullable = false)
    private UUID roleId;

    private String name;

    private Date createdat;

    public UUID getRoleId() {
        return roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}
