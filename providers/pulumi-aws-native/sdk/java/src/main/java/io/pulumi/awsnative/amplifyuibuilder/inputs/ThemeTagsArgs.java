// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import java.util.Objects;


public final class ThemeTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeTagsArgs Empty = new ThemeTagsArgs();

    public ThemeTagsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ThemeTagsArgs build() {
            return new ThemeTagsArgs();
        }
    }
}
