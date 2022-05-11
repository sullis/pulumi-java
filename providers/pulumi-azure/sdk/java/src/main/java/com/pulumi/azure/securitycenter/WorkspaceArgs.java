// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The scope of VMs to send their security data to the desired workspace, unless overridden by a setting with more specific scope.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of VMs to send their security data to the desired workspace, unless overridden by a setting with more specific scope.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The ID of the Log Analytics Workspace to save the data in.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The ID of the Log Analytics Workspace to save the data in.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.scope = $.scope;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The scope of VMs to send their security data to the desired workspace, unless overridden by a setting with more specific scope.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of VMs to send their security data to the desired workspace, unless overridden by a setting with more specific scope.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param workspaceId The ID of the Log Analytics Workspace to save the data in.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the Log Analytics Workspace to save the data in.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
