// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureSearchIndexSinkResponse {
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * Copy sink type.
     * Expected value is 'AzureSearchIndexSink'.
     * 
     */
    private final String type;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;
    /**
     * Specify the write behavior when upserting documents into Azure Search Index.
     * 
     */
    private final @Nullable String writeBehavior;

    @CustomType.Constructor
    private AzureSearchIndexSinkResponse(
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @CustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @CustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout,
        @CustomType.Parameter("writeBehavior") @Nullable String writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = type;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * Copy sink type.
     * Expected value is 'AzureSearchIndexSink'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }
    /**
     * Specify the write behavior when upserting documents into Azure Search Index.
     * 
    */
    public Optional<String> getWriteBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSearchIndexSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable String writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSearchIndexSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBehavior(@Nullable String writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }        public AzureSearchIndexSinkResponse build() {
            return new AzureSearchIndexSinkResponse(disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
