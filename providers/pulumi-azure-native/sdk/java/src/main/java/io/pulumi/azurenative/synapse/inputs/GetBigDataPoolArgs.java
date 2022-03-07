// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBigDataPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBigDataPoolArgs Empty = new GetBigDataPoolArgs();

    /**
     * Big Data pool name
     * 
     */
    @InputImport(name="bigDataPoolName", required=true)
      private final String bigDataPoolName;

    public String getBigDataPoolName() {
        return this.bigDataPoolName;
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
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetBigDataPoolArgs(
        String bigDataPoolName,
        String resourceGroupName,
        String workspaceName) {
        this.bigDataPoolName = Objects.requireNonNull(bigDataPoolName, "expected parameter 'bigDataPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetBigDataPoolArgs() {
        this.bigDataPoolName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBigDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bigDataPoolName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBigDataPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigDataPoolName = defaults.bigDataPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setBigDataPoolName(String bigDataPoolName) {
            this.bigDataPoolName = Objects.requireNonNull(bigDataPoolName);
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
        public GetBigDataPoolArgs build() {
            return new GetBigDataPoolArgs(bigDataPoolName, resourceGroupName, workspaceName);
        }
    }
}