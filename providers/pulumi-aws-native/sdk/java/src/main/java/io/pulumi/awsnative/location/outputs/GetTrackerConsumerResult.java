// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetTrackerConsumerResult {
    @OutputCustomType.Constructor({})
    private GetTrackerConsumerResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrackerConsumerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrackerConsumerResult defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetTrackerConsumerResult build() {
            return new GetTrackerConsumerResult();
        }
    }
}
