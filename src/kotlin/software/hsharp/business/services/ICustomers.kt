package software.hsharp.business.services

import software.hsharp.business.models.ICustomer
import software.hsharp.business.models.ICategory

interface ICustomers {
    fun getAllCustomers() : Array<ICustomer>
    fun getCustomerById( id : Int ) : ICustomer?
    fun getCustomersByAnyCategory( categories : Array<ICategory> ) : Array<ICustomer>
}