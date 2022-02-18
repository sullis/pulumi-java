// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBuildServiceBuilderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBuildServiceBuilderArgs Empty = new GetBuildServiceBuilderArgs();

    /**
     * The name of the build service resource.
     * 
     */
    @InputImport(name="buildServiceName", required=true)
    private final String buildServiceName;

    public String getBuildServiceName() {
        return this.buildServiceName;
    }

    /**
     * The name of the builder resource.
     * 
     */
    @InputImport(name="builderName", required=true)
    private final String builderName;

    public String getBuilderName() {
        return this.builderName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetBuildServiceBuilderArgs(
        String buildServiceName,
        String builderName,
        String resourceGroupName,
        String serviceName) {
        this.buildServiceName = Objects.requireNonNull(buildServiceName, "expected parameter 'buildServiceName' to be non-null");
        this.builderName = Objects.requireNonNull(builderName, "expected parameter 'builderName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetBuildServiceBuilderArgs() {
        this.buildServiceName = null;
        this.builderName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildServiceBuilderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buildServiceName;
        private String builderName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildServiceBuilderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildServiceName = defaults.buildServiceName;
    	      this.builderName = defaults.builderName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setBuildServiceName(String buildServiceName) {
            this.buildServiceName = Objects.requireNonNull(buildServiceName);
            return this;
        }

        public Builder setBuilderName(String builderName) {
            this.builderName = Objects.requireNonNull(builderName);
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

        public GetBuildServiceBuilderArgs build() {
            return new GetBuildServiceBuilderArgs(buildServiceName, builderName, resourceGroupName, serviceName);
        }
    }
}
