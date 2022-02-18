// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an IoT Hub input data source that contains stream data.
 * 
 */
public final class IoTHubStreamInputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTHubStreamInputDataSourceArgs Empty = new IoTHubStreamInputDataSourceArgs();

    /**
     * The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    @InputImport(name="consumerGroupName")
    private final @Nullable Input<String> consumerGroupName;

    public Input<String> getConsumerGroupName() {
        return this.consumerGroupName == null ? Input.empty() : this.consumerGroupName;
    }

    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="iotHubNamespace")
    private final @Nullable Input<String> iotHubNamespace;

    public Input<String> getIotHubNamespace() {
        return this.iotHubNamespace == null ? Input.empty() : this.iotHubNamespace;
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable Input<String> sharedAccessPolicyKey;

    public Input<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Input.empty() : this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable Input<String> sharedAccessPolicyName;

    public Input<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Input.empty() : this.sharedAccessPolicyName;
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Devices/IotHubs'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public IoTHubStreamInputDataSourceArgs(
        @Nullable Input<String> consumerGroupName,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> iotHubNamespace,
        @Nullable Input<String> sharedAccessPolicyKey,
        @Nullable Input<String> sharedAccessPolicyName,
        Input<String> type) {
        this.consumerGroupName = consumerGroupName;
        this.endpoint = endpoint;
        this.iotHubNamespace = iotHubNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IoTHubStreamInputDataSourceArgs() {
        this.consumerGroupName = Input.empty();
        this.endpoint = Input.empty();
        this.iotHubNamespace = Input.empty();
        this.sharedAccessPolicyKey = Input.empty();
        this.sharedAccessPolicyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubStreamInputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consumerGroupName;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> iotHubNamespace;
        private @Nullable Input<String> sharedAccessPolicyKey;
        private @Nullable Input<String> sharedAccessPolicyName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubStreamInputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.endpoint = defaults.endpoint;
    	      this.iotHubNamespace = defaults.iotHubNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroupName(@Nullable Input<String> consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder setConsumerGroupName(@Nullable String consumerGroupName) {
            this.consumerGroupName = Input.ofNullable(consumerGroupName);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setIotHubNamespace(@Nullable Input<String> iotHubNamespace) {
            this.iotHubNamespace = iotHubNamespace;
            return this;
        }

        public Builder setIotHubNamespace(@Nullable String iotHubNamespace) {
            this.iotHubNamespace = Input.ofNullable(iotHubNamespace);
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable Input<String> sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = Input.ofNullable(sharedAccessPolicyKey);
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable Input<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Input.ofNullable(sharedAccessPolicyName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public IoTHubStreamInputDataSourceArgs build() {
            return new IoTHubStreamInputDataSourceArgs(consumerGroupName, endpoint, iotHubNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
