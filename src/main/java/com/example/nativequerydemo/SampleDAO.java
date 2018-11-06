package com.example.nativequerydemo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleDAO extends JpaRepository<SampleModel, Integer> {

  @Query(value = "select id, name from table1", nativeQuery = true)
  List<SampleModel> findAllFromTable1();

  @Query(value = "select id, name from table2", nativeQuery = true)
  List<SampleModel> findAllFromTable2();
}
