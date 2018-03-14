package software.hsharp.business.models

interface ICustomer: IBusinessPartner {
    val categories : Array<ICategory>
}
