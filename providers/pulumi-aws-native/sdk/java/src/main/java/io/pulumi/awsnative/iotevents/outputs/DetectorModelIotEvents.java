// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelIotEvents {
    private final String inputName;
    private final @Nullable DetectorModelPayload payload;

    @OutputCustomType.Constructor({"inputName","payload"})
    private DetectorModelIotEvents(
        String inputName,
        @Nullable DetectorModelPayload payload) {
        this.inputName = Objects.requireNonNull(inputName);
        this.payload = payload;
    }

    public String getInputName() {
        return this.inputName;
    }
    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotEvents defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;
        private @Nullable DetectorModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotEvents defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.payload = defaults.payload;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public DetectorModelIotEvents build() {
            return new DetectorModelIotEvents(inputName, payload);
        }
    }
}
