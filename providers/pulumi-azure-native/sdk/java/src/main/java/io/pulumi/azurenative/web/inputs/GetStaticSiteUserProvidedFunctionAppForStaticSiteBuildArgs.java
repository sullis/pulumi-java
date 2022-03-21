// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs Empty = new GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs();

    /**
     * The stage site identifier.
     * 
     */
    @Import(name="environmentName", required=true)
      private final String environmentName;

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Name of the function app registered with the static site build.
     * 
     */
    @Import(name="functionAppName", required=true)
      private final String functionAppName;

    public String getFunctionAppName() {
        return this.functionAppName;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(
        String environmentName,
        String functionAppName,
        String name,
        String resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.functionAppName = Objects.requireNonNull(functionAppName, "expected parameter 'functionAppName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs() {
        this.environmentName = null;
        this.functionAppName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentName;
        private String functionAppName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.functionAppName = defaults.functionAppName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }
        public Builder functionAppName(String functionAppName) {
            this.functionAppName = Objects.requireNonNull(functionAppName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs build() {
            return new GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(environmentName, functionAppName, name, resourceGroupName);
        }
    }
}
