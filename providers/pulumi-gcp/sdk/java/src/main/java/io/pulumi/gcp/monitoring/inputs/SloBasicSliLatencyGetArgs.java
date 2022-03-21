// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SloBasicSliLatencyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloBasicSliLatencyGetArgs Empty = new SloBasicSliLatencyGetArgs();

    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<String> threshold;

    public Output<String> getThreshold() {
        return this.threshold;
    }

    public SloBasicSliLatencyGetArgs(Output<String> threshold) {
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
    }

    private SloBasicSliLatencyGetArgs() {
        this.threshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSliLatencyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSliLatencyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        public Builder threshold(Output<String> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder threshold(String threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }        public SloBasicSliLatencyGetArgs build() {
            return new SloBasicSliLatencyGetArgs(threshold);
        }
    }
}
