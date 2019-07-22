package br.com.philippesis.testespringhsqldb

import br.com.philippesis.testespringhsqldb.model.Customers
import br.com.philippesis.testespringhsqldb.repository.CustomersRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class TesteSpringHsqldbApplicationTests {

	@Autowired lateinit var repository: CustomersRepository

	@Test fun contextLoads() {
		repository is CustomersRepository
	}

	@Test
	fun save() {
		val customer = Customers(name = "Juliana Martins", email = "ju@email.com")
		Assert.assertNotNull(repository.save(customer))
	}

}
