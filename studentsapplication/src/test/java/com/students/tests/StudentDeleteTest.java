package com.students.tests;

import com.student.base.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    @Test
    public void deleteStudent(){
        given()
                .when()
                .delete("/102")
                .then()
                .statusCode(204);
    }
}
