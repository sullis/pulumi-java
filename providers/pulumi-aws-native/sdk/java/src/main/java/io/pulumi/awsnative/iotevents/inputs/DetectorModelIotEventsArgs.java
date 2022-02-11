// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorModelIotEventsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelIotEventsArgs Empty = new DetectorModelIotEventsArgs();

    @InputImport(name="inputName", required=true)
    private final Input<String> inputName;

    public Input<String> getInputName() {
        return this.inputName;
    }

    @InputImport(name="payload")
    private final @Nullable Input<DetectorModelPayloadArgs> payload;

    public Input<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    public DetectorModelIotEventsArgs(
        Input<String> inputName,
        @Nullable Input<DetectorModelPayloadArgs> payload) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotEventsArgs() {
        this.inputName = Input.empty();
        this.payload = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotEventsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> inputName;
        private @Nullable Input<DetectorModelPayloadArgs> payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotEventsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.payload = defaults.payload;
        }

        public Builder setInputName(Input<String> inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Input.of(Objects.requireNonNull(inputName));
            return this;
        }

        public Builder setPayload(@Nullable Input<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public DetectorModelIotEventsArgs build() {
            return new DetectorModelIotEventsArgs(inputName, payload);
        }
    }
}
