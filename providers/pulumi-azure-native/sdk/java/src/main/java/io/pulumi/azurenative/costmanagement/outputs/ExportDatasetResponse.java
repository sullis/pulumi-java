// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ExportDatasetConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExportDatasetResponse {
    /**
     * The export dataset configuration.
     * 
     */
    private final @Nullable ExportDatasetConfigurationResponse configuration;
    /**
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     * 
     */
    private final @Nullable String granularity;

    @OutputCustomType.Constructor({"configuration","granularity"})
    private ExportDatasetResponse(
        @Nullable ExportDatasetConfigurationResponse configuration,
        @Nullable String granularity) {
        this.configuration = configuration;
        this.granularity = granularity;
    }

    /**
     * The export dataset configuration.
     * 
    */
    public Optional<ExportDatasetConfigurationResponse> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     * 
    */
    public Optional<String> getGranularity() {
        return Optional.ofNullable(this.granularity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExportDatasetConfigurationResponse configuration;
        private @Nullable String granularity;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.granularity = defaults.granularity;
        }

        public Builder setConfiguration(@Nullable ExportDatasetConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setGranularity(@Nullable String granularity) {
            this.granularity = granularity;
            return this;
        }
        public ExportDatasetResponse build() {
            return new ExportDatasetResponse(configuration, granularity);
        }
    }
}