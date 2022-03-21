// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceFabricScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceFabricScheduleArgs Empty = new GetServiceFabricScheduleArgs();

    /**
     * Specify the $expand query. Example: 'properties($select=status)'
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final String labName;

    public String getLabName() {
        return this.labName;
    }

    /**
     * The name of the schedule.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service fabric.
     * 
     */
    @Import(name="serviceFabricName", required=true)
      private final String serviceFabricName;

    public String getServiceFabricName() {
        return this.serviceFabricName;
    }

    /**
     * The name of the user profile.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public GetServiceFabricScheduleArgs(
        @Nullable String expand,
        String labName,
        String name,
        String resourceGroupName,
        String serviceFabricName,
        String userName) {
        this.expand = expand;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceFabricName = Objects.requireNonNull(serviceFabricName, "expected parameter 'serviceFabricName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetServiceFabricScheduleArgs() {
        this.expand = null;
        this.labName = null;
        this.name = null;
        this.resourceGroupName = null;
        this.serviceFabricName = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceFabricScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labName;
        private String name;
        private String resourceGroupName;
        private String serviceFabricName;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceFabricScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labName = defaults.labName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceFabricName = defaults.serviceFabricName;
    	      this.userName = defaults.userName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceFabricName(String serviceFabricName) {
            this.serviceFabricName = Objects.requireNonNull(serviceFabricName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetServiceFabricScheduleArgs build() {
            return new GetServiceFabricScheduleArgs(expand, labName, name, resourceGroupName, serviceFabricName, userName);
        }
    }
}
