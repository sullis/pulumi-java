// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class BucketAccelerateConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketAccelerateConfiguration Empty = new BucketAccelerateConfiguration();

    @InputImport(name="accelerationStatus", required=true)
    private final BucketAccelerateConfigurationAccelerationStatus accelerationStatus;

    public BucketAccelerateConfigurationAccelerationStatus getAccelerationStatus() {
        return this.accelerationStatus;
    }

    public BucketAccelerateConfiguration(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
        this.accelerationStatus = Objects.requireNonNull(accelerationStatus, "expected parameter 'accelerationStatus' to be non-null");
    }

    private BucketAccelerateConfiguration() {
        this.accelerationStatus = null;
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

        public Builder setAccelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            this.accelerationStatus = Objects.requireNonNull(accelerationStatus);
            return this;
        }

        public BucketAccelerateConfiguration build() {
            return new BucketAccelerateConfiguration(accelerationStatus);
        }
    }
}
