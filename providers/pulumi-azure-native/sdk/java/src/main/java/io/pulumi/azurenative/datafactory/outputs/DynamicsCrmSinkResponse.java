// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DynamicsCrmSinkResponse {
    /**
     * The logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object alternateKeyName;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The flag indicating whether to ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object ignoreNullValues;
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
     * Expected value is 'DynamicsCrmSink'.
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
     * The write behavior for the operation.
     * 
     */
    private final String writeBehavior;

    @OutputCustomType.Constructor({"alternateKeyName","disableMetricsCollection","ignoreNullValues","maxConcurrentConnections","sinkRetryCount","sinkRetryWait","type","writeBatchSize","writeBatchTimeout","writeBehavior"})
    private DynamicsCrmSinkResponse(
        @Nullable Object alternateKeyName,
        @Nullable Object disableMetricsCollection,
        @Nullable Object ignoreNullValues,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        String writeBehavior) {
        this.alternateKeyName = alternateKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.ignoreNullValues = ignoreNullValues;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type);
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = Objects.requireNonNull(writeBehavior);
    }

    /**
     * The logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAlternateKeyName() {
        return Optional.ofNullable(this.alternateKeyName);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The flag indicating whether to ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getIgnoreNullValues() {
        return Optional.ofNullable(this.ignoreNullValues);
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
     * Expected value is 'DynamicsCrmSink'.
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
     * The write behavior for the operation.
     * 
    */
    public String getWriteBehavior() {
        return this.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicsCrmSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object alternateKeyName;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object ignoreNullValues;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private String writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicsCrmSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateKeyName = defaults.alternateKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.ignoreNullValues = defaults.ignoreNullValues;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder setAlternateKeyName(@Nullable Object alternateKeyName) {
            this.alternateKeyName = alternateKeyName;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setIgnoreNullValues(@Nullable Object ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBehavior(String writeBehavior) {
            this.writeBehavior = Objects.requireNonNull(writeBehavior);
            return this;
        }
        public DynamicsCrmSinkResponse build() {
            return new DynamicsCrmSinkResponse(alternateKeyName, disableMetricsCollection, ignoreNullValues, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}