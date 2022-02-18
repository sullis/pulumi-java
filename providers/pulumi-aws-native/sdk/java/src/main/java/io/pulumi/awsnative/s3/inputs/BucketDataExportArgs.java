// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
 * 
 */
public final class BucketDataExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketDataExportArgs Empty = new BucketDataExportArgs();

    @InputImport(name="destination", required=true)
    private final Input<BucketDestinationArgs> destination;

    public Input<BucketDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * The version of the output schema to use when exporting data.
     * 
     */
    @InputImport(name="outputSchemaVersion", required=true)
    private final Input<String> outputSchemaVersion;

    public Input<String> getOutputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    public BucketDataExportArgs(
        Input<BucketDestinationArgs> destination,
        Input<String> outputSchemaVersion) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion, "expected parameter 'outputSchemaVersion' to be non-null");
    }

    private BucketDataExportArgs() {
        this.destination = Input.empty();
        this.outputSchemaVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketDestinationArgs> destination;
        private Input<String> outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDataExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder setDestination(Input<BucketDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(BucketDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setOutputSchemaVersion(Input<String> outputSchemaVersion) {
            this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion);
            return this;
        }

        public Builder setOutputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = Input.of(Objects.requireNonNull(outputSchemaVersion));
            return this;
        }

        public BucketDataExportArgs build() {
            return new BucketDataExportArgs(destination, outputSchemaVersion);
        }
    }
}
