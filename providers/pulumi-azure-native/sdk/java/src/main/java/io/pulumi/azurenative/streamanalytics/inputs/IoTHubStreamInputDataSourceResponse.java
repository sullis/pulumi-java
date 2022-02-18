// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an IoT Hub input data source that contains stream data.
 * 
 */
public final class IoTHubStreamInputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final IoTHubStreamInputDataSourceResponse Empty = new IoTHubStreamInputDataSourceResponse();

    /**
     * The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    @InputImport(name="consumerGroupName")
    private final @Nullable String consumerGroupName;

    public Optional<String> getConsumerGroupName() {
        return this.consumerGroupName == null ? Optional.empty() : Optional.ofNullable(this.consumerGroupName);
    }

    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="iotHubNamespace")
    private final @Nullable String iotHubNamespace;

    public Optional<String> getIotHubNamespace() {
        return this.iotHubNamespace == null ? Optional.empty() : Optional.ofNullable(this.iotHubNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable String sharedAccessPolicyKey;

    public Optional<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable String sharedAccessPolicyName;

    public Optional<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Devices/IotHubs'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public IoTHubStreamInputDataSourceResponse(
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
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IoTHubStreamInputDataSourceResponse() {
        this.consumerGroupName = null;
        this.endpoint = null;
        this.iotHubNamespace = null;
        this.sharedAccessPolicyKey = null;
        this.sharedAccessPolicyName = null;
        this.type = null;
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
