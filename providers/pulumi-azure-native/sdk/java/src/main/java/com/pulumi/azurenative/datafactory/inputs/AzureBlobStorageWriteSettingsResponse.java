// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure blob write settings.
 * 
 */
public final class AzureBlobStorageWriteSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobStorageWriteSettingsResponse Empty = new AzureBlobStorageWriteSettingsResponse();

    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="blockSizeInMB")
      private final @Nullable Object blockSizeInMB;

    public Optional<Object> blockSizeInMB() {
        return this.blockSizeInMB == null ? Optional.empty() : Optional.ofNullable(this.blockSizeInMB);
    }

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
      private final @Nullable Object copyBehavior;

    public Optional<Object> copyBehavior() {
        return this.copyBehavior == null ? Optional.empty() : Optional.ofNullable(this.copyBehavior);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The write setting type.
     * Expected value is 'AzureBlobStorageWriteSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureBlobStorageWriteSettingsResponse(
        @Nullable Object blockSizeInMB,
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        String type) {
        this.blockSizeInMB = blockSizeInMB;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AzureBlobStorageWriteSettingsResponse() {
        this.blockSizeInMB = null;
        this.copyBehavior = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object blockSizeInMB;
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeInMB = defaults.blockSizeInMB;
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder blockSizeInMB(@Nullable Object blockSizeInMB) {
            this.blockSizeInMB = blockSizeInMB;
            return this;
        }
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBlobStorageWriteSettingsResponse build() {
            return new AzureBlobStorageWriteSettingsResponse(blockSizeInMB, copyBehavior, disableMetricsCollection, maxConcurrentConnections, type);
        }
    }
}
