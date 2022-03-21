// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamedValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamedValueArgs Empty = new GetNamedValueArgs();

    /**
     * Identifier of the NamedValue.
     * 
     */
    @Import(name="namedValueId", required=true)
      private final String namedValueId;

    public String getNamedValueId() {
        return this.namedValueId;
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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetNamedValueArgs(
        String namedValueId,
        String resourceGroupName,
        String serviceName) {
        this.namedValueId = Objects.requireNonNull(namedValueId, "expected parameter 'namedValueId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetNamedValueArgs() {
        this.namedValueId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namedValueId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamedValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedValueId = defaults.namedValueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder namedValueId(String namedValueId) {
            this.namedValueId = Objects.requireNonNull(namedValueId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetNamedValueArgs build() {
            return new GetNamedValueArgs(namedValueId, resourceGroupName, serviceName);
        }
    }
}
