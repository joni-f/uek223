package ch.noser.uek223.domain.product.dto;

import java.util.UUID;

public class ProductDTOWithoutPrice {

  private UUID id;
  private double purchasePrice;

  public ProductDTOWithoutPrice() {

  }

  public ProductDTOWithoutPrice(UUID id, double purchasePrice) {
    this.id = id;
    this.purchasePrice = purchasePrice;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }
}
