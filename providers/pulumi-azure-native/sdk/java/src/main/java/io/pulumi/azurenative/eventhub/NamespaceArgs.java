// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

    /**
     * Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    @InputImport(name="isAutoInflateEnabled")
    private final @Nullable Input<Boolean> isAutoInflateEnabled;

    public Input<Boolean> getIsAutoInflateEnabled() {
        return this.isAutoInflateEnabled == null ? Input.empty() : this.isAutoInflateEnabled;
    }

    /**
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    @InputImport(name="kafkaEnabled")
    private final @Nullable Input<Boolean> kafkaEnabled;

    public Input<Boolean> getKafkaEnabled() {
        return this.kafkaEnabled == null ? Input.empty() : this.kafkaEnabled;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
     * 
     */
    @InputImport(name="maximumThroughputUnits")
    private final @Nullable Input<Integer> maximumThroughputUnits;

    public Input<Integer> getMaximumThroughputUnits() {
        return this.maximumThroughputUnits == null ? Input.empty() : this.maximumThroughputUnits;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName")
    private final @Nullable Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName == null ? Input.empty() : this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Properties of sku resource
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NamespaceArgs(
        @Nullable Input<Boolean> isAutoInflateEnabled,
        @Nullable Input<Boolean> kafkaEnabled,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maximumThroughputUnits,
        @Nullable Input<String> namespaceName,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        this.kafkaEnabled = kafkaEnabled;
        this.location = location;
        this.maximumThroughputUnits = maximumThroughputUnits;
        this.namespaceName = namespaceName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private NamespaceArgs() {
        this.isAutoInflateEnabled = Input.empty();
        this.kafkaEnabled = Input.empty();
        this.location = Input.empty();
        this.maximumThroughputUnits = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isAutoInflateEnabled;
        private @Nullable Input<Boolean> kafkaEnabled;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maximumThroughputUnits;
        private @Nullable Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isAutoInflateEnabled = defaults.isAutoInflateEnabled;
    	      this.kafkaEnabled = defaults.kafkaEnabled;
    	      this.location = defaults.location;
    	      this.maximumThroughputUnits = defaults.maximumThroughputUnits;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setIsAutoInflateEnabled(@Nullable Input<Boolean> isAutoInflateEnabled) {
            this.isAutoInflateEnabled = isAutoInflateEnabled;
            return this;
        }

        public Builder setIsAutoInflateEnabled(@Nullable Boolean isAutoInflateEnabled) {
            this.isAutoInflateEnabled = Input.ofNullable(isAutoInflateEnabled);
            return this;
        }

        public Builder setKafkaEnabled(@Nullable Input<Boolean> kafkaEnabled) {
            this.kafkaEnabled = kafkaEnabled;
            return this;
        }

        public Builder setKafkaEnabled(@Nullable Boolean kafkaEnabled) {
            this.kafkaEnabled = Input.ofNullable(kafkaEnabled);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaximumThroughputUnits(@Nullable Input<Integer> maximumThroughputUnits) {
            this.maximumThroughputUnits = maximumThroughputUnits;
            return this;
        }

        public Builder setMaximumThroughputUnits(@Nullable Integer maximumThroughputUnits) {
            this.maximumThroughputUnits = Input.ofNullable(maximumThroughputUnits);
            return this;
        }

        public Builder setNamespaceName(@Nullable Input<String> namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        public Builder setNamespaceName(@Nullable String namespaceName) {
            this.namespaceName = Input.ofNullable(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public NamespaceArgs build() {
            return new NamespaceArgs(isAutoInflateEnabled, kafkaEnabled, location, maximumThroughputUnits, namespaceName, resourceGroupName, sku, tags);
        }
    }
}
