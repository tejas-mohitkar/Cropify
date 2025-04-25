package com.cropify.adminservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
  "springdoc.api-docs.enabled=false",
  "springdoc.swagger-ui.enabled=false"
})
class CropifyAdminServiceApplicationTests {

  @Test
  void contextLoads() { }
}
