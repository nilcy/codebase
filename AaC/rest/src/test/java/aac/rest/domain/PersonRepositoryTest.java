package aac.rest.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@Slf4j
class PersonRepositoryTest {

  @Autowired
  private PersonRepository repo;

  @Test
  public void test() {
    Person person = new Person("firstname", "lastname");
    log.debug("出力: {}", person);
    repo.save(person);
    assertNotNull(repo.findAll());
  }
}
