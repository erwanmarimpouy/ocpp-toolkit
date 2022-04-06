package fr.simatix.cs.simulator.adapter20.mapper

import fr.simatix.cs.simulator.core20.model.changeavailability.ChangeAvailabilityReq
import fr.simatix.cs.simulator.core20.model.changeavailability.ChangeAvailabilityResp
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import fr.simatix.cs.simulator.api.model.changeavailability.ChangeAvailabilityReq as ChangeAvailabilityReqGen
import fr.simatix.cs.simulator.api.model.changeavailability.ChangeAvailabilityResp as ChangeAvailabilityRespGen

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ChangeAvailabilityMapper {

    fun genToCoreResp(availabilityResp: ChangeAvailabilityRespGen?): ChangeAvailabilityResp

    fun coreToGenReq(availabilityReq: ChangeAvailabilityReq): ChangeAvailabilityReqGen

}