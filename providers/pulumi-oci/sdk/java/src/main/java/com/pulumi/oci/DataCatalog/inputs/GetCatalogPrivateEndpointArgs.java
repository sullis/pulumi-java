// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCatalogPrivateEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogPrivateEndpointArgs Empty = new GetCatalogPrivateEndpointArgs();

    /**
     * Unique private reverse connection identifier.
     * 
     */
    @Import(name="catalogPrivateEndpointId", required=true)
    private Output<String> catalogPrivateEndpointId;

    /**
     * @return Unique private reverse connection identifier.
     * 
     */
    public Output<String> catalogPrivateEndpointId() {
        return this.catalogPrivateEndpointId;
    }

    private GetCatalogPrivateEndpointArgs() {}

    private GetCatalogPrivateEndpointArgs(GetCatalogPrivateEndpointArgs $) {
        this.catalogPrivateEndpointId = $.catalogPrivateEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogPrivateEndpointArgs $;

        public Builder() {
            $ = new GetCatalogPrivateEndpointArgs();
        }

        public Builder(GetCatalogPrivateEndpointArgs defaults) {
            $ = new GetCatalogPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogPrivateEndpointId Unique private reverse connection identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogPrivateEndpointId(Output<String> catalogPrivateEndpointId) {
            $.catalogPrivateEndpointId = catalogPrivateEndpointId;
            return this;
        }

        /**
         * @param catalogPrivateEndpointId Unique private reverse connection identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogPrivateEndpointId(String catalogPrivateEndpointId) {
            return catalogPrivateEndpointId(Output.of(catalogPrivateEndpointId));
        }

        public GetCatalogPrivateEndpointArgs build() {
            $.catalogPrivateEndpointId = Objects.requireNonNull($.catalogPrivateEndpointId, "expected parameter 'catalogPrivateEndpointId' to be non-null");
            return $;
        }
    }

}
