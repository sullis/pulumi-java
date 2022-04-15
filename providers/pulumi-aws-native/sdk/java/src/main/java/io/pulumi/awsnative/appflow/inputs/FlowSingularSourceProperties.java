// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowSingularSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowSingularSourceProperties Empty = new FlowSingularSourceProperties();

    @Import(name="object", required=true)
      private final String object;

    public String object() {
        return this.object;
    }

    public FlowSingularSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowSingularSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSingularSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSingularSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public FlowSingularSourceProperties build() {
            return new FlowSingularSourceProperties(object);
        }
    }
}
