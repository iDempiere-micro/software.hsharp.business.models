package software.hsharp.business.services

import software.hsharp.business.models.ICustomer

interface ICustomerResult : IResult {
    val customer : ICustomer?
}