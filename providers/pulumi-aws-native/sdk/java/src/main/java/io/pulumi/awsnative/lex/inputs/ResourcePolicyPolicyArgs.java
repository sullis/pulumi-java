// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import java.util.Objects;


public final class ResourcePolicyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyPolicyArgs Empty = new ResourcePolicyPolicyArgs();

    public ResourcePolicyPolicyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ResourcePolicyPolicyArgs build() {
            return new ResourcePolicyPolicyArgs();
        }
    }
}
