package software.hsharp.business.services

import software.hsharp.business.models.ICustomer

interface ICustomersResult : IResult {
    val customers : Array<ICustomer>
}