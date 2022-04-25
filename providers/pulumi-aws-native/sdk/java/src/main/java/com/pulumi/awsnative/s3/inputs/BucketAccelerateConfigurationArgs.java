// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketAccelerateConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAccelerateConfigurationArgs Empty = new BucketAccelerateConfigurationArgs();

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
     */
    @Import(name="accelerationStatus", required=true)
    private Output<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus;

    /**
     * @return Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
     */
    public Output<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus() {
        return this.accelerationStatus;
    }

    private BucketAccelerateConfigurationArgs() {}

    private BucketAccelerateConfigurationArgs(BucketAccelerateConfigurationArgs $) {
        this.accelerationStatus = $.accelerationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccelerateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccelerateConfigurationArgs $;

        public Builder() {
            $ = new BucketAccelerateConfigurationArgs();
        }

        public Builder(BucketAccelerateConfigurationArgs defaults) {
            $ = new BucketAccelerateConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerationStatus Configures the transfer acceleration state for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder accelerationStatus(Output<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus) {
            $.accelerationStatus = accelerationStatus;
            return this;
        }

        /**
         * @param accelerationStatus Configures the transfer acceleration state for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder accelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            return accelerationStatus(Output.of(accelerationStatus));
        }

        public BucketAccelerateConfigurationArgs build() {
            $.accelerationStatus = Objects.requireNonNull($.accelerationStatus, "expected parameter 'accelerationStatus' to be non-null");
            return $;
        }
    }

}
