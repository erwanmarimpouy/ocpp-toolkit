package fr.simatix.cs.simulator.core.test

import fr.simatix.cs.simulator.core16.ChargePointOperations
import fr.simatix.cs.simulator.core16.model.HeartbeatRequest
import fr.simatix.cs.simulator.core16.model.HeartbeatResponse
import fr.simatix.cs.simulator.transport.Transport
import fr.simatix.cs.simulator.transport.sendMessage
import io.mockk.every
import io.mockk.mockk
import kotlinx.datetime.Instant
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CoreTest {
    @Test
    fun `heartbeat request`() {

        val transport = mockk<Transport>()
        every { transport.sendMessage<HeartbeatRequest,HeartbeatResponse>(any(),any()) } returns HeartbeatResponse(
            currentTime = Instant.parse("2022-02-15T00:00:00.000Z")
        )

        val operations =
            ChargePointOperations.newChargePointOperations(transport)
        val response = operations.heartbeat(HeartbeatRequest())
        expectThat(response)
            .and { get { this.currentTime }.isEqualTo(Instant.parse("2022-02-15T00:00:00.000Z")) }
    }
}