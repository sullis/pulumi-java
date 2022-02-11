// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamOrcSerDe extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamOrcSerDe Empty = new DeliveryStreamOrcSerDe();

    @InputImport(name="blockSizeBytes")
    private final @Nullable Integer blockSizeBytes;

    public Optional<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Optional.empty() : Optional.ofNullable(this.blockSizeBytes);
    }

    @InputImport(name="bloomFilterColumns")
    private final @Nullable List<String> bloomFilterColumns;

    public List<String> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? List.of() : this.bloomFilterColumns;
    }

    @InputImport(name="bloomFilterFalsePositiveProbability")
    private final @Nullable Double bloomFilterFalsePositiveProbability;

    public Optional<Double> getBloomFilterFalsePositiveProbability() {
        return this.bloomFilterFalsePositiveProbability == null ? Optional.empty() : Optional.ofNullable(this.bloomFilterFalsePositiveProbability);
    }

    @InputImport(name="compression")
    private final @Nullable String compression;

    public Optional<String> getCompression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    @InputImport(name="dictionaryKeyThreshold")
    private final @Nullable Double dictionaryKeyThreshold;

    public Optional<Double> getDictionaryKeyThreshold() {
        return this.dictionaryKeyThreshold == null ? Optional.empty() : Optional.ofNullable(this.dictionaryKeyThreshold);
    }

    @InputImport(name="enablePadding")
    private final @Nullable Boolean enablePadding;

    public Optional<Boolean> getEnablePadding() {
        return this.enablePadding == null ? Optional.empty() : Optional.ofNullable(this.enablePadding);
    }

    @InputImport(name="formatVersion")
    private final @Nullable String formatVersion;

    public Optional<String> getFormatVersion() {
        return this.formatVersion == null ? Optional.empty() : Optional.ofNullable(this.formatVersion);
    }

    @InputImport(name="paddingTolerance")
    private final @Nullable Double paddingTolerance;

    public Optional<Double> getPaddingTolerance() {
        return this.paddingTolerance == null ? Optional.empty() : Optional.ofNullable(this.paddingTolerance);
    }

    @InputImport(name="rowIndexStride")
    private final @Nullable Integer rowIndexStride;

    public Optional<Integer> getRowIndexStride() {
        return this.rowIndexStride == null ? Optional.empty() : Optional.ofNullable(this.rowIndexStride);
    }

    @InputImport(name="stripeSizeBytes")
    private final @Nullable Integer stripeSizeBytes;

    public Optional<Integer> getStripeSizeBytes() {
        return this.stripeSizeBytes == null ? Optional.empty() : Optional.ofNullable(this.stripeSizeBytes);
    }

    public DeliveryStreamOrcSerDe(
        @Nullable Integer blockSizeBytes,
        @Nullable List<String> bloomFilterColumns,
        @Nullable Double bloomFilterFalsePositiveProbability,
        @Nullable String compression,
        @Nullable Double dictionaryKeyThreshold,
        @Nullable Boolean enablePadding,
        @Nullable String formatVersion,
        @Nullable Double paddingTolerance,
        @Nullable Integer rowIndexStride,
        @Nullable Integer stripeSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        this.bloomFilterColumns = bloomFilterColumns;
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
        this.compression = compression;
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
        this.enablePadding = enablePadding;
        this.formatVersion = formatVersion;
        this.paddingTolerance = paddingTolerance;
        this.rowIndexStride = rowIndexStride;
        this.stripeSizeBytes = stripeSizeBytes;
    }

    private DeliveryStreamOrcSerDe() {
        this.blockSizeBytes = null;
        this.bloomFilterColumns = List.of();
        this.bloomFilterFalsePositiveProbability = null;
        this.compression = null;
        this.dictionaryKeyThreshold = null;
        this.enablePadding = null;
        this.formatVersion = null;
        this.paddingTolerance = null;
        this.rowIndexStride = null;
        this.stripeSizeBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOrcSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockSizeBytes;
        private @Nullable List<String> bloomFilterColumns;
        private @Nullable Double bloomFilterFalsePositiveProbability;
        private @Nullable String compression;
        private @Nullable Double dictionaryKeyThreshold;
        private @Nullable Boolean enablePadding;
        private @Nullable String formatVersion;
        private @Nullable Double paddingTolerance;
        private @Nullable Integer rowIndexStride;
        private @Nullable Integer stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOrcSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.bloomFilterColumns = defaults.bloomFilterColumns;
    	      this.bloomFilterFalsePositiveProbability = defaults.bloomFilterFalsePositiveProbability;
    	      this.compression = defaults.compression;
    	      this.dictionaryKeyThreshold = defaults.dictionaryKeyThreshold;
    	      this.enablePadding = defaults.enablePadding;
    	      this.formatVersion = defaults.formatVersion;
    	      this.paddingTolerance = defaults.paddingTolerance;
    	      this.rowIndexStride = defaults.rowIndexStride;
    	      this.stripeSizeBytes = defaults.stripeSizeBytes;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        public Builder setEnablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        public Builder setFormatVersion(@Nullable String formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        public Builder setRowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }

        public DeliveryStreamOrcSerDe build() {
            return new DeliveryStreamOrcSerDe(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
