// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BucketEventBridgeConfiguration {
    /**
     * Specifies whether to send notifications to Amazon EventBridge when events occur in an Amazon S3 bucket.
     * 
     */
    private final Boolean eventBridgeEnabled;

    @OutputCustomType.Constructor({"eventBridgeEnabled"})
    private BucketEventBridgeConfiguration(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = Objects.requireNonNull(eventBridgeEnabled);
    }

    /**
     * Specifies whether to send notifications to Amazon EventBridge when events occur in an Amazon S3 bucket.
     * 
    */
    public Boolean getEventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEventBridgeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean eventBridgeEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEventBridgeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridgeEnabled = defaults.eventBridgeEnabled;
        }

        public Builder setEventBridgeEnabled(Boolean eventBridgeEnabled) {
            this.eventBridgeEnabled = Objects.requireNonNull(eventBridgeEnabled);
            return this;
        }
        public BucketEventBridgeConfiguration build() {
            return new BucketEventBridgeConfiguration(eventBridgeEnabled);
        }
    }
}