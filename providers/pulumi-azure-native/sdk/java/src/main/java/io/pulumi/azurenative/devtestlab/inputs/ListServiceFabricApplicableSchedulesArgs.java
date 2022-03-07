// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListServiceFabricApplicableSchedulesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListServiceFabricApplicableSchedulesArgs Empty = new ListServiceFabricApplicableSchedulesArgs();

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
      private final String labName;

    public String getLabName() {
        return this.labName;
    }

    /**
     * The name of the service fabric.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
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
     * The name of the user profile.
     * 
     */
    @InputImport(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ListServiceFabricApplicableSchedulesArgs(
        String labName,
        String name,
        String resourceGroupName,
        String userName) {
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ListServiceFabricApplicableSchedulesArgs() {
        this.labName = null;
        this.name = null;
        this.resourceGroupName = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListServiceFabricApplicableSchedulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labName;
        private String name;
        private String resourceGroupName;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListServiceFabricApplicableSchedulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labName = defaults.labName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userName = defaults.userName;
        }

        public Builder setLabName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ListServiceFabricApplicableSchedulesArgs build() {
            return new ListServiceFabricApplicableSchedulesArgs(labName, name, resourceGroupName, userName);
        }
    }
}