package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.CabinetForBuiltInAppliances;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface CabinetForBuiltInAppliancesRepository extends JpaRepository<CabinetForBuiltInAppliances, Integer> {
}
