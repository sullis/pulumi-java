// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class LaunchProfileTags {
    @OutputCustomType.Constructor({})
    private LaunchProfileTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public LaunchProfileTags build() {
            return new LaunchProfileTags();
        }
    }
}