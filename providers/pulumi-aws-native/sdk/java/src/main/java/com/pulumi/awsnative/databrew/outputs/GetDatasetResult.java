// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.enums.DatasetFormat;
import com.pulumi.awsnative.databrew.outputs.DatasetFormatOptions;
import com.pulumi.awsnative.databrew.outputs.DatasetInput;
import com.pulumi.awsnative.databrew.outputs.DatasetPathOptions;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatasetResult {
    /**
     * @return Dataset format
     * 
     */
    private final @Nullable DatasetFormat format;
    /**
     * @return Format options for dataset
     * 
     */
    private final @Nullable DatasetFormatOptions formatOptions;
    /**
     * @return Input
     * 
     */
    private final @Nullable DatasetInput input;
    /**
     * @return PathOptions
     * 
     */
    private final @Nullable DatasetPathOptions pathOptions;

    @CustomType.Constructor
    private GetDatasetResult(
        @CustomType.Parameter("format") @Nullable DatasetFormat format,
        @CustomType.Parameter("formatOptions") @Nullable DatasetFormatOptions formatOptions,
        @CustomType.Parameter("input") @Nullable DatasetInput input,
        @CustomType.Parameter("pathOptions") @Nullable DatasetPathOptions pathOptions) {
        this.format = format;
        this.formatOptions = formatOptions;
        this.input = input;
        this.pathOptions = pathOptions;
    }

    /**
     * @return Dataset format
     * 
     */
    public Optional<DatasetFormat> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return Format options for dataset
     * 
     */
    public Optional<DatasetFormatOptions> formatOptions() {
        return Optional.ofNullable(this.formatOptions);
    }
    /**
     * @return Input
     * 
     */
    public Optional<DatasetInput> input() {
        return Optional.ofNullable(this.input);
    }
    /**
     * @return PathOptions
     * 
     */
    public Optional<DatasetPathOptions> pathOptions() {
        return Optional.ofNullable(this.pathOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetFormat format;
        private @Nullable DatasetFormatOptions formatOptions;
        private @Nullable DatasetInput input;
        private @Nullable DatasetPathOptions pathOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.formatOptions = defaults.formatOptions;
    	      this.input = defaults.input;
    	      this.pathOptions = defaults.pathOptions;
        }

        public Builder format(@Nullable DatasetFormat format) {
            this.format = format;
            return this;
        }
        public Builder formatOptions(@Nullable DatasetFormatOptions formatOptions) {
            this.formatOptions = formatOptions;
            return this;
        }
        public Builder input(@Nullable DatasetInput input) {
            this.input = input;
            return this;
        }
        public Builder pathOptions(@Nullable DatasetPathOptions pathOptions) {
            this.pathOptions = pathOptions;
            return this;
        }        public GetDatasetResult build() {
            return new GetDatasetResult(format, formatOptions, input, pathOptions);
        }
    }
}
