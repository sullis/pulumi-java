// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentTypeArgs Empty = new ContentTypeArgs();

    /**
     * Content type identifier.
     * 
     */
    @InputImport(name="contentTypeId")
    private final @Nullable Input<String> contentTypeId;

    public Input<String> getContentTypeId() {
        return this.contentTypeId == null ? Input.empty() : this.contentTypeId;
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

    public ContentTypeArgs(
        @Nullable Input<String> contentTypeId,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.contentTypeId = contentTypeId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ContentTypeArgs() {
        this.contentTypeId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentTypeId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypeId = defaults.contentTypeId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setContentTypeId(@Nullable Input<String> contentTypeId) {
            this.contentTypeId = contentTypeId;
            return this;
        }

        public Builder setContentTypeId(@Nullable String contentTypeId) {
            this.contentTypeId = Input.ofNullable(contentTypeId);
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

        public ContentTypeArgs build() {
            return new ContentTypeArgs(contentTypeId, resourceGroupName, serviceName);
        }
    }
}
