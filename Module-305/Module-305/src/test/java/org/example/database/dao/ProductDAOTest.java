package org.example.database.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)                //this line doesn't force you to make beforeAll method static
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)           // without it we have to make it static

public class ProductDAOTest {

      ProductDAO productDAO = new ProductDAO();

      @BeforeAll
    public void productCreate(){

      }
}
