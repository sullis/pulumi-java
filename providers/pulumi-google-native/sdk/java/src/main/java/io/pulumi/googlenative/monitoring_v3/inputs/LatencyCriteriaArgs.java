// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for a latency threshold SLI.
 * 
 */
public final class LatencyCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final LatencyCriteriaArgs Empty = new LatencyCriteriaArgs();

    /**
     * Good service is defined to be the count of requests made to this service that return in no more than threshold.
     * 
     */
    @InputImport(name="threshold")
      private final @Nullable Input<String> threshold;

    public Input<String> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public LatencyCriteriaArgs(@Nullable Input<String> threshold) {
        this.threshold = threshold;
    }

    private LatencyCriteriaArgs() {
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatencyCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LatencyCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        public Builder setThreshold(@Nullable Input<String> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable String threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }
        public LatencyCriteriaArgs build() {
            return new LatencyCriteriaArgs(threshold);
        }
    }
}