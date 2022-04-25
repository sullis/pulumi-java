// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Web Application Firewall policy for each host (if applicable)
 * 
 */
public final class FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs Empty = new FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs() {}

    private FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs(FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs $;

        public Builder() {
            $ = new FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs();
        }

        public Builder(FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
            $ = new FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs build() {
            return $;
        }
    }

}
