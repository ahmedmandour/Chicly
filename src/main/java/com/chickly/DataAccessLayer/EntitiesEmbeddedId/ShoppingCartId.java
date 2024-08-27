package com.chickly.DataAccessLayer.EntitiesEmbeddedId;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ShoppingCartId implements Serializable {

    private Integer customerId;
    private Integer subProductId;

    public ShoppingCartId() {
    }

    public ShoppingCartId(Integer customerId, Integer subProductId) {
        this.customerId = customerId;
        this.subProductId = subProductId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartId that = (ShoppingCartId) o;
        return Objects.equals(customerId, that.customerId) &&
                Objects.equals(subProductId, that.subProductId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, subProductId);
    }
}