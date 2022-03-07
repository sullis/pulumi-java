// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSnapshotPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotPolicyArgs Empty = new GetSnapshotPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the snapshot policy
     * 
     */
    @InputImport(name="snapshotPolicyName", required=true)
      private final String snapshotPolicyName;

    public String getSnapshotPolicyName() {
        return this.snapshotPolicyName;
    }

    public GetSnapshotPolicyArgs(
        String accountName,
        String resourceGroupName,
        String snapshotPolicyName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.snapshotPolicyName = Objects.requireNonNull(snapshotPolicyName, "expected parameter 'snapshotPolicyName' to be non-null");
    }

    private GetSnapshotPolicyArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.snapshotPolicyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String snapshotPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.snapshotPolicyName = defaults.snapshotPolicyName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSnapshotPolicyName(String snapshotPolicyName) {
            this.snapshotPolicyName = Objects.requireNonNull(snapshotPolicyName);
            return this;
        }
        public GetSnapshotPolicyArgs build() {
            return new GetSnapshotPolicyArgs(accountName, resourceGroupName, snapshotPolicyName);
        }
    }
}