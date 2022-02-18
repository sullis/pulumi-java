// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Use to override the device's volume type.
     * 
     */
    @EnumType
    public enum ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType {
        Standard("standard"),
        Io1("io1"),
        Io2("io2"),
        Gp2("gp2"),
        Gp3("gp3"),
        Sc1("sc1"),
        St1("st1");

        private final String value;

        ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
