// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebServiceArgs Empty = new GetWebServiceArgs();

    /**
     * The region for which encrypted credential parameters are valid.
     * 
     */
    @InputImport(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * Name of the resource group in which the web service is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the web service.
     * 
     */
    @InputImport(name="webServiceName", required=true)
      private final String webServiceName;

    public String getWebServiceName() {
        return this.webServiceName;
    }

    public GetWebServiceArgs(
        @Nullable String region,
        String resourceGroupName,
        String webServiceName) {
        this.region = region;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.webServiceName = Objects.requireNonNull(webServiceName, "expected parameter 'webServiceName' to be non-null");
    }

    private GetWebServiceArgs() {
        this.region = null;
        this.resourceGroupName = null;
        this.webServiceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;
        private String resourceGroupName;
        private String webServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.webServiceName = defaults.webServiceName;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWebServiceName(String webServiceName) {
            this.webServiceName = Objects.requireNonNull(webServiceName);
            return this;
        }
        public GetWebServiceArgs build() {
            return new GetWebServiceArgs(region, resourceGroupName, webServiceName);
        }
    }
}