// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * E2A Network Mapping fabric specific settings.
 * 
 */
public final class VmmToAzureNetworkMappingSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmmToAzureNetworkMappingSettingsResponse Empty = new VmmToAzureNetworkMappingSettingsResponse();

    /**
     * Gets the Instance type.
     * Expected value is &#39;VmmToAzure&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
    private String instanceType;

    /**
     * @return Gets the Instance type.
     * Expected value is &#39;VmmToAzure&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }

    private VmmToAzureNetworkMappingSettingsResponse() {}

    private VmmToAzureNetworkMappingSettingsResponse(VmmToAzureNetworkMappingSettingsResponse $) {
        this.instanceType = $.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmmToAzureNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmmToAzureNetworkMappingSettingsResponse $;

        public Builder() {
            $ = new VmmToAzureNetworkMappingSettingsResponse();
        }

        public Builder(VmmToAzureNetworkMappingSettingsResponse defaults) {
            $ = new VmmToAzureNetworkMappingSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType Gets the Instance type.
         * Expected value is &#39;VmmToAzure&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public VmmToAzureNetworkMappingSettingsResponse build() {
            $.instanceType = Codegen.stringProp("instanceType").arg($.instanceType).require();
            return $;
        }
    }

}
