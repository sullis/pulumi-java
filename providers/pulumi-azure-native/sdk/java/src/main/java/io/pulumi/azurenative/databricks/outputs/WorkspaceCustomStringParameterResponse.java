// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkspaceCustomStringParameterResponse {
    /**
     * The type of variable that this is
     * 
     */
    private final String type;
    /**
     * The value which should be used for this field.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private WorkspaceCustomStringParameterResponse(
        String type,
        String value) {
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The type of variable that this is
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The value which should be used for this field.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomStringParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomStringParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public WorkspaceCustomStringParameterResponse build() {
            return new WorkspaceCustomStringParameterResponse(type, value);
        }
    }
}
