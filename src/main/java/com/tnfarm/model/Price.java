package com.tnfarm.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Product product;

    @ManyToOne(optional = false)
    private District district;

    @ManyToOne(optional = false)
    private Market market;

    private BigDecimal pricePerQuintal; // example unit

    private LocalDate date; // day for which price applies

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public District getDistrict() { return district; }
    public void setDistrict(District district) { this.district = district; }
    public Market getMarket() { return market; }
    public void setMarket(Market market) { this.market = market; }
    public BigDecimal getPricePerQuintal() { return pricePerQuintal; }
    public void setPricePerQuintal(BigDecimal pricePerQuintal) { this.pricePerQuintal = pricePerQuintal; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
