// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.AnalyticsConfigurationStorageClassAnalysisDataExport;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AnalyticsConfigurationStorageClassAnalysis {
    /**
     * @return Data export configuration (documented below).
     * 
     */
    private final AnalyticsConfigurationStorageClassAnalysisDataExport dataExport;

    @CustomType.Constructor
    private AnalyticsConfigurationStorageClassAnalysis(@CustomType.Parameter("dataExport") AnalyticsConfigurationStorageClassAnalysisDataExport dataExport) {
        this.dataExport = dataExport;
    }

    /**
     * @return Data export configuration (documented below).
     * 
     */
    public AnalyticsConfigurationStorageClassAnalysisDataExport dataExport() {
        return this.dataExport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsConfigurationStorageClassAnalysisDataExport dataExport;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataExport = defaults.dataExport;
        }

        public Builder dataExport(AnalyticsConfigurationStorageClassAnalysisDataExport dataExport) {
            this.dataExport = Objects.requireNonNull(dataExport);
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysis build() {
            return new AnalyticsConfigurationStorageClassAnalysis(dataExport);
        }
    }
}
