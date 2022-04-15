// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs Empty = new AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs();

    /**
     * Analytics data export currently only supports an S3 bucket destination (documented below).
     * 
     */
    @Import(name="s3BucketDestination", required=true)
      private final Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs> s3BucketDestination;

    public Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs> s3BucketDestination() {
        return this.s3BucketDestination;
    }

    public AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs(Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs> s3BucketDestination) {
        this.s3BucketDestination = Objects.requireNonNull(s3BucketDestination, "expected parameter 's3BucketDestination' to be non-null");
    }

    private AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs() {
        this.s3BucketDestination = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs> s3BucketDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketDestination = defaults.s3BucketDestination;
        }

        public Builder s3BucketDestination(Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs> s3BucketDestination) {
            this.s3BucketDestination = Objects.requireNonNull(s3BucketDestination);
            return this;
        }
        public Builder s3BucketDestination(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationGetArgs s3BucketDestination) {
            this.s3BucketDestination = Output.of(Objects.requireNonNull(s3BucketDestination));
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs(s3BucketDestination);
        }
    }
}
