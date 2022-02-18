// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListNamedValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListNamedValueArgs Empty = new ListNamedValueArgs();

    /**
     * Identifier of the NamedValue.
     * 
     */
    @InputImport(name="namedValueId", required=true)
    private final String namedValueId;

    public String getNamedValueId() {
        return this.namedValueId;
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
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public ListNamedValueArgs(
        String namedValueId,
        String resourceGroupName,
        String serviceName) {
        this.namedValueId = Objects.requireNonNull(namedValueId, "expected parameter 'namedValueId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ListNamedValueArgs() {
        this.namedValueId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNamedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namedValueId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNamedValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedValueId = defaults.namedValueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setNamedValueId(String namedValueId) {
            this.namedValueId = Objects.requireNonNull(namedValueId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public ListNamedValueArgs build() {
            return new ListNamedValueArgs(namedValueId, resourceGroupName, serviceName);
        }
    }
}
