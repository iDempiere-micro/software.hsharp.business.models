package software.hsharp.business.services

import software.hsharp.business.models.IBusinessPartner

interface IBusinessPartnersResult {
   val businessPartners : Array<IBusinessPartner>
}