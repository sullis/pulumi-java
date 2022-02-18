// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the provisioned Event Hub-compatible endpoint used by the IoT hub.
 * 
 */
public final class EventHubPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventHubPropertiesResponse Empty = new EventHubPropertiesResponse();

    /**
     * The Event Hub-compatible endpoint.
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     */
    @InputImport(name="partitionCount")
    private final @Nullable Integer partitionCount;

    public Optional<Integer> getPartitionCount() {
        return this.partitionCount == null ? Optional.empty() : Optional.ofNullable(this.partitionCount);
    }

    /**
     * The partition ids in the Event Hub-compatible endpoint.
     * 
     */
    @InputImport(name="partitionIds", required=true)
    private final List<String> partitionIds;

    public List<String> getPartitionIds() {
        return this.partitionIds;
    }

    /**
     * The Event Hub-compatible name.
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
     */
    @InputImport(name="retentionTimeInDays")
    private final @Nullable Double retentionTimeInDays;

    public Optional<Double> getRetentionTimeInDays() {
        return this.retentionTimeInDays == null ? Optional.empty() : Optional.ofNullable(this.retentionTimeInDays);
    }

    public EventHubPropertiesResponse(
        String endpoint,
        @Nullable Integer partitionCount,
        List<String> partitionIds,
        String path,
        @Nullable Double retentionTimeInDays) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.partitionCount = partitionCount;
        this.partitionIds = Objects.requireNonNull(partitionIds, "expected parameter 'partitionIds' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.retentionTimeInDays = retentionTimeInDays;
    }

    private EventHubPropertiesResponse() {
        this.endpoint = null;
        this.partitionCount = null;
        this.partitionIds = List.of();
        this.path = null;
        this.retentionTimeInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private @Nullable Integer partitionCount;
        private List<String> partitionIds;
        private String path;
        private @Nullable Double retentionTimeInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.partitionCount = defaults.partitionCount;
    	      this.partitionIds = defaults.partitionIds;
    	      this.path = defaults.path;
    	      this.retentionTimeInDays = defaults.retentionTimeInDays;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setPartitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder setPartitionIds(List<String> partitionIds) {
            this.partitionIds = Objects.requireNonNull(partitionIds);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRetentionTimeInDays(@Nullable Double retentionTimeInDays) {
            this.retentionTimeInDays = retentionTimeInDays;
            return this;
        }

        public EventHubPropertiesResponse build() {
            return new EventHubPropertiesResponse(endpoint, partitionCount, partitionIds, path, retentionTimeInDays);
        }
    }
}
