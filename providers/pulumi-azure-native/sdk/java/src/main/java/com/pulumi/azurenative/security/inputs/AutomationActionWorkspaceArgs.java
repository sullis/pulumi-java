// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Log Analytics Workspace to which event data will be exported. Security alerts data will reside in the 'SecurityAlert' table and the assessments data will reside in the 'SecurityRecommendation' table (under the 'Security'/'SecurityCenterFree' solutions). Note that in order to view the data in the workspace, the Security Center Log Analytics free/standard solution needs to be enabled on that workspace. To learn more about Security Center continuous export capabilities, visit https://aka.ms/ASCExportLearnMore
 * 
 */
public final class AutomationActionWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationActionWorkspaceArgs Empty = new AutomationActionWorkspaceArgs();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'Workspace'.
     * 
     */
    @Import(name="actionType", required=true)
      private final Output<String> actionType;

    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * The fully qualified Log Analytics Workspace Azure Resource ID.
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable Output<String> workspaceResourceId;

    public Output<String> workspaceResourceId() {
        return this.workspaceResourceId == null ? Codegen.empty() : this.workspaceResourceId;
    }

    public AutomationActionWorkspaceArgs(
        Output<String> actionType,
        @Nullable Output<String> workspaceResourceId) {
        this.actionType = Codegen.stringProp("actionType").output().arg(actionType).require();
        this.workspaceResourceId = workspaceResourceId;
    }

    private AutomationActionWorkspaceArgs() {
        this.actionType = Codegen.empty();
        this.workspaceResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> actionType;
        private @Nullable Output<String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder actionType(Output<String> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder actionType(String actionType) {
            this.actionType = Output.of(Objects.requireNonNull(actionType));
            return this;
        }
        public Builder workspaceResourceId(@Nullable Output<String> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = Codegen.ofNullable(workspaceResourceId);
            return this;
        }        public AutomationActionWorkspaceArgs build() {
            return new AutomationActionWorkspaceArgs(actionType, workspaceResourceId);
        }
    }
}
