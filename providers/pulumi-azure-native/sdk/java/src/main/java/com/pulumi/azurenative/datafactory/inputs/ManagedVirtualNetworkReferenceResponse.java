// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Managed Virtual Network reference type.
 * 
 */
public final class ManagedVirtualNetworkReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedVirtualNetworkReferenceResponse Empty = new ManagedVirtualNetworkReferenceResponse();

    /**
     * Reference ManagedVirtualNetwork name.
     * 
     */
    @Import(name="referenceName", required=true)
    private String referenceName;

    /**
     * @return Reference ManagedVirtualNetwork name.
     * 
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Managed Virtual Network reference type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Managed Virtual Network reference type.
     * 
     */
    public String type() {
        return this.type;
    }

    private ManagedVirtualNetworkReferenceResponse() {}

    private ManagedVirtualNetworkReferenceResponse(ManagedVirtualNetworkReferenceResponse $) {
        this.referenceName = $.referenceName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedVirtualNetworkReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedVirtualNetworkReferenceResponse $;

        public Builder() {
            $ = new ManagedVirtualNetworkReferenceResponse();
        }

        public Builder(ManagedVirtualNetworkReferenceResponse defaults) {
            $ = new ManagedVirtualNetworkReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param referenceName Reference ManagedVirtualNetwork name.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(String referenceName) {
            $.referenceName = referenceName;
            return this;
        }

        /**
         * @param type Managed Virtual Network reference type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ManagedVirtualNetworkReferenceResponse build() {
            $.referenceName = Objects.requireNonNull($.referenceName, "expected parameter 'referenceName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
