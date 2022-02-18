// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Service Bus Queue output data source.
 * 
 */
public final class ServiceBusQueueOutputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusQueueOutputDataSourceResponse Empty = new ServiceBusQueueOutputDataSourceResponse();

    /**
     * A string array of the names of output columns to be attached to Service Bus messages as custom properties.
     * 
     */
    @InputImport(name="propertyColumns")
    private final @Nullable List<String> propertyColumns;

    public List<String> getPropertyColumns() {
        return this.propertyColumns == null ? List.of() : this.propertyColumns;
    }

    /**
     * The name of the Service Bus Queue. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="queueName")
    private final @Nullable String queueName;

    public Optional<String> getQueueName() {
        return this.queueName == null ? Optional.empty() : Optional.ofNullable(this.queueName);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serviceBusNamespace")
    private final @Nullable String serviceBusNamespace;

    public Optional<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Optional.empty() : Optional.ofNullable(this.serviceBusNamespace);
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
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable String sharedAccessPolicyName;

    public Optional<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/Queue'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ServiceBusQueueOutputDataSourceResponse(
        @Nullable List<String> propertyColumns,
        @Nullable String queueName,
        @Nullable String serviceBusNamespace,
        @Nullable String sharedAccessPolicyKey,
        @Nullable String sharedAccessPolicyName,
        String type) {
        this.propertyColumns = propertyColumns;
        this.queueName = queueName;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceBusQueueOutputDataSourceResponse() {
        this.propertyColumns = List.of();
        this.queueName = null;
        this.serviceBusNamespace = null;
        this.sharedAccessPolicyKey = null;
        this.sharedAccessPolicyName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> propertyColumns;
        private @Nullable String queueName;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyColumns = defaults.propertyColumns;
    	      this.queueName = defaults.queueName;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setPropertyColumns(@Nullable List<String> propertyColumns) {
            this.propertyColumns = propertyColumns;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
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

        public ServiceBusQueueOutputDataSourceResponse build() {
            return new ServiceBusQueueOutputDataSourceResponse(propertyColumns, queueName, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
