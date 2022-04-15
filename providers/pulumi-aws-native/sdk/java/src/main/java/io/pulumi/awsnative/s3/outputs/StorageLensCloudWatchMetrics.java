// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class StorageLensCloudWatchMetrics {
    /**
     * Specifies whether CloudWatch metrics are enabled or disabled.
     * 
     */
    private final Boolean isEnabled;

    @CustomType.Constructor
    private StorageLensCloudWatchMetrics(@CustomType.Parameter("isEnabled") Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * Specifies whether CloudWatch metrics are enabled or disabled.
     * 
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensCloudWatchMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensCloudWatchMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }        public StorageLensCloudWatchMetrics build() {
            return new StorageLensCloudWatchMetrics(isEnabled);
        }
    }
}
