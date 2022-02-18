// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders;

import io.pulumi.azurenative.customproviders.inputs.CustomRPActionRouteDefinitionArgs;
import io.pulumi.azurenative.customproviders.inputs.CustomRPResourceTypeRouteDefinitionArgs;
import io.pulumi.azurenative.customproviders.inputs.CustomRPValidationsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomResourceProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceProviderArgs Empty = new CustomResourceProviderArgs();

    /**
     * A list of actions that the custom resource provider implements.
     * 
     */
    @InputImport(name="actions")
    private final @Nullable Input<List<CustomRPActionRouteDefinitionArgs>> actions;

    public Input<List<CustomRPActionRouteDefinitionArgs>> getActions() {
        return this.actions == null ? Input.empty() : this.actions;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * The name of the resource provider.
     * 
     */
    @InputImport(name="resourceProviderName")
    private final @Nullable Input<String> resourceProviderName;

    public Input<String> getResourceProviderName() {
        return this.resourceProviderName == null ? Input.empty() : this.resourceProviderName;
    }

    /**
     * A list of resource types that the custom resource provider implements.
     * 
     */
    @InputImport(name="resourceTypes")
    private final @Nullable Input<List<CustomRPResourceTypeRouteDefinitionArgs>> resourceTypes;

    public Input<List<CustomRPResourceTypeRouteDefinitionArgs>> getResourceTypes() {
        return this.resourceTypes == null ? Input.empty() : this.resourceTypes;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A list of validations to run on the custom resource provider's requests.
     * 
     */
    @InputImport(name="validations")
    private final @Nullable Input<List<CustomRPValidationsArgs>> validations;

    public Input<List<CustomRPValidationsArgs>> getValidations() {
        return this.validations == null ? Input.empty() : this.validations;
    }

    public CustomResourceProviderArgs(
        @Nullable Input<List<CustomRPActionRouteDefinitionArgs>> actions,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceProviderName,
        @Nullable Input<List<CustomRPResourceTypeRouteDefinitionArgs>> resourceTypes,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<CustomRPValidationsArgs>> validations) {
        this.actions = actions;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceProviderName = resourceProviderName;
        this.resourceTypes = resourceTypes;
        this.tags = tags;
        this.validations = validations;
    }

    private CustomResourceProviderArgs() {
        this.actions = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceProviderName = Input.empty();
        this.resourceTypes = Input.empty();
        this.tags = Input.empty();
        this.validations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomRPActionRouteDefinitionArgs>> actions;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceProviderName;
        private @Nullable Input<List<CustomRPResourceTypeRouteDefinitionArgs>> resourceTypes;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<CustomRPValidationsArgs>> validations;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceProviderName = defaults.resourceProviderName;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.tags = defaults.tags;
    	      this.validations = defaults.validations;
        }

        public Builder setActions(@Nullable Input<List<CustomRPActionRouteDefinitionArgs>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setActions(@Nullable List<CustomRPActionRouteDefinitionArgs> actions) {
            this.actions = Input.ofNullable(actions);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setResourceProviderName(@Nullable Input<String> resourceProviderName) {
            this.resourceProviderName = resourceProviderName;
            return this;
        }

        public Builder setResourceProviderName(@Nullable String resourceProviderName) {
            this.resourceProviderName = Input.ofNullable(resourceProviderName);
            return this;
        }

        public Builder setResourceTypes(@Nullable Input<List<CustomRPResourceTypeRouteDefinitionArgs>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setResourceTypes(@Nullable List<CustomRPResourceTypeRouteDefinitionArgs> resourceTypes) {
            this.resourceTypes = Input.ofNullable(resourceTypes);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValidations(@Nullable Input<List<CustomRPValidationsArgs>> validations) {
            this.validations = validations;
            return this;
        }

        public Builder setValidations(@Nullable List<CustomRPValidationsArgs> validations) {
            this.validations = Input.ofNullable(validations);
            return this;
        }

        public CustomResourceProviderArgs build() {
            return new CustomResourceProviderArgs(actions, location, resourceGroupName, resourceProviderName, resourceTypes, tags, validations);
        }
    }
}
