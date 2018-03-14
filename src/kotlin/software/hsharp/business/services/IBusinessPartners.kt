package software.hsharp.business.services

import software.hsharp.business.models.IBusinessPartner

interface IBusinessPartners {
    fun getAllBusinessPartners() : Array<IBusinessPartner>
    fun getBusinessPartnerById( id : Int ) : IBusinessPartner?
}