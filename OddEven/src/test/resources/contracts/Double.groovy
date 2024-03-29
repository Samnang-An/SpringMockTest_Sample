package contracts

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "double number"
    request{
        method GET()
        url("/double") {
            queryParameters {
                parameter("number", "2")
            }
        }
    }
    response {
        body("4")
        status 200
    }
}