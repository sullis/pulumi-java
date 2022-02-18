// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowGoogleAnalyticsSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowGoogleAnalyticsSourceProperties Empty = new FlowGoogleAnalyticsSourceProperties();

    @InputImport(name="object", required=true)
    private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowGoogleAnalyticsSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowGoogleAnalyticsSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowGoogleAnalyticsSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowGoogleAnalyticsSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public FlowGoogleAnalyticsSourceProperties build() {
            return new FlowGoogleAnalyticsSourceProperties(object);
        }
    }
}
