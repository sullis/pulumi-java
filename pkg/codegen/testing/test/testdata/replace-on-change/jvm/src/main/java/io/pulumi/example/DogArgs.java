// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import java.util.Objects;


public final class DogArgs extends io.pulumi.resources.ResourceArgs {

    public static final DogArgs Empty = new DogArgs();

    public DogArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DogArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public DogArgs build() {
            return new DogArgs();
        }
    }
}