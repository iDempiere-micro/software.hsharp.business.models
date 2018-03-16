package software.hsharp.business.services

import software.hsharp.business.models.ICustomer
import software.hsharp.business.models.ICategory

interface ICustomers {
    fun getAllCustomers() : ICustomersResult
    fun getCustomerById( id : Int ) : ICustomerResult
    fun getCustomersByAnyCategory( categories : Array<ICategory> ) : ICustomersResult
}