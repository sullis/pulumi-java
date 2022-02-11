// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BucketAccelerateConfiguration {
    private final BucketAccelerateConfigurationAccelerationStatus accelerationStatus;

    @OutputCustomType.Constructor({"accelerationStatus"})
    private BucketAccelerateConfiguration(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
        this.accelerationStatus = Objects.requireNonNull(accelerationStatus);
    }

    public BucketAccelerateConfigurationAccelerationStatus getAccelerationStatus() {
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

        public Builder setAccelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            this.accelerationStatus = Objects.requireNonNull(accelerationStatus);
            return this;
        }

        public BucketAccelerateConfiguration build() {
            return new BucketAccelerateConfiguration(accelerationStatus);
        }
    }
}
