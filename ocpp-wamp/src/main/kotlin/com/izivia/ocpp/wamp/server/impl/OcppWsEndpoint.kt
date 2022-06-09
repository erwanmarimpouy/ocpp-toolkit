package com.izivia.ocpp.wamp.server.impl

import org.http4k.core.UriTemplate

object OcppWsEndpoint {
    fun extractChargingStationOcppId(uri:String) = uriTemplate.extract(uri)["chargingStationOcppId"]

    val uriTemplate = UriTemplate.from("/ws/{chargingStationOcppId}")
}
