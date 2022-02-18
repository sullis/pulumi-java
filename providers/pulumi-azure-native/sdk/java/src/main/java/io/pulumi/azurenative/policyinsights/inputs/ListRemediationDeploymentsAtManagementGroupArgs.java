// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListRemediationDeploymentsAtManagementGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListRemediationDeploymentsAtManagementGroupArgs Empty = new ListRemediationDeploymentsAtManagementGroupArgs();

    /**
     * Management group ID.
     * 
     */
    @InputImport(name="managementGroupId", required=true)
    private final String managementGroupId;

    public String getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The namespace for Microsoft Management RP; only "Microsoft.Management" is allowed.
     * 
     */
    @InputImport(name="managementGroupsNamespace", required=true)
    private final String managementGroupsNamespace;

    public String getManagementGroupsNamespace() {
        return this.managementGroupsNamespace;
    }

    /**
     * The name of the remediation.
     * 
     */
    @InputImport(name="remediationName", required=true)
    private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    /**
     * Maximum number of records to return.
     * 
     */
    @InputImport(name="top")
    private final @Nullable Integer top;

    public Optional<Integer> getTop() {
        return this.top == null ? Optional.empty() : Optional.ofNullable(this.top);
    }

    public ListRemediationDeploymentsAtManagementGroupArgs(
        String managementGroupId,
        String managementGroupsNamespace,
        String remediationName,
        @Nullable Integer top) {
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace, "expected parameter 'managementGroupsNamespace' to be non-null");
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
        this.top = top;
    }

    private ListRemediationDeploymentsAtManagementGroupArgs() {
        this.managementGroupId = null;
        this.managementGroupsNamespace = null;
        this.remediationName = null;
        this.top = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRemediationDeploymentsAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementGroupId;
        private String managementGroupsNamespace;
        private String remediationName;
        private @Nullable Integer top;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRemediationDeploymentsAtManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.managementGroupsNamespace = defaults.managementGroupsNamespace;
    	      this.remediationName = defaults.remediationName;
    	      this.top = defaults.top;
        }

        public Builder setManagementGroupId(String managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder setManagementGroupsNamespace(String managementGroupsNamespace) {
            this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace);
            return this;
        }

        public Builder setRemediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }

        public Builder setTop(@Nullable Integer top) {
            this.top = top;
            return this;
        }

        public ListRemediationDeploymentsAtManagementGroupArgs build() {
            return new ListRemediationDeploymentsAtManagementGroupArgs(managementGroupId, managementGroupsNamespace, remediationName, top);
        }
    }
}
