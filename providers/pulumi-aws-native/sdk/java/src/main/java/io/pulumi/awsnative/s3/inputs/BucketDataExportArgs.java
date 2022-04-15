// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
 * 
 */
public final class BucketDataExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketDataExportArgs Empty = new BucketDataExportArgs();

    @Import(name="destination", required=true)
      private final Output<BucketDestinationArgs> destination;

    public Output<BucketDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * The version of the output schema to use when exporting data.
     * 
     */
    @Import(name="outputSchemaVersion", required=true)
      private final Output<String> outputSchemaVersion;

    public Output<String> outputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    public BucketDataExportArgs(
        Output<BucketDestinationArgs> destination,
        Output<String> outputSchemaVersion) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion, "expected parameter 'outputSchemaVersion' to be non-null");
    }

    private BucketDataExportArgs() {
        this.destination = Codegen.empty();
        this.outputSchemaVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketDestinationArgs> destination;
        private Output<String> outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDataExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder destination(Output<BucketDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(BucketDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder outputSchemaVersion(Output<String> outputSchemaVersion) {
            this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion);
            return this;
        }
        public Builder outputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = Output.of(Objects.requireNonNull(outputSchemaVersion));
            return this;
        }        public BucketDataExportArgs build() {
            return new BucketDataExportArgs(destination, outputSchemaVersion);
        }
    }
}
