// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsConfigurationStorageClassAnalysisDataExport {
    /**
     * @return Specifies the destination for the exported analytics data (documented below).
     * 
     */
    private final AnalyticsConfigurationStorageClassAnalysisDataExportDestination destination;
    /**
     * @return The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
     * 
     */
    private final @Nullable String outputSchemaVersion;

    @CustomType.Constructor
    private AnalyticsConfigurationStorageClassAnalysisDataExport(
        @CustomType.Parameter("destination") AnalyticsConfigurationStorageClassAnalysisDataExportDestination destination,
        @CustomType.Parameter("outputSchemaVersion") @Nullable String outputSchemaVersion) {
        this.destination = destination;
        this.outputSchemaVersion = outputSchemaVersion;
    }

    /**
     * @return Specifies the destination for the exported analytics data (documented below).
     * 
     */
    public AnalyticsConfigurationStorageClassAnalysisDataExportDestination destination() {
        return this.destination;
    }
    /**
     * @return The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
     * 
     */
    public Optional<String> outputSchemaVersion() {
        return Optional.ofNullable(this.outputSchemaVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsConfigurationStorageClassAnalysisDataExportDestination destination;
        private @Nullable String outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder destination(AnalyticsConfigurationStorageClassAnalysisDataExportDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder outputSchemaVersion(@Nullable String outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisDataExport build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExport(destination, outputSchemaVersion);
        }
    }
}
