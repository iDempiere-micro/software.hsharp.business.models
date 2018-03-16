package software.hsharp.business.services

import software.hsharp.business.models.ICustomer

interface ICustomersResult {
    val customers : Array<ICustomer>
}