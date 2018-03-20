package software.hsharp.business.services

import software.hsharp.business.models.IBusinessPartner

interface IBusinessPartnerResult : IResult {
    val businessPartner : IBusinessPartner?
}