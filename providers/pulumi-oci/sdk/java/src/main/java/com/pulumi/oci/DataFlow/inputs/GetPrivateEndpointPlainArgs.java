// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointPlainArgs Empty = new GetPrivateEndpointPlainArgs();

    /**
     * The unique ID for a private endpoint.
     * 
     */
    @Import(name="privateEndpointId", required=true)
    private String privateEndpointId;

    /**
     * @return The unique ID for a private endpoint.
     * 
     */
    public String privateEndpointId() {
        return this.privateEndpointId;
    }

    private GetPrivateEndpointPlainArgs() {}

    private GetPrivateEndpointPlainArgs(GetPrivateEndpointPlainArgs $) {
        this.privateEndpointId = $.privateEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointPlainArgs $;

        public Builder() {
            $ = new GetPrivateEndpointPlainArgs();
        }

        public Builder(GetPrivateEndpointPlainArgs defaults) {
            $ = new GetPrivateEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointId The unique ID for a private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointId(String privateEndpointId) {
            $.privateEndpointId = privateEndpointId;
            return this;
        }

        public GetPrivateEndpointPlainArgs build() {
            $.privateEndpointId = Objects.requireNonNull($.privateEndpointId, "expected parameter 'privateEndpointId' to be non-null");
            return $;
        }
    }

}
