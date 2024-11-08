package seg3x02.booksapigraphql.resolvers.types

class CreateEmployeeInput(
    val name: String? = null,
    val dateOfBirth: String? = null,
    val city: String? = null,
    val salary: Float? = null,
    val gender: String? = null,
    val email: String? = null
)