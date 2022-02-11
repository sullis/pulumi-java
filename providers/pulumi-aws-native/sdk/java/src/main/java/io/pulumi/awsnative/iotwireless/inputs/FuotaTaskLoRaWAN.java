// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuotaTaskLoRaWAN extends io.pulumi.resources.InvokeArgs {

    public static final FuotaTaskLoRaWAN Empty = new FuotaTaskLoRaWAN();

    @InputImport(name="rfRegion", required=true)
    private final String rfRegion;

    public String getRfRegion() {
        return this.rfRegion;
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public FuotaTaskLoRaWAN(
        String rfRegion,
        @Nullable String startTime) {
        this.rfRegion = Objects.requireNonNull(rfRegion, "expected parameter 'rfRegion' to be non-null");
        this.startTime = startTime;
    }

    private FuotaTaskLoRaWAN() {
        this.rfRegion = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuotaTaskLoRaWAN defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rfRegion;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FuotaTaskLoRaWAN defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rfRegion = defaults.rfRegion;
    	      this.startTime = defaults.startTime;
        }

        public Builder setRfRegion(String rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public FuotaTaskLoRaWAN build() {
            return new FuotaTaskLoRaWAN(rfRegion, startTime);
        }
    }
}
