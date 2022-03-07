// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.JobOutputCompressionFormat;
import io.pulumi.awsnative.databrew.enums.JobOutputFormat;
import io.pulumi.awsnative.databrew.inputs.JobOutputFormatOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.JobS3LocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobOutputArgs Empty = new JobOutputArgs();

    @InputImport(name="compressionFormat")
      private final @Nullable Input<JobOutputCompressionFormat> compressionFormat;

    public Input<JobOutputCompressionFormat> getCompressionFormat() {
        return this.compressionFormat == null ? Input.empty() : this.compressionFormat;
    }

    @InputImport(name="format")
      private final @Nullable Input<JobOutputFormat> format;

    public Input<JobOutputFormat> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    @InputImport(name="formatOptions")
      private final @Nullable Input<JobOutputFormatOptionsArgs> formatOptions;

    public Input<JobOutputFormatOptionsArgs> getFormatOptions() {
        return this.formatOptions == null ? Input.empty() : this.formatOptions;
    }

    @InputImport(name="location", required=true)
      private final Input<JobS3LocationArgs> location;

    public Input<JobS3LocationArgs> getLocation() {
        return this.location;
    }

    @InputImport(name="overwrite")
      private final @Nullable Input<Boolean> overwrite;

    public Input<Boolean> getOverwrite() {
        return this.overwrite == null ? Input.empty() : this.overwrite;
    }

    @InputImport(name="partitionColumns")
      private final @Nullable Input<List<String>> partitionColumns;

    public Input<List<String>> getPartitionColumns() {
        return this.partitionColumns == null ? Input.empty() : this.partitionColumns;
    }

    public JobOutputArgs(
        @Nullable Input<JobOutputCompressionFormat> compressionFormat,
        @Nullable Input<JobOutputFormat> format,
        @Nullable Input<JobOutputFormatOptionsArgs> formatOptions,
        Input<JobS3LocationArgs> location,
        @Nullable Input<Boolean> overwrite,
        @Nullable Input<List<String>> partitionColumns) {
        this.compressionFormat = compressionFormat;
        this.format = format;
        this.formatOptions = formatOptions;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.overwrite = overwrite;
        this.partitionColumns = partitionColumns;
    }

    private JobOutputArgs() {
        this.compressionFormat = Input.empty();
        this.format = Input.empty();
        this.formatOptions = Input.empty();
        this.location = Input.empty();
        this.overwrite = Input.empty();
        this.partitionColumns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobOutputCompressionFormat> compressionFormat;
        private @Nullable Input<JobOutputFormat> format;
        private @Nullable Input<JobOutputFormatOptionsArgs> formatOptions;
        private Input<JobS3LocationArgs> location;
        private @Nullable Input<Boolean> overwrite;
        private @Nullable Input<List<String>> partitionColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.format = defaults.format;
    	      this.formatOptions = defaults.formatOptions;
    	      this.location = defaults.location;
    	      this.overwrite = defaults.overwrite;
    	      this.partitionColumns = defaults.partitionColumns;
        }

        public Builder setCompressionFormat(@Nullable Input<JobOutputCompressionFormat> compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        public Builder setCompressionFormat(@Nullable JobOutputCompressionFormat compressionFormat) {
            this.compressionFormat = Input.ofNullable(compressionFormat);
            return this;
        }

        public Builder setFormat(@Nullable Input<JobOutputFormat> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable JobOutputFormat format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setFormatOptions(@Nullable Input<JobOutputFormatOptionsArgs> formatOptions) {
            this.formatOptions = formatOptions;
            return this;
        }

        public Builder setFormatOptions(@Nullable JobOutputFormatOptionsArgs formatOptions) {
            this.formatOptions = Input.ofNullable(formatOptions);
            return this;
        }

        public Builder setLocation(Input<JobS3LocationArgs> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(JobS3LocationArgs location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setOverwrite(@Nullable Input<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }

        public Builder setOverwrite(@Nullable Boolean overwrite) {
            this.overwrite = Input.ofNullable(overwrite);
            return this;
        }

        public Builder setPartitionColumns(@Nullable Input<List<String>> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }

        public Builder setPartitionColumns(@Nullable List<String> partitionColumns) {
            this.partitionColumns = Input.ofNullable(partitionColumns);
            return this;
        }
        public JobOutputArgs build() {
            return new JobOutputArgs(compressionFormat, format, formatOptions, location, overwrite, partitionColumns);
        }
    }
}