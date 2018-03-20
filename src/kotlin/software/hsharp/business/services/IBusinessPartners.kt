package software.hsharp.business.services

import software.hsharp.business.models.IBusinessPartner

interface IBusinessPartners {
    fun getAllBusinessPartners() : IBusinessPartnersResult
    fun getBusinessPartnerById( id : Int ) : IBusinessPartnerResult
}

interface IBusinessPartnersImpl : IBusinessPartners
interface IBusinessPartnersEndpoint : IBusinessPartners