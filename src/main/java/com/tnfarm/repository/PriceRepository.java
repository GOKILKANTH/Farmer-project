package com.tnfarm.repository;

import com.tnfarm.model.Price;
import com.tnfarm.model.Product;
import com.tnfarm.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByProductAndDistrictAndDate(Product product, District district, LocalDate date);
    List<Price> findByProductAndDistrict(Product product, District district);
    List<Price> findByDate(LocalDate date);
}
