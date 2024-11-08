package seg3x02.booksapigraphql.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employee")
data class Employee(var name: String,
                    var dateOfBirth: String,
                    var city: String,
                    var salary: Float,
                    var gender: String?,
                    var email: String?) {
    @Id
    var id: String = ""
}