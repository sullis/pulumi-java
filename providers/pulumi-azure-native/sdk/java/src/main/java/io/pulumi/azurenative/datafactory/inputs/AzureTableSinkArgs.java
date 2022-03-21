// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Table sink.
 * 
 */
public final class AzureTableSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureTableSinkArgs Empty = new AzureTableSinkArgs();

    /**
     * Azure Table default partition key value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureTableDefaultPartitionKeyValue")
      private final @Nullable Output<Object> azureTableDefaultPartitionKeyValue;

    public Output<Object> getAzureTableDefaultPartitionKeyValue() {
        return this.azureTableDefaultPartitionKeyValue == null ? Output.empty() : this.azureTableDefaultPartitionKeyValue;
    }

    /**
     * Azure Table insert type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureTableInsertType")
      private final @Nullable Output<Object> azureTableInsertType;

    public Output<Object> getAzureTableInsertType() {
        return this.azureTableInsertType == null ? Output.empty() : this.azureTableInsertType;
    }

    /**
     * Azure Table partition key name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureTablePartitionKeyName")
      private final @Nullable Output<Object> azureTablePartitionKeyName;

    public Output<Object> getAzureTablePartitionKeyName() {
        return this.azureTablePartitionKeyName == null ? Output.empty() : this.azureTablePartitionKeyName;
    }

    /**
     * Azure Table row key name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureTableRowKeyName")
      private final @Nullable Output<Object> azureTableRowKeyName;

    public Output<Object> getAzureTableRowKeyName() {
        return this.azureTableRowKeyName == null ? Output.empty() : this.azureTableRowKeyName;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Output.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Output.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'AzureTableSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Output.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Output.empty() : this.writeBatchTimeout;
    }

    public AzureTableSinkArgs(
        @Nullable Output<Object> azureTableDefaultPartitionKeyValue,
        @Nullable Output<Object> azureTableInsertType,
        @Nullable Output<Object> azureTablePartitionKeyName,
        @Nullable Output<Object> azureTableRowKeyName,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        this.azureTableInsertType = azureTableInsertType;
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        this.azureTableRowKeyName = azureTableRowKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AzureTableSinkArgs() {
        this.azureTableDefaultPartitionKeyValue = Output.empty();
        this.azureTableInsertType = Output.empty();
        this.azureTablePartitionKeyName = Output.empty();
        this.azureTableRowKeyName = Output.empty();
        this.disableMetricsCollection = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.sinkRetryCount = Output.empty();
        this.sinkRetryWait = Output.empty();
        this.type = Output.empty();
        this.writeBatchSize = Output.empty();
        this.writeBatchTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> azureTableDefaultPartitionKeyValue;
        private @Nullable Output<Object> azureTableInsertType;
        private @Nullable Output<Object> azureTablePartitionKeyName;
        private @Nullable Output<Object> azureTableRowKeyName;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureTableDefaultPartitionKeyValue = defaults.azureTableDefaultPartitionKeyValue;
    	      this.azureTableInsertType = defaults.azureTableInsertType;
    	      this.azureTablePartitionKeyName = defaults.azureTablePartitionKeyName;
    	      this.azureTableRowKeyName = defaults.azureTableRowKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder azureTableDefaultPartitionKeyValue(@Nullable Output<Object> azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
            return this;
        }
        public Builder azureTableDefaultPartitionKeyValue(@Nullable Object azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = Output.ofNullable(azureTableDefaultPartitionKeyValue);
            return this;
        }
        public Builder azureTableInsertType(@Nullable Output<Object> azureTableInsertType) {
            this.azureTableInsertType = azureTableInsertType;
            return this;
        }
        public Builder azureTableInsertType(@Nullable Object azureTableInsertType) {
            this.azureTableInsertType = Output.ofNullable(azureTableInsertType);
            return this;
        }
        public Builder azureTablePartitionKeyName(@Nullable Output<Object> azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = azureTablePartitionKeyName;
            return this;
        }
        public Builder azureTablePartitionKeyName(@Nullable Object azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = Output.ofNullable(azureTablePartitionKeyName);
            return this;
        }
        public Builder azureTableRowKeyName(@Nullable Output<Object> azureTableRowKeyName) {
            this.azureTableRowKeyName = azureTableRowKeyName;
            return this;
        }
        public Builder azureTableRowKeyName(@Nullable Object azureTableRowKeyName) {
            this.azureTableRowKeyName = Output.ofNullable(azureTableRowKeyName);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Output.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Output.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Output.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Output.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Output.ofNullable(writeBatchTimeout);
            return this;
        }        public AzureTableSinkArgs build() {
            return new AzureTableSinkArgs(azureTableDefaultPartitionKeyValue, azureTableInsertType, azureTablePartitionKeyName, azureTableRowKeyName, disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
