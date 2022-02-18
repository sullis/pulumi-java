// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookWorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotebookWorkspaceArgs Empty = new NotebookWorkspaceArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the notebook workspace resource.
     * 
     */
    @InputImport(name="notebookWorkspaceName")
    private final @Nullable Input<String> notebookWorkspaceName;

    public Input<String> getNotebookWorkspaceName() {
        return this.notebookWorkspaceName == null ? Input.empty() : this.notebookWorkspaceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public NotebookWorkspaceArgs(
        Input<String> accountName,
        @Nullable Input<String> notebookWorkspaceName,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.notebookWorkspaceName = notebookWorkspaceName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private NotebookWorkspaceArgs() {
        this.accountName = Input.empty();
        this.notebookWorkspaceName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> notebookWorkspaceName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.notebookWorkspaceName = defaults.notebookWorkspaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setNotebookWorkspaceName(@Nullable Input<String> notebookWorkspaceName) {
            this.notebookWorkspaceName = notebookWorkspaceName;
            return this;
        }

        public Builder setNotebookWorkspaceName(@Nullable String notebookWorkspaceName) {
            this.notebookWorkspaceName = Input.ofNullable(notebookWorkspaceName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public NotebookWorkspaceArgs build() {
            return new NotebookWorkspaceArgs(accountName, notebookWorkspaceName, resourceGroupName);
        }
    }
}
