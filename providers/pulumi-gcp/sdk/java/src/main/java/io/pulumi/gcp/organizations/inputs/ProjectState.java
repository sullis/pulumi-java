// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * Create the 'default' network automatically.  Default `true`.
     * If set to `false`, the default network will be deleted.  Note that, for quota purposes, you
     * will still need to have 1 network slot available to create the project successfully, even if
     * you set `auto_create_network` to `false`, since the network will exist momentarily.
     * 
     */
    @InputImport(name="autoCreateNetwork")
    private final @Nullable Input<Boolean> autoCreateNetwork;

    public Input<Boolean> getAutoCreateNetwork() {
        return this.autoCreateNetwork == null ? Input.empty() : this.autoCreateNetwork;
    }

    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     * 
     */
    @InputImport(name="billingAccount")
    private final @Nullable Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount == null ? Input.empty() : this.billingAccount;
    }

    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     * 
     */
    @InputImport(name="folderId")
    private final @Nullable Input<String> folderId;

    public Input<String> getFolderId() {
        return this.folderId == null ? Input.empty() : this.folderId;
    }

    /**
     * A set of key/value label pairs to assign to the project.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The display name of the project.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The numeric identifier of the project.
     * 
     */
    @InputImport(name="number")
    private final @Nullable Input<String> number;

    public Input<String> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     * 
     */
    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    /**
     * The project ID. Changing this forces a new project to be created.
     * 
     */
    @InputImport(name="projectId")
    private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    /**
     * If true, the resource can be deleted
     * without deleting the Project via the Google API.
     * 
     */
    @InputImport(name="skipDelete")
    private final @Nullable Input<Boolean> skipDelete;

    public Input<Boolean> getSkipDelete() {
        return this.skipDelete == null ? Input.empty() : this.skipDelete;
    }

    public ProjectState(
        @Nullable Input<Boolean> autoCreateNetwork,
        @Nullable Input<String> billingAccount,
        @Nullable Input<String> folderId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> number,
        @Nullable Input<String> orgId,
        @Nullable Input<String> projectId,
        @Nullable Input<Boolean> skipDelete) {
        this.autoCreateNetwork = autoCreateNetwork;
        this.billingAccount = billingAccount;
        this.folderId = folderId;
        this.labels = labels;
        this.name = name;
        this.number = number;
        this.orgId = orgId;
        this.projectId = projectId;
        this.skipDelete = skipDelete;
    }

    private ProjectState() {
        this.autoCreateNetwork = Input.empty();
        this.billingAccount = Input.empty();
        this.folderId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.number = Input.empty();
        this.orgId = Input.empty();
        this.projectId = Input.empty();
        this.skipDelete = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoCreateNetwork;
        private @Nullable Input<String> billingAccount;
        private @Nullable Input<String> folderId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> number;
        private @Nullable Input<String> orgId;
        private @Nullable Input<String> projectId;
        private @Nullable Input<Boolean> skipDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateNetwork = defaults.autoCreateNetwork;
    	      this.billingAccount = defaults.billingAccount;
    	      this.folderId = defaults.folderId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.skipDelete = defaults.skipDelete;
        }

        public Builder setAutoCreateNetwork(@Nullable Input<Boolean> autoCreateNetwork) {
            this.autoCreateNetwork = autoCreateNetwork;
            return this;
        }

        public Builder setAutoCreateNetwork(@Nullable Boolean autoCreateNetwork) {
            this.autoCreateNetwork = Input.ofNullable(autoCreateNetwork);
            return this;
        }

        public Builder setBillingAccount(@Nullable Input<String> billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }

        public Builder setBillingAccount(@Nullable String billingAccount) {
            this.billingAccount = Input.ofNullable(billingAccount);
            return this;
        }

        public Builder setFolderId(@Nullable Input<String> folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder setFolderId(@Nullable String folderId) {
            this.folderId = Input.ofNullable(folderId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNumber(@Nullable Input<String> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable String number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public Builder setSkipDelete(@Nullable Input<Boolean> skipDelete) {
            this.skipDelete = skipDelete;
            return this;
        }

        public Builder setSkipDelete(@Nullable Boolean skipDelete) {
            this.skipDelete = Input.ofNullable(skipDelete);
            return this;
        }

        public ProjectState build() {
            return new ProjectState(autoCreateNetwork, billingAccount, folderId, labels, name, number, orgId, projectId, skipDelete);
        }
    }
}
