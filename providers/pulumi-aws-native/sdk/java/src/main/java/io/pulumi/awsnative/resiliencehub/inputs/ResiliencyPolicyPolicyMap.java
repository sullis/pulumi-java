// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.inputs;

import java.util.Objects;


public final class ResiliencyPolicyPolicyMap extends io.pulumi.resources.InvokeArgs {

    public static final ResiliencyPolicyPolicyMap Empty = new ResiliencyPolicyPolicyMap();

    public ResiliencyPolicyPolicyMap() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResiliencyPolicyPolicyMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ResiliencyPolicyPolicyMap defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ResiliencyPolicyPolicyMap build() {
            return new ResiliencyPolicyPolicyMap();
        }
    }
}
