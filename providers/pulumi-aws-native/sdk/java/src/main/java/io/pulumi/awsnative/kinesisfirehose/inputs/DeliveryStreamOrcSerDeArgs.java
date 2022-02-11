// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamOrcSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamOrcSerDeArgs Empty = new DeliveryStreamOrcSerDeArgs();

    @InputImport(name="blockSizeBytes")
    private final @Nullable Input<Integer> blockSizeBytes;

    public Input<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Input.empty() : this.blockSizeBytes;
    }

    @InputImport(name="bloomFilterColumns")
    private final @Nullable Input<List<String>> bloomFilterColumns;

    public Input<List<String>> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? Input.empty() : this.bloomFilterColumns;
    }

    @InputImport(name="bloomFilterFalsePositiveProbability")
    private final @Nullable Input<Double> bloomFilterFalsePositiveProbability;

    public Input<Double> getBloomFilterFalsePositiveProbability() {
        return this.bloomFilterFalsePositiveProbability == null ? Input.empty() : this.bloomFilterFalsePositiveProbability;
    }

    @InputImport(name="compression")
    private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    @InputImport(name="dictionaryKeyThreshold")
    private final @Nullable Input<Double> dictionaryKeyThreshold;

    public Input<Double> getDictionaryKeyThreshold() {
        return this.dictionaryKeyThreshold == null ? Input.empty() : this.dictionaryKeyThreshold;
    }

    @InputImport(name="enablePadding")
    private final @Nullable Input<Boolean> enablePadding;

    public Input<Boolean> getEnablePadding() {
        return this.enablePadding == null ? Input.empty() : this.enablePadding;
    }

    @InputImport(name="formatVersion")
    private final @Nullable Input<String> formatVersion;

    public Input<String> getFormatVersion() {
        return this.formatVersion == null ? Input.empty() : this.formatVersion;
    }

    @InputImport(name="paddingTolerance")
    private final @Nullable Input<Double> paddingTolerance;

    public Input<Double> getPaddingTolerance() {
        return this.paddingTolerance == null ? Input.empty() : this.paddingTolerance;
    }

    @InputImport(name="rowIndexStride")
    private final @Nullable Input<Integer> rowIndexStride;

    public Input<Integer> getRowIndexStride() {
        return this.rowIndexStride == null ? Input.empty() : this.rowIndexStride;
    }

    @InputImport(name="stripeSizeBytes")
    private final @Nullable Input<Integer> stripeSizeBytes;

    public Input<Integer> getStripeSizeBytes() {
        return this.stripeSizeBytes == null ? Input.empty() : this.stripeSizeBytes;
    }

    public DeliveryStreamOrcSerDeArgs(
        @Nullable Input<Integer> blockSizeBytes,
        @Nullable Input<List<String>> bloomFilterColumns,
        @Nullable Input<Double> bloomFilterFalsePositiveProbability,
        @Nullable Input<String> compression,
        @Nullable Input<Double> dictionaryKeyThreshold,
        @Nullable Input<Boolean> enablePadding,
        @Nullable Input<String> formatVersion,
        @Nullable Input<Double> paddingTolerance,
        @Nullable Input<Integer> rowIndexStride,
        @Nullable Input<Integer> stripeSizeBytes) {
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

    private DeliveryStreamOrcSerDeArgs() {
        this.blockSizeBytes = Input.empty();
        this.bloomFilterColumns = Input.empty();
        this.bloomFilterFalsePositiveProbability = Input.empty();
        this.compression = Input.empty();
        this.dictionaryKeyThreshold = Input.empty();
        this.enablePadding = Input.empty();
        this.formatVersion = Input.empty();
        this.paddingTolerance = Input.empty();
        this.rowIndexStride = Input.empty();
        this.stripeSizeBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOrcSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> blockSizeBytes;
        private @Nullable Input<List<String>> bloomFilterColumns;
        private @Nullable Input<Double> bloomFilterFalsePositiveProbability;
        private @Nullable Input<String> compression;
        private @Nullable Input<Double> dictionaryKeyThreshold;
        private @Nullable Input<Boolean> enablePadding;
        private @Nullable Input<String> formatVersion;
        private @Nullable Input<Double> paddingTolerance;
        private @Nullable Input<Integer> rowIndexStride;
        private @Nullable Input<Integer> stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOrcSerDeArgs defaults) {
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

        public Builder setBlockSizeBytes(@Nullable Input<Integer> blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = Input.ofNullable(blockSizeBytes);
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable Input<List<String>> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = Input.ofNullable(bloomFilterColumns);
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Input<Double> bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = Input.ofNullable(bloomFilterFalsePositiveProbability);
            return this;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Input<Double> dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = Input.ofNullable(dictionaryKeyThreshold);
            return this;
        }

        public Builder setEnablePadding(@Nullable Input<Boolean> enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        public Builder setEnablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = Input.ofNullable(enablePadding);
            return this;
        }

        public Builder setFormatVersion(@Nullable Input<String> formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setFormatVersion(@Nullable String formatVersion) {
            this.formatVersion = Input.ofNullable(formatVersion);
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Input<Double> paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = Input.ofNullable(paddingTolerance);
            return this;
        }

        public Builder setRowIndexStride(@Nullable Input<Integer> rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        public Builder setRowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = Input.ofNullable(rowIndexStride);
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Input<Integer> stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = Input.ofNullable(stripeSizeBytes);
            return this;
        }

        public DeliveryStreamOrcSerDeArgs build() {
            return new DeliveryStreamOrcSerDeArgs(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
