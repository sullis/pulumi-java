// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MulticastGroupLoRaWAN {
    private final String dlClass;
    private final @Nullable Integer numberOfDevicesInGroup;
    private final @Nullable Integer numberOfDevicesRequested;
    private final String rfRegion;

    @OutputCustomType.Constructor({"dlClass","numberOfDevicesInGroup","numberOfDevicesRequested","rfRegion"})
    private MulticastGroupLoRaWAN(
        String dlClass,
        @Nullable Integer numberOfDevicesInGroup,
        @Nullable Integer numberOfDevicesRequested,
        String rfRegion) {
        this.dlClass = Objects.requireNonNull(dlClass);
        this.numberOfDevicesInGroup = numberOfDevicesInGroup;
        this.numberOfDevicesRequested = numberOfDevicesRequested;
        this.rfRegion = Objects.requireNonNull(rfRegion);
    }

    public String getDlClass() {
        return this.dlClass;
    }
    public Optional<Integer> getNumberOfDevicesInGroup() {
        return Optional.ofNullable(this.numberOfDevicesInGroup);
    }
    public Optional<Integer> getNumberOfDevicesRequested() {
        return Optional.ofNullable(this.numberOfDevicesRequested);
    }
    public String getRfRegion() {
        return this.rfRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MulticastGroupLoRaWAN defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dlClass;
        private @Nullable Integer numberOfDevicesInGroup;
        private @Nullable Integer numberOfDevicesRequested;
        private String rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MulticastGroupLoRaWAN defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dlClass = defaults.dlClass;
    	      this.numberOfDevicesInGroup = defaults.numberOfDevicesInGroup;
    	      this.numberOfDevicesRequested = defaults.numberOfDevicesRequested;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder setDlClass(String dlClass) {
            this.dlClass = Objects.requireNonNull(dlClass);
            return this;
        }

        public Builder setNumberOfDevicesInGroup(@Nullable Integer numberOfDevicesInGroup) {
            this.numberOfDevicesInGroup = numberOfDevicesInGroup;
            return this;
        }

        public Builder setNumberOfDevicesRequested(@Nullable Integer numberOfDevicesRequested) {
            this.numberOfDevicesRequested = numberOfDevicesRequested;
            return this;
        }

        public Builder setRfRegion(String rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }

        public MulticastGroupLoRaWAN build() {
            return new MulticastGroupLoRaWAN(dlClass, numberOfDevicesInGroup, numberOfDevicesRequested, rfRegion);
        }
    }
}
