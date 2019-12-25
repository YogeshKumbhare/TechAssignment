package com.hashtaag.TechAssign.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hashtaag.TechAssign.Model.Citi;


@Repository
public interface CitiRepository extends JpaRepository<Citi, Long> {

	
	@Query(value = "SELECT * FROM citi u WHERE u.state  ILIKE :state% ",  nativeQuery = true)
	List<Citi> findAllByState(@Param("state") String state);

	@Query(value = "SELECT * FROM citi u WHERE u.town  ILIKE :town% ",  nativeQuery = true)
	List<Citi> findAllByTownInIgnoreCase(@Param("town") String town);
	
	@Query(value = "SELECT * FROM citi u WHERE u.district  ILIKE :district% ",  nativeQuery = true)
	List<Citi> findAllByDistrictInIgnoreCase(@Param("district") String district);
}
