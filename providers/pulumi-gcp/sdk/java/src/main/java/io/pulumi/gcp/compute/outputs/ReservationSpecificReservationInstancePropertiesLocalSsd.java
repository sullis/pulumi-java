// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReservationSpecificReservationInstancePropertiesLocalSsd {
    /**
     * The size of the disk in base-2 GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are `SCSI` and `NVME`.
     * 
     */
    private final @Nullable String interface_;

    @CustomType.Constructor
    private ReservationSpecificReservationInstancePropertiesLocalSsd(
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("interface") @Nullable String interface_) {
        this.diskSizeGb = diskSizeGb;
        this.interface_ = interface_;
    }

    /**
     * The size of the disk in base-2 GB.
     * 
    */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are `SCSI` and `NVME`.
     * 
    */
    public Optional<String> getInterface_() {
        return Optional.ofNullable(this.interface_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesLocalSsd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private @Nullable String interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesLocalSsd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.interface_ = defaults.interface_;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder interface_(@Nullable String interface_) {
            this.interface_ = interface_;
            return this;
        }        public ReservationSpecificReservationInstancePropertiesLocalSsd build() {
            return new ReservationSpecificReservationInstancePropertiesLocalSsd(diskSizeGb, interface_);
        }
    }
}
