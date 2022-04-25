// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSkusNestedResourceTypeFirstArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSkusNestedResourceTypeFirstArgs Empty = new GetSkusNestedResourceTypeFirstArgs();

    /**
     * The first child resource type.
     * 
     */
    @Import(name="nestedResourceTypeFirst", required=true)
    private String nestedResourceTypeFirst;

    /**
     * @return The first child resource type.
     * 
     */
    public String nestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private String providerNamespace;

    /**
     * @return The name of the resource provider hosted within ProviderHub.
     * 
     */
    public String providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return The resource type.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @Import(name="sku", required=true)
    private String sku;

    /**
     * @return The SKU.
     * 
     */
    public String sku() {
        return this.sku;
    }

    private GetSkusNestedResourceTypeFirstArgs() {}

    private GetSkusNestedResourceTypeFirstArgs(GetSkusNestedResourceTypeFirstArgs $) {
        this.nestedResourceTypeFirst = $.nestedResourceTypeFirst;
        this.providerNamespace = $.providerNamespace;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSkusNestedResourceTypeFirstArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSkusNestedResourceTypeFirstArgs $;

        public Builder() {
            $ = new GetSkusNestedResourceTypeFirstArgs();
        }

        public Builder(GetSkusNestedResourceTypeFirstArgs defaults) {
            $ = new GetSkusNestedResourceTypeFirstArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nestedResourceTypeFirst The first child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeFirst(String nestedResourceTypeFirst) {
            $.nestedResourceTypeFirst = nestedResourceTypeFirst;
            return this;
        }

        /**
         * @param providerNamespace The name of the resource provider hosted within ProviderHub.
         * 
         * @return builder
         * 
         */
        public Builder providerNamespace(String providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        /**
         * @param resourceType The resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param sku The SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            $.sku = sku;
            return this;
        }

        public GetSkusNestedResourceTypeFirstArgs build() {
            $.nestedResourceTypeFirst = Objects.requireNonNull($.nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
