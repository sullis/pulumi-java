// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.FeedbackPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudToDevicePropertiesResponse {
    /**
     * The default time to live for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     */
    private final @Nullable String defaultTtlAsIso8601;
    /**
     * The properties of the feedback queue for cloud-to-device messages.
     * 
     */
    private final @Nullable FeedbackPropertiesResponse feedback;
    /**
     * The max delivery count for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;

    @OutputCustomType.Constructor({"defaultTtlAsIso8601","feedback","maxDeliveryCount"})
    private CloudToDevicePropertiesResponse(
        @Nullable String defaultTtlAsIso8601,
        @Nullable FeedbackPropertiesResponse feedback,
        @Nullable Integer maxDeliveryCount) {
        this.defaultTtlAsIso8601 = defaultTtlAsIso8601;
        this.feedback = feedback;
        this.maxDeliveryCount = maxDeliveryCount;
    }

    /**
     * The default time to live for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
    */
    public Optional<String> getDefaultTtlAsIso8601() {
        return Optional.ofNullable(this.defaultTtlAsIso8601);
    }
    /**
     * The properties of the feedback queue for cloud-to-device messages.
     * 
    */
    public Optional<FeedbackPropertiesResponse> getFeedback() {
        return Optional.ofNullable(this.feedback);
    }
    /**
     * The max delivery count for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
    */
    public Optional<Integer> getMaxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudToDevicePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultTtlAsIso8601;
        private @Nullable FeedbackPropertiesResponse feedback;
        private @Nullable Integer maxDeliveryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudToDevicePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTtlAsIso8601 = defaults.defaultTtlAsIso8601;
    	      this.feedback = defaults.feedback;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
        }

        public Builder setDefaultTtlAsIso8601(@Nullable String defaultTtlAsIso8601) {
            this.defaultTtlAsIso8601 = defaultTtlAsIso8601;
            return this;
        }

        public Builder setFeedback(@Nullable FeedbackPropertiesResponse feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder setMaxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public CloudToDevicePropertiesResponse build() {
            return new CloudToDevicePropertiesResponse(defaultTtlAsIso8601, feedback, maxDeliveryCount);
        }
    }
}