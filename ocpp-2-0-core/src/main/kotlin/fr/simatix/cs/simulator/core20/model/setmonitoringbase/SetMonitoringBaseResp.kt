package fr.simatix.cs.simulator.core20.model.setmonitoringbase

import fr.simatix.cs.simulator.core20.model.common.StatusInfoType
import fr.simatix.cs.simulator.core20.model.common.enumeration.GenericDeviceModelStatusEnumType

data class SetMonitoringBaseResp(
        val status : GenericDeviceModelStatusEnumType,
        val statusInfo : StatusInfoType?=null
)