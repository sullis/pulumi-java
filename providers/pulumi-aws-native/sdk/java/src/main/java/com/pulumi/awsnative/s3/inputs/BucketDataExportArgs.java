// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
 * 
 */
public final class BucketDataExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketDataExportArgs Empty = new BucketDataExportArgs();

    @Import(name="destination", required=true)
    private Output<BucketDestinationArgs> destination;

    public Output<BucketDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * The version of the output schema to use when exporting data.
     * 
     */
    @Import(name="outputSchemaVersion", required=true)
    private Output<String> outputSchemaVersion;

    /**
     * @return The version of the output schema to use when exporting data.
     * 
     */
    public Output<String> outputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    private BucketDataExportArgs() {}

    private BucketDataExportArgs(BucketDataExportArgs $) {
        this.destination = $.destination;
        this.outputSchemaVersion = $.outputSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDataExportArgs $;

        public Builder() {
            $ = new BucketDataExportArgs();
        }

        public Builder(BucketDataExportArgs defaults) {
            $ = new BucketDataExportArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<BucketDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(BucketDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param outputSchemaVersion The version of the output schema to use when exporting data.
         * 
         * @return builder
         * 
         */
        public Builder outputSchemaVersion(Output<String> outputSchemaVersion) {
            $.outputSchemaVersion = outputSchemaVersion;
            return this;
        }

        /**
         * @param outputSchemaVersion The version of the output schema to use when exporting data.
         * 
         * @return builder
         * 
         */
        public Builder outputSchemaVersion(String outputSchemaVersion) {
            return outputSchemaVersion(Output.of(outputSchemaVersion));
        }

        public BucketDataExportArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.outputSchemaVersion = Objects.requireNonNull($.outputSchemaVersion, "expected parameter 'outputSchemaVersion' to be non-null");
            return $;
        }
    }

}
