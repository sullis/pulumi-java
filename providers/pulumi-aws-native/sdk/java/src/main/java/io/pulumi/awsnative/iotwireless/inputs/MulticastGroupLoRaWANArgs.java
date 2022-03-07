// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MulticastGroupLoRaWANArgs extends io.pulumi.resources.ResourceArgs {

    public static final MulticastGroupLoRaWANArgs Empty = new MulticastGroupLoRaWANArgs();

    /**
     * Multicast group LoRaWAN DL Class
     * 
     */
    @InputImport(name="dlClass", required=true)
      private final Input<String> dlClass;

    public Input<String> getDlClass() {
        return this.dlClass;
    }

    /**
     * Multicast group number of devices in group. Returned after successful read.
     * 
     */
    @InputImport(name="numberOfDevicesInGroup")
      private final @Nullable Input<Integer> numberOfDevicesInGroup;

    public Input<Integer> getNumberOfDevicesInGroup() {
        return this.numberOfDevicesInGroup == null ? Input.empty() : this.numberOfDevicesInGroup;
    }

    /**
     * Multicast group number of devices requested. Returned after successful read.
     * 
     */
    @InputImport(name="numberOfDevicesRequested")
      private final @Nullable Input<Integer> numberOfDevicesRequested;

    public Input<Integer> getNumberOfDevicesRequested() {
        return this.numberOfDevicesRequested == null ? Input.empty() : this.numberOfDevicesRequested;
    }

    /**
     * Multicast group LoRaWAN RF region
     * 
     */
    @InputImport(name="rfRegion", required=true)
      private final Input<String> rfRegion;

    public Input<String> getRfRegion() {
        return this.rfRegion;
    }

    public MulticastGroupLoRaWANArgs(
        Input<String> dlClass,
        @Nullable Input<Integer> numberOfDevicesInGroup,
        @Nullable Input<Integer> numberOfDevicesRequested,
        Input<String> rfRegion) {
        this.dlClass = Objects.requireNonNull(dlClass, "expected parameter 'dlClass' to be non-null");
        this.numberOfDevicesInGroup = numberOfDevicesInGroup;
        this.numberOfDevicesRequested = numberOfDevicesRequested;
        this.rfRegion = Objects.requireNonNull(rfRegion, "expected parameter 'rfRegion' to be non-null");
    }

    private MulticastGroupLoRaWANArgs() {
        this.dlClass = Input.empty();
        this.numberOfDevicesInGroup = Input.empty();
        this.numberOfDevicesRequested = Input.empty();
        this.rfRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MulticastGroupLoRaWANArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dlClass;
        private @Nullable Input<Integer> numberOfDevicesInGroup;
        private @Nullable Input<Integer> numberOfDevicesRequested;
        private Input<String> rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MulticastGroupLoRaWANArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dlClass = defaults.dlClass;
    	      this.numberOfDevicesInGroup = defaults.numberOfDevicesInGroup;
    	      this.numberOfDevicesRequested = defaults.numberOfDevicesRequested;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder setDlClass(Input<String> dlClass) {
            this.dlClass = Objects.requireNonNull(dlClass);
            return this;
        }

        public Builder setDlClass(String dlClass) {
            this.dlClass = Input.of(Objects.requireNonNull(dlClass));
            return this;
        }

        public Builder setNumberOfDevicesInGroup(@Nullable Input<Integer> numberOfDevicesInGroup) {
            this.numberOfDevicesInGroup = numberOfDevicesInGroup;
            return this;
        }

        public Builder setNumberOfDevicesInGroup(@Nullable Integer numberOfDevicesInGroup) {
            this.numberOfDevicesInGroup = Input.ofNullable(numberOfDevicesInGroup);
            return this;
        }

        public Builder setNumberOfDevicesRequested(@Nullable Input<Integer> numberOfDevicesRequested) {
            this.numberOfDevicesRequested = numberOfDevicesRequested;
            return this;
        }

        public Builder setNumberOfDevicesRequested(@Nullable Integer numberOfDevicesRequested) {
            this.numberOfDevicesRequested = Input.ofNullable(numberOfDevicesRequested);
            return this;
        }

        public Builder setRfRegion(Input<String> rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }

        public Builder setRfRegion(String rfRegion) {
            this.rfRegion = Input.of(Objects.requireNonNull(rfRegion));
            return this;
        }
        public MulticastGroupLoRaWANArgs build() {
            return new MulticastGroupLoRaWANArgs(dlClass, numberOfDevicesInGroup, numberOfDevicesRequested, rfRegion);
        }
    }
}