// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
 * 
 */
public final class DetectorModelIotEvents extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelIotEvents Empty = new DetectorModelIotEvents();

    /**
     * The name of the AWS IoT Events input where the data is sent.
     * 
     */
    @InputImport(name="inputName", required=true)
    private final String inputName;

    public String getInputName() {
        return this.inputName;
    }

    @InputImport(name="payload")
    private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    public DetectorModelIotEvents(
        String inputName,
        @Nullable DetectorModelPayload payload) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotEvents() {
        this.inputName = null;
        this.payload = null;
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
