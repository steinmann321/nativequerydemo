package com.example.nativequerydemo;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  private final SampleDAO sampleDAO;

  public TestController(SampleDAO sampleDAO) {
    this.sampleDAO = sampleDAO;
  }

  @GetMapping(path = "/")
  @ResponseBody
  public String testNativeQuery() {
    List<SampleModel> list1 = this.sampleDAO.findAllFromTable1();
    List<SampleModel> list2 = this.sampleDAO.findAllFromTable2();

    SampleModel m1 = list1.get(0);
    SampleModel m2 = list2.get(0);
    System.out.println("*****************************************");
    System.out.println("Data from findAllFromTable1():");
    list1.forEach(l -> {
      System.out.println(l.getName());
    });
    System.out.println("*****************************************");
    System.out.println("Data from findAllFromTable2():");
    list2.forEach(l -> {
      System.out.println(l.getName());
    });
    System.out.println("*****************************************");

    return "Done";
  }
}
