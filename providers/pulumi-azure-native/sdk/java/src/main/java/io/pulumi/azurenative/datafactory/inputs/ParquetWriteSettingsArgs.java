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
 * Parquet write settings.
 * 
 */
public final class ParquetWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParquetWriteSettingsArgs Empty = new ParquetWriteSettingsArgs();

    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileNamePrefix")
    private final @Nullable Input<Object> fileNamePrefix;

    public Input<Object> getFileNamePrefix() {
        return this.fileNamePrefix == null ? Input.empty() : this.fileNamePrefix;
    }

    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxRowsPerFile")
    private final @Nullable Input<Object> maxRowsPerFile;

    public Input<Object> getMaxRowsPerFile() {
        return this.maxRowsPerFile == null ? Input.empty() : this.maxRowsPerFile;
    }

    /**
     * The write setting type.
     * Expected value is 'ParquetWriteSettings'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ParquetWriteSettingsArgs(
        @Nullable Input<Object> fileNamePrefix,
        @Nullable Input<Object> maxRowsPerFile,
        Input<String> type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParquetWriteSettingsArgs() {
        this.fileNamePrefix = Input.empty();
        this.maxRowsPerFile = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fileNamePrefix;
        private @Nullable Input<Object> maxRowsPerFile;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder setFileNamePrefix(@Nullable Input<Object> fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder setFileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = Input.ofNullable(fileNamePrefix);
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Input<Object> maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = Input.ofNullable(maxRowsPerFile);
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

        public ParquetWriteSettingsArgs build() {
            return new ParquetWriteSettingsArgs(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
