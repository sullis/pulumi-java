// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IoTHubStreamInputDataSourceResponse {
    /**
     * The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    private final @Nullable String consumerGroupName;
    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    private final @Nullable String endpoint;
    /**
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String iotHubNamespace;
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyKey;
    /**
     * The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyName;
    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Devices/IotHubs'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"consumerGroupName","endpoint","iotHubNamespace","sharedAccessPolicyKey","sharedAccessPolicyName","type"})
    private IoTHubStreamInputDataSourceResponse(
        @Nullable String consumerGroupName,
        @Nullable String endpoint,
        @Nullable String iotHubNamespace,
        @Nullable String sharedAccessPolicyKey,
        @Nullable String sharedAccessPolicyName,
        String type) {
        this.consumerGroupName = consumerGroupName;
        this.endpoint = endpoint;
        this.iotHubNamespace = iotHubNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    public Optional<String> getConsumerGroupName() {
        return Optional.ofNullable(this.consumerGroupName);
    }
    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> getIotHubNamespace() {
        return Optional.ofNullable(this.iotHubNamespace);
    }
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> getSharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }
    /**
     * The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> getSharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }
    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Devices/IotHubs'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubStreamInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumerGroupName;
        private @Nullable String endpoint;
        private @Nullable String iotHubNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubStreamInputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.endpoint = defaults.endpoint;
    	      this.iotHubNamespace = defaults.iotHubNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroupName(@Nullable String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setIotHubNamespace(@Nullable String iotHubNamespace) {
            this.iotHubNamespace = iotHubNamespace;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public IoTHubStreamInputDataSourceResponse build() {
            return new IoTHubStreamInputDataSourceResponse(consumerGroupName, endpoint, iotHubNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
