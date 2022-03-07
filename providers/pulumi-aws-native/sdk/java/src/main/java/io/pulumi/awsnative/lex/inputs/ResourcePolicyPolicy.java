// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import java.util.Objects;


/**
 * A resource policy to add to the resource. The policy is a JSON structure following the IAM syntax that contains one or more statements that define the policy.
 * 
 */
public final class ResourcePolicyPolicy extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyPolicy Empty = new ResourcePolicyPolicy();

    public ResourcePolicyPolicy() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ResourcePolicyPolicy build() {
            return new ResourcePolicyPolicy();
        }
    }
}