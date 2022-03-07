// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCloudFormationProvisionedProductArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCloudFormationProvisionedProductArgs Empty = new GetCloudFormationProvisionedProductArgs();

    @InputImport(name="provisionedProductId", required=true)
      private final String provisionedProductId;

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public GetCloudFormationProvisionedProductArgs(String provisionedProductId) {
        this.provisionedProductId = Objects.requireNonNull(provisionedProductId, "expected parameter 'provisionedProductId' to be non-null");
    }

    private GetCloudFormationProvisionedProductArgs() {
        this.provisionedProductId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudFormationProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisionedProductId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudFormationProvisionedProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisionedProductId = defaults.provisionedProductId;
        }

        public Builder setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = Objects.requireNonNull(provisionedProductId);
            return this;
        }
        public GetCloudFormationProvisionedProductArgs build() {
            return new GetCloudFormationProvisionedProductArgs(provisionedProductId);
        }
    }
}