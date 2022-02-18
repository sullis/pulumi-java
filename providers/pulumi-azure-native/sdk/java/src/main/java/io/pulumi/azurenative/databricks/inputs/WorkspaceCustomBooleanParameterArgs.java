// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The value which should be used for this field.
 * 
 */
public final class WorkspaceCustomBooleanParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomBooleanParameterArgs Empty = new WorkspaceCustomBooleanParameterArgs();

    /**
     * The value which should be used for this field.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<Boolean> value;

    public Input<Boolean> getValue() {
        return this.value;
    }

    public WorkspaceCustomBooleanParameterArgs(Input<Boolean> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WorkspaceCustomBooleanParameterArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomBooleanParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomBooleanParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(Input<Boolean> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Boolean value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public WorkspaceCustomBooleanParameterArgs build() {
            return new WorkspaceCustomBooleanParameterArgs(value);
        }
    }
}
