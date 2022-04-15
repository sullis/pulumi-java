// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrackerConsumerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTrackerConsumerArgs Empty = new GetTrackerConsumerArgs();

    @Import(name="consumerArn", required=true)
      private final String consumerArn;

    public String consumerArn() {
        return this.consumerArn;
    }

    @Import(name="trackerName", required=true)
      private final String trackerName;

    public String trackerName() {
        return this.trackerName;
    }

    public GetTrackerConsumerArgs(
        String consumerArn,
        String trackerName) {
        this.consumerArn = Objects.requireNonNull(consumerArn, "expected parameter 'consumerArn' to be non-null");
        this.trackerName = Objects.requireNonNull(trackerName, "expected parameter 'trackerName' to be non-null");
    }

    private GetTrackerConsumerArgs() {
        this.consumerArn = null;
        this.trackerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrackerConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerArn;
        private String trackerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrackerConsumerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerArn = defaults.consumerArn;
    	      this.trackerName = defaults.trackerName;
        }

        public Builder consumerArn(String consumerArn) {
            this.consumerArn = Objects.requireNonNull(consumerArn);
            return this;
        }
        public Builder trackerName(String trackerName) {
            this.trackerName = Objects.requireNonNull(trackerName);
            return this;
        }        public GetTrackerConsumerArgs build() {
            return new GetTrackerConsumerArgs(consumerArn, trackerName);
        }
    }
}
