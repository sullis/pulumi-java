// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.providerhub.inputs.SkuResourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkusNestedResourceTypeFirstArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkusNestedResourceTypeFirstArgs Empty = new SkusNestedResourceTypeFirstArgs();

    /**
     * The first child resource type.
     * 
     */
    @InputImport(name="nestedResourceTypeFirst", required=true)
    private final Input<String> nestedResourceTypeFirst;

    public Input<String> getNestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    @InputImport(name="properties")
    private final @Nullable Input<SkuResourcePropertiesArgs> properties;

    public Input<SkuResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
    private final Input<String> providerNamespace;

    public Input<String> getProviderNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="resourceType", required=true)
    private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<String> sku;

    public Input<String> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    public SkusNestedResourceTypeFirstArgs(
        Input<String> nestedResourceTypeFirst,
        @Nullable Input<SkuResourcePropertiesArgs> properties,
        Input<String> providerNamespace,
        Input<String> resourceType,
        @Nullable Input<String> sku) {
        this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
        this.properties = properties;
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = sku;
    }

    private SkusNestedResourceTypeFirstArgs() {
        this.nestedResourceTypeFirst = Input.empty();
        this.properties = Input.empty();
        this.providerNamespace = Input.empty();
        this.resourceType = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkusNestedResourceTypeFirstArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> nestedResourceTypeFirst;
        private @Nullable Input<SkuResourcePropertiesArgs> properties;
        private Input<String> providerNamespace;
        private Input<String> resourceType;
        private @Nullable Input<String> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(SkusNestedResourceTypeFirstArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nestedResourceTypeFirst = defaults.nestedResourceTypeFirst;
    	      this.properties = defaults.properties;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
        }

        public Builder setNestedResourceTypeFirst(Input<String> nestedResourceTypeFirst) {
            this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst);
            return this;
        }

        public Builder setNestedResourceTypeFirst(String nestedResourceTypeFirst) {
            this.nestedResourceTypeFirst = Input.of(Objects.requireNonNull(nestedResourceTypeFirst));
            return this;
        }

        public Builder setProperties(@Nullable Input<SkuResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable SkuResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setProviderNamespace(Input<String> providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Input.of(Objects.requireNonNull(providerNamespace));
            return this;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder setSku(@Nullable Input<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public SkusNestedResourceTypeFirstArgs build() {
            return new SkusNestedResourceTypeFirstArgs(nestedResourceTypeFirst, properties, providerNamespace, resourceType, sku);
        }
    }
}
