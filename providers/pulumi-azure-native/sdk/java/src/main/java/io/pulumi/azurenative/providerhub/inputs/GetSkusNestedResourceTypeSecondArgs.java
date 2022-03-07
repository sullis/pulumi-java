// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSkusNestedResourceTypeSecondArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSkusNestedResourceTypeSecondArgs Empty = new GetSkusNestedResourceTypeSecondArgs();

    /**
     * The first child resource type.
     * 
     */
    @InputImport(name="nestedResourceTypeFirst", required=true)
      private final String nestedResourceTypeFirst;

    public String getNestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    /**
     * The second child resource type.
     * 
     */
    @InputImport(name="nestedResourceTypeSecond", required=true)
      private final String nestedResourceTypeSecond;

    public String getNestedResourceTypeSecond() {
        return this.nestedResourceTypeSecond;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
      private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @InputImport(name="sku", required=true)
      private final String sku;

    public String getSku() {
        return this.sku;
    }

    public GetSkusNestedResourceTypeSecondArgs(
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String providerNamespace,
        String resourceType,
        String sku) {
        this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
        this.nestedResourceTypeSecond = Objects.requireNonNull(nestedResourceTypeSecond, "expected parameter 'nestedResourceTypeSecond' to be non-null");
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GetSkusNestedResourceTypeSecondArgs() {
        this.nestedResourceTypeFirst = null;
        this.nestedResourceTypeSecond = null;
        this.providerNamespace = null;
        this.resourceType = null;
        this.sku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSkusNestedResourceTypeSecondArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nestedResourceTypeFirst;
        private String nestedResourceTypeSecond;
        private String providerNamespace;
        private String resourceType;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSkusNestedResourceTypeSecondArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nestedResourceTypeFirst = defaults.nestedResourceTypeFirst;
    	      this.nestedResourceTypeSecond = defaults.nestedResourceTypeSecond;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
        }

        public Builder setNestedResourceTypeFirst(String nestedResourceTypeFirst) {
            this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst);
            return this;
        }

        public Builder setNestedResourceTypeSecond(String nestedResourceTypeSecond) {
            this.nestedResourceTypeSecond = Objects.requireNonNull(nestedResourceTypeSecond);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public GetSkusNestedResourceTypeSecondArgs build() {
            return new GetSkusNestedResourceTypeSecondArgs(nestedResourceTypeFirst, nestedResourceTypeSecond, providerNamespace, resourceType, sku);
        }
    }
}