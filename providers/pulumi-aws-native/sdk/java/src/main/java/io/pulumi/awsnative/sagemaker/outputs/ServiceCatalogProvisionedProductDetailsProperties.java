// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCatalogProvisionedProductDetailsProperties {
    private final @Nullable String provisionedProductId;
    private final @Nullable String provisionedProductStatusMessage;

    @OutputCustomType.Constructor({"provisionedProductId","provisionedProductStatusMessage"})
    private ServiceCatalogProvisionedProductDetailsProperties(
        @Nullable String provisionedProductId,
        @Nullable String provisionedProductStatusMessage) {
        this.provisionedProductId = provisionedProductId;
        this.provisionedProductStatusMessage = provisionedProductStatusMessage;
    }

    public Optional<String> getProvisionedProductId() {
        return Optional.ofNullable(this.provisionedProductId);
    }
    public Optional<String> getProvisionedProductStatusMessage() {
        return Optional.ofNullable(this.provisionedProductStatusMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCatalogProvisionedProductDetailsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisionedProductId;
        private @Nullable String provisionedProductStatusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCatalogProvisionedProductDetailsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisionedProductId = defaults.provisionedProductId;
    	      this.provisionedProductStatusMessage = defaults.provisionedProductStatusMessage;
        }

        public Builder setProvisionedProductId(@Nullable String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        public Builder setProvisionedProductStatusMessage(@Nullable String provisionedProductStatusMessage) {
            this.provisionedProductStatusMessage = provisionedProductStatusMessage;
            return this;
        }

        public ServiceCatalogProvisionedProductDetailsProperties build() {
            return new ServiceCatalogProvisionedProductDetailsProperties(provisionedProductId, provisionedProductStatusMessage);
        }
    }
}
