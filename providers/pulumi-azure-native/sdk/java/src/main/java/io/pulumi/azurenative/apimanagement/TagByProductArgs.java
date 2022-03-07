// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagByProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagByProductArgs Empty = new TagByProductArgs();

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="productId", required=true)
      private final Input<String> productId;

    public Input<String> getProductId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="tagId")
      private final @Nullable Input<String> tagId;

    public Input<String> getTagId() {
        return this.tagId == null ? Input.empty() : this.tagId;
    }

    public TagByProductArgs(
        Input<String> productId,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> tagId) {
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tagId = tagId;
    }

    private TagByProductArgs() {
        this.productId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.tagId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagByProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> productId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> tagId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagByProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tagId = defaults.tagId;
        }

        public Builder setProductId(Input<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Input.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTagId(@Nullable Input<String> tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setTagId(@Nullable String tagId) {
            this.tagId = Input.ofNullable(tagId);
            return this;
        }
        public TagByProductArgs build() {
            return new TagByProductArgs(productId, resourceGroupName, serviceName, tagId);
        }
    }
}