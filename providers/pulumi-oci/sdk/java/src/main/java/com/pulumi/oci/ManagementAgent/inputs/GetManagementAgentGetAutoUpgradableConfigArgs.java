// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementAgent.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementAgentGetAutoUpgradableConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementAgentGetAutoUpgradableConfigArgs Empty = new GetManagementAgentGetAutoUpgradableConfigArgs();

    /**
     * The OCID of the compartment to which a request will be scoped.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment to which a request will be scoped.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    private GetManagementAgentGetAutoUpgradableConfigArgs() {}

    private GetManagementAgentGetAutoUpgradableConfigArgs(GetManagementAgentGetAutoUpgradableConfigArgs $) {
        this.compartmentId = $.compartmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementAgentGetAutoUpgradableConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementAgentGetAutoUpgradableConfigArgs $;

        public Builder() {
            $ = new GetManagementAgentGetAutoUpgradableConfigArgs();
        }

        public Builder(GetManagementAgentGetAutoUpgradableConfigArgs defaults) {
            $ = new GetManagementAgentGetAutoUpgradableConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment to which a request will be scoped.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment to which a request will be scoped.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public GetManagementAgentGetAutoUpgradableConfigArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
