// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity MongoDB sink.
 * 
 */
public final class MongoDbV2SinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbV2SinkArgs Empty = new MongoDbV2SinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
    private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
    private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'MongoDbV2Sink'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
    private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
    private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    /**
     * Specifies whether the document with same key to be overwritten (upsert) rather than throw exception (insert). The default value is "insert". Type: string (or Expression with resultType string). Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="writeBehavior")
    private final @Nullable Input<Object> writeBehavior;

    public Input<Object> getWriteBehavior() {
        return this.writeBehavior == null ? Input.empty() : this.writeBehavior;
    }

    public MongoDbV2SinkArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        Input<String> type,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout,
        @Nullable Input<Object> writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    private MongoDbV2SinkArgs() {
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.type = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
        this.writeBehavior = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbV2SinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private Input<String> type;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;
        private @Nullable Input<Object> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbV2SinkArgs defaults) {
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

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
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

        public Builder setWriteBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }

        public Builder setWriteBehavior(@Nullable Input<Object> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public Builder setWriteBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = Input.ofNullable(writeBehavior);
            return this;
        }

        public MongoDbV2SinkArgs build() {
            return new MongoDbV2SinkArgs(disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
