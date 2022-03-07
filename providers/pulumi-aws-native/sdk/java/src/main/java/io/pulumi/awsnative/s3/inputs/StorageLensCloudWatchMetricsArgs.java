// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * CloudWatch metrics settings for the Amazon S3 Storage Lens metrics export.
 * 
 */
public final class StorageLensCloudWatchMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensCloudWatchMetricsArgs Empty = new StorageLensCloudWatchMetricsArgs();

    /**
     * Specifies whether CloudWatch metrics are enabled or disabled.
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    public StorageLensCloudWatchMetricsArgs(Input<Boolean> isEnabled) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private StorageLensCloudWatchMetricsArgs() {
        this.isEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensCloudWatchMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensCloudWatchMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public StorageLensCloudWatchMetricsArgs build() {
            return new StorageLensCloudWatchMetricsArgs(isEnabled);
        }
    }
}