// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelSns {
    private final @Nullable DetectorModelPayload payload;
    /**
     * The ARN of the Amazon SNS target where the message is sent.
     * 
     */
    private final String targetArn;

    @CustomType.Constructor
    private DetectorModelSns(
        @CustomType.Parameter("payload") @Nullable DetectorModelPayload payload,
        @CustomType.Parameter("targetArn") String targetArn) {
        this.payload = payload;
        this.targetArn = targetArn;
    }

    public Optional<DetectorModelPayload> payload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * The ARN of the Amazon SNS target where the message is sent.
     * 
    */
    public String targetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelPayload payload;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }        public DetectorModelSns build() {
            return new DetectorModelSns(payload, targetArn);
        }
    }
}
