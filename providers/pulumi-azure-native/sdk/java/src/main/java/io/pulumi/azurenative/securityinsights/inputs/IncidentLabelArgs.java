// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an incident label
 * 
 */
public final class IncidentLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentLabelArgs Empty = new IncidentLabelArgs();

    /**
     * The name of the label
     * 
     */
    @InputImport(name="labelName", required=true)
    private final Input<String> labelName;

    public Input<String> getLabelName() {
        return this.labelName;
    }

    public IncidentLabelArgs(Input<String> labelName) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
    }

    private IncidentLabelArgs() {
        this.labelName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder setLabelName(Input<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder setLabelName(String labelName) {
            this.labelName = Input.of(Objects.requireNonNull(labelName));
            return this;
        }

        public IncidentLabelArgs build() {
            return new IncidentLabelArgs(labelName);
        }
    }
}
