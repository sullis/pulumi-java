// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionRoleConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network function template.
 * 
 */
public final class NetworkFunctionTemplateResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkFunctionTemplateResponse Empty = new NetworkFunctionTemplateResponse();

    /**
     * An array of network function role definitions.
     * 
     */
    @Import(name="networkFunctionRoleConfigurations")
    private @Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations;

    /**
     * @return An array of network function role definitions.
     * 
     */
    public Optional<List<NetworkFunctionRoleConfigurationResponse>> networkFunctionRoleConfigurations() {
        return Optional.ofNullable(this.networkFunctionRoleConfigurations);
    }

    private NetworkFunctionTemplateResponse() {}

    private NetworkFunctionTemplateResponse(NetworkFunctionTemplateResponse $) {
        this.networkFunctionRoleConfigurations = $.networkFunctionRoleConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkFunctionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkFunctionTemplateResponse $;

        public Builder() {
            $ = new NetworkFunctionTemplateResponse();
        }

        public Builder(NetworkFunctionTemplateResponse defaults) {
            $ = new NetworkFunctionTemplateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkFunctionRoleConfigurations An array of network function role definitions.
         * 
         * @return builder
         * 
         */
        public Builder networkFunctionRoleConfigurations(@Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations) {
            $.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
            return this;
        }

        /**
         * @param networkFunctionRoleConfigurations An array of network function role definitions.
         * 
         * @return builder
         * 
         */
        public Builder networkFunctionRoleConfigurations(NetworkFunctionRoleConfigurationResponse... networkFunctionRoleConfigurations) {
            return networkFunctionRoleConfigurations(List.of(networkFunctionRoleConfigurations));
        }

        public NetworkFunctionTemplateResponse build() {
            return $;
        }
    }

}
