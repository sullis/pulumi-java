// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Non Azure query for the update configuration.
 * 
 */
public final class NonAzureQueryPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonAzureQueryPropertiesArgs Empty = new NonAzureQueryPropertiesArgs();

    /**
     * Log Analytics Saved Search name.
     * 
     */
    @InputImport(name="functionAlias")
      private final @Nullable Input<String> functionAlias;

    public Input<String> getFunctionAlias() {
        return this.functionAlias == null ? Input.empty() : this.functionAlias;
    }

    /**
     * Workspace Id for Log Analytics in which the saved Search is resided.
     * 
     */
    @InputImport(name="workspaceId")
      private final @Nullable Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId == null ? Input.empty() : this.workspaceId;
    }

    public NonAzureQueryPropertiesArgs(
        @Nullable Input<String> functionAlias,
        @Nullable Input<String> workspaceId) {
        this.functionAlias = functionAlias;
        this.workspaceId = workspaceId;
    }

    private NonAzureQueryPropertiesArgs() {
        this.functionAlias = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonAzureQueryPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionAlias;
        private @Nullable Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NonAzureQueryPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAlias = defaults.functionAlias;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setFunctionAlias(@Nullable Input<String> functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = Input.ofNullable(functionAlias);
            return this;
        }

        public Builder setWorkspaceId(@Nullable Input<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = Input.ofNullable(workspaceId);
            return this;
        }
        public NonAzureQueryPropertiesArgs build() {
            return new NonAzureQueryPropertiesArgs(functionAlias, workspaceId);
        }
    }
}