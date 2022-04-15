// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FuotaTaskLoRaWAN {
    /**
     * FUOTA task LoRaWAN RF region
     * 
     */
    private final String rfRegion;
    /**
     * FUOTA task LoRaWAN start time
     * 
     */
    private final @Nullable String startTime;

    @CustomType.Constructor
    private FuotaTaskLoRaWAN(
        @CustomType.Parameter("rfRegion") String rfRegion,
        @CustomType.Parameter("startTime") @Nullable String startTime) {
        this.rfRegion = rfRegion;
        this.startTime = startTime;
    }

    /**
     * FUOTA task LoRaWAN RF region
     * 
    */
    public String rfRegion() {
        return this.rfRegion;
    }
    /**
     * FUOTA task LoRaWAN start time
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
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

        public Builder rfRegion(String rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public FuotaTaskLoRaWAN build() {
            return new FuotaTaskLoRaWAN(rfRegion, startTime);
        }
    }
}
