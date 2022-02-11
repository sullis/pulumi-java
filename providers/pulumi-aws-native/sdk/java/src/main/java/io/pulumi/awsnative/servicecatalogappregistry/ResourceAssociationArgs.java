// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.servicecatalogappregistry.enums.ResourceAssociationResourceType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourceAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAssociationArgs Empty = new ResourceAssociationArgs();

    @InputImport(name="application", required=true)
    private final Input<String> application;

    public Input<String> getApplication() {
        return this.application;
    }

    @InputImport(name="resource", required=true)
    private final Input<String> resource;

    public Input<String> getResource() {
        return this.resource;
    }

    @InputImport(name="resourceType", required=true)
    private final Input<ResourceAssociationResourceType> resourceType;

    public Input<ResourceAssociationResourceType> getPropResourceType() {
        return this.resourceType;
    }

    public ResourceAssociationArgs(
        Input<String> application,
        Input<String> resource,
        Input<ResourceAssociationResourceType> resourceType) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ResourceAssociationArgs() {
        this.application = Input.empty();
        this.resource = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> application;
        private Input<String> resource;
        private Input<ResourceAssociationResourceType> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.resource = defaults.resource;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setApplication(Input<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }

        public Builder setApplication(String application) {
            this.application = Input.of(Objects.requireNonNull(application));
            return this;
        }

        public Builder setResource(Input<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }

        public Builder setResourceType(Input<ResourceAssociationResourceType> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(ResourceAssociationResourceType resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public ResourceAssociationArgs build() {
            return new ResourceAssociationArgs(application, resource, resourceType);
        }
    }
}
