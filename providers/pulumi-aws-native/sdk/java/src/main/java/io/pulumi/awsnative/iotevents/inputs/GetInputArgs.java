// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInputArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInputArgs Empty = new GetInputArgs();

    /**
     * The name of the input.
     * 
     */
    @InputImport(name="inputName", required=true)
    private final String inputName;

    public String getInputName() {
        return this.inputName;
    }

    public GetInputArgs(String inputName) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
    }

    private GetInputArgs() {
        this.inputName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public GetInputArgs build() {
            return new GetInputArgs(inputName);
        }
    }
}
