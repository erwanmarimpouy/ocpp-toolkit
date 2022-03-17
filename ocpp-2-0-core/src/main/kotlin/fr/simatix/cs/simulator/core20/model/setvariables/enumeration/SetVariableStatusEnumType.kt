package fr.simatix.cs.simulator.core20.model.setvariables.enumeration

enum class SetVariableStatusEnumType(val value: String) {
    Accepted("Accepted"),

    Rejected("Rejected"),

    UnknownComponent("UnknownComponent"),

    UnknownVariable("UnknownVariable"),

    NotSupportedAttributeType("NotSupportedAttributeType"),

    RebootRequired("RebootRequired");
}