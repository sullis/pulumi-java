// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BucketAccelerateConfiguration {
    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
     */
    private final BucketAccelerateConfigurationAccelerationStatus accelerationStatus;

    @CustomType.Constructor
    private BucketAccelerateConfiguration(@CustomType.Parameter("accelerationStatus") BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
    }

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
    */
    public BucketAccelerateConfigurationAccelerationStatus accelerationStatus() {
        return this.accelerationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccelerateConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccelerateConfigurationAccelerationStatus accelerationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccelerateConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerationStatus = defaults.accelerationStatus;
        }

        public Builder accelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            this.accelerationStatus = Objects.requireNonNull(accelerationStatus);
            return this;
        }        public BucketAccelerateConfiguration build() {
            return new BucketAccelerateConfiguration(accelerationStatus);
        }
    }
}
