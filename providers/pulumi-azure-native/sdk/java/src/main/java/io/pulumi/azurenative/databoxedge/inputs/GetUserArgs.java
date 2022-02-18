// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The user name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetUserArgs(
        String deviceName,
        String name,
        String resourceGroupName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetUserArgs() {
        this.deviceName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
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

        public GetUserArgs build() {
            return new GetUserArgs(deviceName, name, resourceGroupName);
        }
    }
}
