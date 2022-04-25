// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the policy to be used for placement of a Service Fabric service.
 * 
 */
public final class ServicePlacementPolicyDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicePlacementPolicyDescriptionResponse Empty = new ServicePlacementPolicyDescriptionResponse();

    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    public String type() {
        return this.type;
    }

    private ServicePlacementPolicyDescriptionResponse() {}

    private ServicePlacementPolicyDescriptionResponse(ServicePlacementPolicyDescriptionResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePlacementPolicyDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePlacementPolicyDescriptionResponse $;

        public Builder() {
            $ = new ServicePlacementPolicyDescriptionResponse();
        }

        public Builder(ServicePlacementPolicyDescriptionResponse defaults) {
            $ = new ServicePlacementPolicyDescriptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of placement policy for a service fabric service. Following are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ServicePlacementPolicyDescriptionResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
