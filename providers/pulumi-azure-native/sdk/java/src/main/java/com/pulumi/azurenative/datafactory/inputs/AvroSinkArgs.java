// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FileServerWriteSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.SftpWriteSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Avro sink.
 * 
 */
public final class AvroSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvroSinkArgs Empty = new AvroSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * Avro format settings.
     * 
     */
    @Import(name="formatSettings")
      private final @Nullable Output<AvroWriteSettingsArgs> formatSettings;

    public Output<AvroWriteSettingsArgs> formatSettings() {
        return this.formatSettings == null ? Codegen.empty() : this.formatSettings;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Codegen.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Codegen.empty() : this.sinkRetryWait;
    }

    /**
     * Avro store settings.
     * 
     */
    @Import(name="storeSettings")
      private final @Nullable Output<Object> storeSettings;

    public Output<Object> storeSettings() {
        return this.storeSettings == null ? Codegen.empty() : this.storeSettings;
    }

    /**
     * Copy sink type.
     * Expected value is 'AvroSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Codegen.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Codegen.empty() : this.writeBatchTimeout;
    }

    public AvroSinkArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<AvroWriteSettingsArgs> formatSettings,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        @Nullable Output<Object> storeSettings,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.storeSettings = storeSettings;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AvroSinkArgs() {
        this.disableMetricsCollection = Codegen.empty();
        this.formatSettings = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.sinkRetryCount = Codegen.empty();
        this.sinkRetryWait = Codegen.empty();
        this.storeSettings = Codegen.empty();
        this.type = Codegen.empty();
        this.writeBatchSize = Codegen.empty();
        this.writeBatchTimeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<AvroWriteSettingsArgs> formatSettings;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private @Nullable Output<Object> storeSettings;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder formatSettings(@Nullable Output<AvroWriteSettingsArgs> formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }
        public Builder formatSettings(@Nullable AvroWriteSettingsArgs formatSettings) {
            this.formatSettings = Codegen.ofNullable(formatSettings);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Codegen.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Codegen.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder storeSettings(@Nullable Output<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }
        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = Codegen.ofNullable(storeSettings);
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
            this.writeBatchSize = Codegen.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Codegen.ofNullable(writeBatchTimeout);
            return this;
        }        public AvroSinkArgs build() {
            return new AvroSinkArgs(disableMetricsCollection, formatSettings, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, storeSettings, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
