// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import java.util.Objects;


public final class RobotApplicationTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RobotApplicationTagsArgs Empty = new RobotApplicationTagsArgs();

    public RobotApplicationTagsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public RobotApplicationTagsArgs build() {
            return new RobotApplicationTagsArgs();
        }
    }
}
