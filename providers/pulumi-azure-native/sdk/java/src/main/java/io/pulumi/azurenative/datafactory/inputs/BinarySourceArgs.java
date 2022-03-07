// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.BinaryReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Binary source.
 * 
 */
public final class BinarySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BinarySourceArgs Empty = new BinarySourceArgs();

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
     * Binary format settings.
     * 
     */
    @InputImport(name="formatSettings")
      private final @Nullable Input<BinaryReadSettingsArgs> formatSettings;

    public Input<BinaryReadSettingsArgs> getFormatSettings() {
        return this.formatSettings == null ? Input.empty() : this.formatSettings;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
      private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
      private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Binary store settings.
     * 
     */
    @InputImport(name="storeSettings")
      private final @Nullable Input<Object> storeSettings;

    public Input<Object> getStoreSettings() {
        return this.storeSettings == null ? Input.empty() : this.storeSettings;
    }

    /**
     * Copy source type.
     * Expected value is 'BinarySource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public BinarySourceArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<BinaryReadSettingsArgs> formatSettings,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        @Nullable Input<Object> storeSettings,
        Input<String> type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BinarySourceArgs() {
        this.disableMetricsCollection = Input.empty();
        this.formatSettings = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.storeSettings = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinarySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<BinaryReadSettingsArgs> formatSettings;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private @Nullable Input<Object> storeSettings;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BinarySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setFormatSettings(@Nullable Input<BinaryReadSettingsArgs> formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder setFormatSettings(@Nullable BinaryReadSettingsArgs formatSettings) {
            this.formatSettings = Input.ofNullable(formatSettings);
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

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setStoreSettings(@Nullable Input<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = Input.ofNullable(storeSettings);
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
        public BinarySourceArgs build() {
            return new BinarySourceArgs(disableMetricsCollection, formatSettings, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}