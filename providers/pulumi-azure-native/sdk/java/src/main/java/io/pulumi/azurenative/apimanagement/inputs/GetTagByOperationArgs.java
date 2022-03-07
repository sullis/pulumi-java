// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTagByOperationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagByOperationArgs Empty = new GetTagByOperationArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    /**
     * Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="operationId", required=true)
      private final String operationId;

    public String getOperationId() {
        return this.operationId;
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

    /**
     * Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="tagId", required=true)
      private final String tagId;

    public String getTagId() {
        return this.tagId;
    }

    public GetTagByOperationArgs(
        String apiId,
        String operationId,
        String resourceGroupName,
        String serviceName,
        String tagId) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tagId = Objects.requireNonNull(tagId, "expected parameter 'tagId' to be non-null");
    }

    private GetTagByOperationArgs() {
        this.apiId = null;
        this.operationId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
        this.tagId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagByOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String operationId;
        private String resourceGroupName;
        private String serviceName;
        private String tagId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagByOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.operationId = defaults.operationId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tagId = defaults.tagId;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setOperationId(String operationId) {
            this.operationId = Objects.requireNonNull(operationId);
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

        public Builder setTagId(String tagId) {
            this.tagId = Objects.requireNonNull(tagId);
            return this;
        }
        public GetTagByOperationArgs build() {
            return new GetTagByOperationArgs(apiId, operationId, resourceGroupName, serviceName, tagId);
        }
    }
}