// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The size of the virtual machine.
     * 
     */
    @EnumType
    public enum VirtualMachineSizeTypes {
        Unknown("Unknown"),
        Standard_D1_v2("Standard_D1_v2"),
        Standard_D2_v2("Standard_D2_v2"),
        Standard_D3_v2("Standard_D3_v2"),
        Standard_D4_v2("Standard_D4_v2"),
        Standard_D5_v2("Standard_D5_v2"),
        Standard_D11_v2("Standard_D11_v2"),
        Standard_D12_v2("Standard_D12_v2"),
        Standard_D13_v2("Standard_D13_v2"),
        Standard_DS1_v2("Standard_DS1_v2"),
        Standard_DS2_v2("Standard_DS2_v2"),
        Standard_DS3_v2("Standard_DS3_v2"),
        Standard_DS4_v2("Standard_DS4_v2"),
        Standard_DS5_v2("Standard_DS5_v2"),
        Standard_DS11_v2("Standard_DS11_v2"),
        Standard_DS12_v2("Standard_DS12_v2"),
        Standard_DS13_v2("Standard_DS13_v2"),
        Standard_F1("Standard_F1"),
        Standard_F2("Standard_F2"),
        Standard_F4("Standard_F4"),
        Standard_F8("Standard_F8"),
        Standard_F16("Standard_F16"),
        Standard_F1s("Standard_F1s"),
        Standard_F2s("Standard_F2s"),
        Standard_F4s("Standard_F4s"),
        Standard_F8s("Standard_F8s"),
        Standard_F16s("Standard_F16s");

        private final String value;

        VirtualMachineSizeTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VirtualMachineSizeTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
