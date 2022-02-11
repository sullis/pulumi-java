// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowMarketoSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowMarketoSourceProperties Empty = new FlowMarketoSourceProperties();

    @InputImport(name="object", required=true)
    private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowMarketoSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowMarketoSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowMarketoSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowMarketoSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public FlowMarketoSourceProperties build() {
            return new FlowMarketoSourceProperties(object);
        }
    }
}
