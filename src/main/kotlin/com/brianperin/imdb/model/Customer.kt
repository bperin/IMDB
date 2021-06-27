package com.brianperin.imdb.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.Type
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customers")
data class Customer(
    @Id
    @Type(type = "pg-uuid")
    val id: UUID = UUID.randomUUID()
) {
    
    @JsonProperty("created_at")
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    val createdAt: Date = Date()

    @JsonProperty("updated_at")
    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: Date = Date()

}
