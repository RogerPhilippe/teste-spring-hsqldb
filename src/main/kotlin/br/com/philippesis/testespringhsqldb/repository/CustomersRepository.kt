package br.com.philippesis.testespringhsqldb.repository

import br.com.philippesis.testespringhsqldb.model.Customers
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomersRepository: CrudRepository<Customers, Integer>