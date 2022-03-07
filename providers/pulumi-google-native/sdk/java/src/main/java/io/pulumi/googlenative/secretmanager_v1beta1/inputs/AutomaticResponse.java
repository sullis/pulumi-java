// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.inputs;

import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload without any restrictions.
 * 
 */
public final class AutomaticResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomaticResponse Empty = new AutomaticResponse();

    public AutomaticResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public AutomaticResponse build() {
            return new AutomaticResponse();
        }
    }
}