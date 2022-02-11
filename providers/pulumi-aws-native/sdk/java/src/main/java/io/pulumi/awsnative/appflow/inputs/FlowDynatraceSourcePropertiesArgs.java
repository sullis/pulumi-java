// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowDynatraceSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDynatraceSourcePropertiesArgs Empty = new FlowDynatraceSourcePropertiesArgs();

    @InputImport(name="object", required=true)
    private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public FlowDynatraceSourcePropertiesArgs(Input<String> object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowDynatraceSourcePropertiesArgs() {
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDynatraceSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDynatraceSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }

        public FlowDynatraceSourcePropertiesArgs build() {
            return new FlowDynatraceSourcePropertiesArgs(object);
        }
    }
}
