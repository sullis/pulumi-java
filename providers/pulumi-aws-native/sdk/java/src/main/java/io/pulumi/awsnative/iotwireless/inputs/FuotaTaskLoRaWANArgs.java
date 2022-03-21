// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FuotaTaskLoRaWANArgs extends io.pulumi.resources.ResourceArgs {

    public static final FuotaTaskLoRaWANArgs Empty = new FuotaTaskLoRaWANArgs();

    /**
     * FUOTA task LoRaWAN RF region
     * 
     */
    @Import(name="rfRegion", required=true)
      private final Output<String> rfRegion;

    public Output<String> getRfRegion() {
        return this.rfRegion;
    }

    /**
     * FUOTA task LoRaWAN start time
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public FuotaTaskLoRaWANArgs(
        Output<String> rfRegion,
        @Nullable Output<String> startTime) {
        this.rfRegion = Objects.requireNonNull(rfRegion, "expected parameter 'rfRegion' to be non-null");
        this.startTime = startTime;
    }

    private FuotaTaskLoRaWANArgs() {
        this.rfRegion = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuotaTaskLoRaWANArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> rfRegion;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FuotaTaskLoRaWANArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rfRegion = defaults.rfRegion;
    	      this.startTime = defaults.startTime;
        }

        public Builder rfRegion(Output<String> rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }
        public Builder rfRegion(String rfRegion) {
            this.rfRegion = Output.of(Objects.requireNonNull(rfRegion));
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }        public FuotaTaskLoRaWANArgs build() {
            return new FuotaTaskLoRaWANArgs(rfRegion, startTime);
        }
    }
}
