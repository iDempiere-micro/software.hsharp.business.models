package software.hsharp.business.services

import software.hsharp.business.models.IBusinessPartner

interface IBusinessPartnersResult : IResult {
   val businessPartners : Array<IBusinessPartner>
}