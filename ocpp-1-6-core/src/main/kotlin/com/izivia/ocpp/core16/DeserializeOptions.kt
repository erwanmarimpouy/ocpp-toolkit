package com.izivia.ocpp.core16

import com.izivia.ocpp.core16.model.common.enumeration.Actions
import com.izivia.ocpp.utils.AbstractForcedFieldType
import com.izivia.ocpp.utils.AbstractIgnoredNullRestriction
import com.izivia.ocpp.utils.ActionTypeEnum
import com.izivia.ocpp.utils.TypeConvertEnum

data class Ocpp16IgnoredNullRestriction(
    override val action: Actions,
    override val actionType: ActionTypeEnum,
    override val fieldPath: String,
    override val defaultNullValue: String,
    override val fieldPathSeparator: String = "."
) : AbstractIgnoredNullRestriction(
    actionType = actionType,
    fieldPath = fieldPath,
    defaultNullValue = defaultNullValue,
    action = action,
    fieldPathSeparator = fieldPathSeparator
)

data class Ocpp16ForcedFieldType(
    override val action: Actions,
    override val actionType: ActionTypeEnum,
    override val fieldPath: String,
    override val typeRequested: TypeConvertEnum,
    override val fieldPathSeparator: String = "."
) : AbstractForcedFieldType(
    actionType = actionType,
    fieldPath = fieldPath,
    typeRequested = typeRequested,
    action = action,
    fieldPathSeparator = fieldPathSeparator
)
