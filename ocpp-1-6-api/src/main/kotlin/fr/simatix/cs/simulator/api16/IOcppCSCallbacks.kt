package fr.simatix.cs.simulator.api16

import fr.simatix.cs.simulator.core16.model.cancelreservation.CancelReservationReq
import fr.simatix.cs.simulator.core16.model.cancelreservation.CancelReservationResp
import fr.simatix.cs.simulator.core16.model.changeavailability.ChangeAvailabilityReq
import fr.simatix.cs.simulator.core16.model.changeavailability.ChangeAvailabilityResp
import fr.simatix.cs.simulator.core16.model.changeconfiguration.ChangeConfigurationReq
import fr.simatix.cs.simulator.core16.model.changeconfiguration.ChangeConfigurationResp
import fr.simatix.cs.simulator.core16.model.clearcache.ClearCacheReq
import fr.simatix.cs.simulator.core16.model.clearcache.ClearCacheResp
import fr.simatix.cs.simulator.core16.model.clearchargingprofile.ClearChargingProfileReq
import fr.simatix.cs.simulator.core16.model.clearchargingprofile.ClearChargingProfileResp
import fr.simatix.cs.simulator.core16.model.datatransfer.DataTransferReq
import fr.simatix.cs.simulator.core16.model.datatransfer.DataTransferResp
import fr.simatix.cs.simulator.core16.model.getcompositeschedule.GetCompositeScheduleReq
import fr.simatix.cs.simulator.core16.model.getcompositeschedule.GetCompositeScheduleResp
import fr.simatix.cs.simulator.core16.model.getconfiguration.GetConfigurationReq
import fr.simatix.cs.simulator.core16.model.getconfiguration.GetConfigurationResp
import fr.simatix.cs.simulator.core16.model.getdiagnostics.GetDiagnosticsReq
import fr.simatix.cs.simulator.core16.model.getdiagnostics.GetDiagnosticsResp
import fr.simatix.cs.simulator.core16.model.getlocallistversion.GetLocalListVersionReq
import fr.simatix.cs.simulator.core16.model.getlocallistversion.GetLocalListVersionResp
import fr.simatix.cs.simulator.core16.model.remotestart.RemoteStartTransactionReq
import fr.simatix.cs.simulator.core16.model.remotestart.RemoteStartTransactionResp
import fr.simatix.cs.simulator.core16.model.remotestop.RemoteStopTransactionReq
import fr.simatix.cs.simulator.core16.model.remotestop.RemoteStopTransactionResp
import fr.simatix.cs.simulator.core16.model.reservenow.ReserveNowReq
import fr.simatix.cs.simulator.core16.model.reservenow.ReserveNowResp
import fr.simatix.cs.simulator.core16.model.reset.ResetReq
import fr.simatix.cs.simulator.core16.model.reset.ResetResp
import fr.simatix.cs.simulator.core16.model.sendlocallist.SendLocalListReq
import fr.simatix.cs.simulator.core16.model.sendlocallist.SendLocalListResp
import fr.simatix.cs.simulator.core16.model.setchargingprofile.SetChargingProfileReq
import fr.simatix.cs.simulator.core16.model.setchargingprofile.SetChargingProfileResp
import fr.simatix.cs.simulator.core16.model.triggermessage.TriggerMessageReq
import fr.simatix.cs.simulator.core16.model.triggermessage.TriggerMessageResp
import fr.simatix.cs.simulator.core16.model.unlockconnector.UnlockConnectorReq
import fr.simatix.cs.simulator.core16.model.unlockconnector.UnlockConnectorResp
import fr.simatix.cs.simulator.core16.model.updatefirmware.UpdateFirmwareReq
import fr.simatix.cs.simulator.core16.model.updatefirmware.UpdateFirmwareResp

interface IOcppCSCallbacks {
    fun reset (req: ResetReq): ResetResp
    fun changeAvailability(
    req: ChangeAvailabilityReq
): ChangeAvailabilityResp

    fun changeConfiguration(
    req: ChangeConfigurationReq
): ChangeConfigurationResp

    fun clearCache(
    req: ClearCacheReq
): ClearCacheResp

    fun remoteStartTransaction(
    req: RemoteStartTransactionReq
): RemoteStartTransactionResp

    fun remoteStopTransaction(
    req: RemoteStopTransactionReq
): RemoteStopTransactionResp

    fun unlockConnector(
    req: UnlockConnectorReq
): UnlockConnectorResp

    fun getConfiguration(
    req: GetConfigurationReq
): GetConfigurationResp

    fun cancelReservation(
    req: CancelReservationReq
): CancelReservationResp

    fun clearChargingProfile(
    req: ClearChargingProfileReq
): ClearChargingProfileResp

    fun getCompositeSchedule(
    req: GetCompositeScheduleReq
): GetCompositeScheduleResp

    fun getLocalListVersion(
    req: GetLocalListVersionReq
): GetLocalListVersionResp

    fun updateFirmware(
    req: UpdateFirmwareReq
): UpdateFirmwareResp

    fun sendLocalList(
    req: SendLocalListReq
): SendLocalListResp

    fun triggerMessage(
    req: TriggerMessageReq
): TriggerMessageResp

    fun setChargingProfile(
    req: SetChargingProfileReq
): SetChargingProfileResp

    fun reserveNow(
    req: ReserveNowReq
): ReserveNowResp

    fun dataTransfer(
    req: DataTransferReq
): DataTransferResp

    fun getDiagnostics(
    req: GetDiagnosticsReq
): GetDiagnosticsResp
}