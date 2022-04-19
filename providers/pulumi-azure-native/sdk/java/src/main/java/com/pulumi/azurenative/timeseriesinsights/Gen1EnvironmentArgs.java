// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.timeseriesinsights.enums.StorageLimitExceededBehavior;
import com.pulumi.azurenative.timeseriesinsights.inputs.SkuArgs;
import com.pulumi.azurenative.timeseriesinsights.inputs.TimeSeriesIdPropertyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Gen1EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final Gen1EnvironmentArgs Empty = new Gen1EnvironmentArgs();

    /**
     * ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
     */
    @Import(name="dataRetentionTime", required=true)
      private final Output<String> dataRetentionTime;

    public Output<String> dataRetentionTime() {
        return this.dataRetentionTime;
    }

    /**
     * Name of the environment
     * 
     */
    @Import(name="environmentName")
      private final @Nullable Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName == null ? Codegen.empty() : this.environmentName;
    }

    /**
     * The kind of the environment.
     * Expected value is 'Gen1'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
     */
    @Import(name="partitionKeyProperties")
      private final @Nullable Output<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties;

    public Output<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties() {
        return this.partitionKeyProperties == null ? Codegen.empty() : this.partitionKeyProperties;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
     */
    @Import(name="storageLimitExceededBehavior")
      private final @Nullable Output<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior;

    public Output<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior == null ? Codegen.empty() : this.storageLimitExceededBehavior;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public Gen1EnvironmentArgs(
        Output<String> dataRetentionTime,
        @Nullable Output<String> environmentName,
        Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        @Nullable Output<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior,
        @Nullable Output<Map<String,String>> tags) {
        this.dataRetentionTime = Objects.requireNonNull(dataRetentionTime, "expected parameter 'dataRetentionTime' to be non-null");
        this.environmentName = environmentName;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.location = location;
        this.partitionKeyProperties = partitionKeyProperties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        this.tags = tags;
    }

    private Gen1EnvironmentArgs() {
        this.dataRetentionTime = Codegen.empty();
        this.environmentName = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.partitionKeyProperties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.storageLimitExceededBehavior = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen1EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataRetentionTime;
        private @Nullable Output<String> environmentName;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private @Nullable Output<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(Gen1EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetentionTime = defaults.dataRetentionTime;
    	      this.environmentName = defaults.environmentName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.partitionKeyProperties = defaults.partitionKeyProperties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageLimitExceededBehavior = defaults.storageLimitExceededBehavior;
    	      this.tags = defaults.tags;
        }

        public Builder dataRetentionTime(Output<String> dataRetentionTime) {
            this.dataRetentionTime = Objects.requireNonNull(dataRetentionTime);
            return this;
        }
        public Builder dataRetentionTime(String dataRetentionTime) {
            this.dataRetentionTime = Output.of(Objects.requireNonNull(dataRetentionTime));
            return this;
        }
        public Builder environmentName(@Nullable Output<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = Codegen.ofNullable(environmentName);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder partitionKeyProperties(@Nullable Output<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties) {
            this.partitionKeyProperties = partitionKeyProperties;
            return this;
        }
        public Builder partitionKeyProperties(@Nullable List<TimeSeriesIdPropertyArgs> partitionKeyProperties) {
            this.partitionKeyProperties = Codegen.ofNullable(partitionKeyProperties);
            return this;
        }
        public Builder partitionKeyProperties(TimeSeriesIdPropertyArgs... partitionKeyProperties) {
            return partitionKeyProperties(List.of(partitionKeyProperties));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder storageLimitExceededBehavior(@Nullable Output<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior) {
            this.storageLimitExceededBehavior = storageLimitExceededBehavior;
            return this;
        }
        public Builder storageLimitExceededBehavior(@Nullable Either<String,StorageLimitExceededBehavior> storageLimitExceededBehavior) {
            this.storageLimitExceededBehavior = Codegen.ofNullable(storageLimitExceededBehavior);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public Gen1EnvironmentArgs build() {
            return new Gen1EnvironmentArgs(dataRetentionTime, environmentName, kind, location, partitionKeyProperties, resourceGroupName, sku, storageLimitExceededBehavior, tags);
        }
    }
}
