// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NonAzureQueryPropertiesResponse {
    /**
     * Log Analytics Saved Search name.
     * 
     */
    private final @Nullable String functionAlias;
    /**
     * Workspace Id for Log Analytics in which the saved Search is resided.
     * 
     */
    private final @Nullable String workspaceId;

    @OutputCustomType.Constructor({"functionAlias","workspaceId"})
    private NonAzureQueryPropertiesResponse(
        @Nullable String functionAlias,
        @Nullable String workspaceId) {
        this.functionAlias = functionAlias;
        this.workspaceId = workspaceId;
    }

    /**
     * Log Analytics Saved Search name.
     * 
    */
    public Optional<String> getFunctionAlias() {
        return Optional.ofNullable(this.functionAlias);
    }
    /**
     * Workspace Id for Log Analytics in which the saved Search is resided.
     * 
    */
    public Optional<String> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonAzureQueryPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionAlias;
        private @Nullable String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NonAzureQueryPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAlias = defaults.functionAlias;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public NonAzureQueryPropertiesResponse build() {
            return new NonAzureQueryPropertiesResponse(functionAlias, workspaceId);
        }
    }
}