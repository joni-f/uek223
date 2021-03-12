package ch.noser.uek223.domain.product.dto;

import java.util.UUID;

public class ProductDTOWithPrice {

  private UUID id;
  private double purchasePrice;
  private double sellingPrice;

  public ProductDTOWithPrice() {

  }

  public ProductDTOWithPrice(UUID id, double purchasePrice, double sellingPrice) {
    this.id = id;
    this.purchasePrice = purchasePrice;
    this.sellingPrice = sellingPrice;
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

  public double getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }
}
