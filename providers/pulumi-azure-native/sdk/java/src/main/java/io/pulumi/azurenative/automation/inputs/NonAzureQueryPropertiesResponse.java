// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Non Azure query for the update configuration.
 * 
 */
public final class NonAzureQueryPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NonAzureQueryPropertiesResponse Empty = new NonAzureQueryPropertiesResponse();

    /**
     * Log Analytics Saved Search name.
     * 
     */
    @InputImport(name="functionAlias")
    private final @Nullable String functionAlias;

    public Optional<String> getFunctionAlias() {
        return this.functionAlias == null ? Optional.empty() : Optional.ofNullable(this.functionAlias);
    }

    /**
     * Workspace Id for Log Analytics in which the saved Search is resided.
     * 
     */
    @InputImport(name="workspaceId")
    private final @Nullable String workspaceId;

    public Optional<String> getWorkspaceId() {
        return this.workspaceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceId);
    }

    public NonAzureQueryPropertiesResponse(
        @Nullable String functionAlias,
        @Nullable String workspaceId) {
        this.functionAlias = functionAlias;
        this.workspaceId = workspaceId;
    }

    private NonAzureQueryPropertiesResponse() {
        this.functionAlias = null;
        this.workspaceId = null;
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
