// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedStorageAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkedStorageAccountArgs Empty = new GetLinkedStorageAccountArgs();

    /**
     * Linked storage accounts type.
     * 
     */
    @InputImport(name="dataSourceType", required=true)
    private final String dataSourceType;

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetLinkedStorageAccountArgs(
        String dataSourceType,
        String resourceGroupName,
        String workspaceName) {
        this.dataSourceType = Objects.requireNonNull(dataSourceType, "expected parameter 'dataSourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetLinkedStorageAccountArgs() {
        this.dataSourceType = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceType;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedStorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDataSourceType(String dataSourceType) {
            this.dataSourceType = Objects.requireNonNull(dataSourceType);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetLinkedStorageAccountArgs build() {
            return new GetLinkedStorageAccountArgs(dataSourceType, resourceGroupName, workspaceName);
        }
    }
}
