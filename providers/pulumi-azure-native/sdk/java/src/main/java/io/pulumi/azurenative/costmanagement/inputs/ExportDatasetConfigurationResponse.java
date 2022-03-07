// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The export dataset configuration. Allows columns to be selected for the export. If not provided then the export will include all available columns.
 * 
 */
public final class ExportDatasetConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportDatasetConfigurationResponse Empty = new ExportDatasetConfigurationResponse();

    /**
     * Array of column names to be included in the export. If not provided then the export will include all available columns. The available columns can vary by customer channel (see examples).
     * 
     */
    @InputImport(name="columns")
      private final @Nullable List<String> columns;

    public List<String> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }

    public ExportDatasetConfigurationResponse(@Nullable List<String> columns) {
        this.columns = columns;
    }

    private ExportDatasetConfigurationResponse() {
        this.columns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDatasetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDatasetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(@Nullable List<String> columns) {
            this.columns = columns;
            return this;
        }
        public ExportDatasetConfigurationResponse build() {
            return new ExportDatasetConfigurationResponse(columns);
        }
    }
}