// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InputAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputAttributeArgs Empty = new InputAttributeArgs();

    @InputImport(name="jsonPath", required=true)
    private final Input<String> jsonPath;

    public Input<String> getJsonPath() {
        return this.jsonPath;
    }

    public InputAttributeArgs(Input<String> jsonPath) {
        this.jsonPath = Objects.requireNonNull(jsonPath, "expected parameter 'jsonPath' to be non-null");
    }

    private InputAttributeArgs() {
        this.jsonPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> jsonPath;

        public Builder() {
    	      // Empty
        }

        public Builder(InputAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
        }

        public Builder setJsonPath(Input<String> jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }

        public Builder setJsonPath(String jsonPath) {
            this.jsonPath = Input.of(Objects.requireNonNull(jsonPath));
            return this;
        }

        public InputAttributeArgs build() {
            return new InputAttributeArgs(jsonPath);
        }
    }
}
