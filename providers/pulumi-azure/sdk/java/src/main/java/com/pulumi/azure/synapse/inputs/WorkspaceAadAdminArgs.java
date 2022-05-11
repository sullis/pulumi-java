// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkspaceAadAdminArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceAadAdminArgs Empty = new WorkspaceAadAdminArgs();

    /**
     * The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Import(name="login", required=true)
    private Output<String> login;

    /**
     * @return The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> login() {
        return this.login;
    }

    /**
     * The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    /**
     * @return The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private WorkspaceAadAdminArgs() {}

    private WorkspaceAadAdminArgs(WorkspaceAadAdminArgs $) {
        this.login = $.login;
        this.objectId = $.objectId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceAadAdminArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceAadAdminArgs $;

        public Builder() {
            $ = new WorkspaceAadAdminArgs();
        }

        public Builder(WorkspaceAadAdminArgs defaults) {
            $ = new WorkspaceAadAdminArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param login The login name of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder login(Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The login name of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param objectId The object id of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The object id of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param tenantId The tenant id of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id of the Azure AD Administrator of this Synapse Workspace.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public WorkspaceAadAdminArgs build() {
            $.login = Objects.requireNonNull($.login, "expected parameter 'login' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
