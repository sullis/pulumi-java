// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiTagDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiTagDescriptionArgs Empty = new ApiTagDescriptionArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
    private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Description of the Tag.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Description of the external resources describing the tag.
     * 
     */
    @InputImport(name="externalDocsDescription")
    private final @Nullable Input<String> externalDocsDescription;

    public Input<String> getExternalDocsDescription() {
        return this.externalDocsDescription == null ? Input.empty() : this.externalDocsDescription;
    }

    /**
     * Absolute URL of external resources describing the tag.
     * 
     */
    @InputImport(name="externalDocsUrl")
    private final @Nullable Input<String> externalDocsUrl;

    public Input<String> getExternalDocsUrl() {
        return this.externalDocsUrl == null ? Input.empty() : this.externalDocsUrl;
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
     * Tag description identifier. Used when creating tagDescription for API/Tag association. Based on API and Tag names.
     * 
     */
    @InputImport(name="tagDescriptionId")
    private final @Nullable Input<String> tagDescriptionId;

    public Input<String> getTagDescriptionId() {
        return this.tagDescriptionId == null ? Input.empty() : this.tagDescriptionId;
    }

    public ApiTagDescriptionArgs(
        Input<String> apiId,
        @Nullable Input<String> description,
        @Nullable Input<String> externalDocsDescription,
        @Nullable Input<String> externalDocsUrl,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> tagDescriptionId) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.description = description;
        this.externalDocsDescription = externalDocsDescription;
        this.externalDocsUrl = externalDocsUrl;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tagDescriptionId = tagDescriptionId;
    }

    private ApiTagDescriptionArgs() {
        this.apiId = Input.empty();
        this.description = Input.empty();
        this.externalDocsDescription = Input.empty();
        this.externalDocsUrl = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.tagDescriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiTagDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> externalDocsDescription;
        private @Nullable Input<String> externalDocsUrl;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> tagDescriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiTagDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.externalDocsDescription = defaults.externalDocsDescription;
    	      this.externalDocsUrl = defaults.externalDocsUrl;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tagDescriptionId = defaults.tagDescriptionId;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExternalDocsDescription(@Nullable Input<String> externalDocsDescription) {
            this.externalDocsDescription = externalDocsDescription;
            return this;
        }

        public Builder setExternalDocsDescription(@Nullable String externalDocsDescription) {
            this.externalDocsDescription = Input.ofNullable(externalDocsDescription);
            return this;
        }

        public Builder setExternalDocsUrl(@Nullable Input<String> externalDocsUrl) {
            this.externalDocsUrl = externalDocsUrl;
            return this;
        }

        public Builder setExternalDocsUrl(@Nullable String externalDocsUrl) {
            this.externalDocsUrl = Input.ofNullable(externalDocsUrl);
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

        public Builder setTagDescriptionId(@Nullable Input<String> tagDescriptionId) {
            this.tagDescriptionId = tagDescriptionId;
            return this;
        }

        public Builder setTagDescriptionId(@Nullable String tagDescriptionId) {
            this.tagDescriptionId = Input.ofNullable(tagDescriptionId);
            return this;
        }

        public ApiTagDescriptionArgs build() {
            return new ApiTagDescriptionArgs(apiId, description, externalDocsDescription, externalDocsUrl, resourceGroupName, serviceName, tagDescriptionId);
        }
    }
}
