// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Azure VM family.
     * 
     */
    @EnumType
    public enum AzureVmFamily {
        Unknown("Unknown"),
        Basic_A0_A4("Basic_A0_A4"),
        Standard_A0_A7("Standard_A0_A7"),
        Standard_A8_A11("Standard_A8_A11"),
        Av2_series("Av2_series"),
        D_series("D_series"),
        Dv2_series("Dv2_series"),
        DS_series("DS_series"),
        DSv2_series("DSv2_series"),
        F_series("F_series"),
        Fs_series("Fs_series"),
        G_series("G_series"),
        GS_series("GS_series"),
        H_series("H_series"),
        Ls_series("Ls_series"),
        Dsv3_series("Dsv3_series"),
        Dv3_series("Dv3_series"),
        Fsv2_series("Fsv2_series"),
        Ev3_series("Ev3_series"),
        Esv3_series("Esv3_series"),
        M_series("M_series"),
        DC_Series("DC_Series");

        private final String value;

        AzureVmFamily(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AzureVmFamily[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
