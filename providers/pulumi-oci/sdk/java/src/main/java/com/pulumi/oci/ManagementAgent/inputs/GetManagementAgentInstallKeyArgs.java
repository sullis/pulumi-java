// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementAgent.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementAgentInstallKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementAgentInstallKeyArgs Empty = new GetManagementAgentInstallKeyArgs();

    /**
     * Unique Management Agent Install Key identifier
     * 
     */
    @Import(name="managementAgentInstallKeyId", required=true)
    private Output<String> managementAgentInstallKeyId;

    /**
     * @return Unique Management Agent Install Key identifier
     * 
     */
    public Output<String> managementAgentInstallKeyId() {
        return this.managementAgentInstallKeyId;
    }

    private GetManagementAgentInstallKeyArgs() {}

    private GetManagementAgentInstallKeyArgs(GetManagementAgentInstallKeyArgs $) {
        this.managementAgentInstallKeyId = $.managementAgentInstallKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementAgentInstallKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementAgentInstallKeyArgs $;

        public Builder() {
            $ = new GetManagementAgentInstallKeyArgs();
        }

        public Builder(GetManagementAgentInstallKeyArgs defaults) {
            $ = new GetManagementAgentInstallKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementAgentInstallKeyId Unique Management Agent Install Key identifier
         * 
         * @return builder
         * 
         */
        public Builder managementAgentInstallKeyId(Output<String> managementAgentInstallKeyId) {
            $.managementAgentInstallKeyId = managementAgentInstallKeyId;
            return this;
        }

        /**
         * @param managementAgentInstallKeyId Unique Management Agent Install Key identifier
         * 
         * @return builder
         * 
         */
        public Builder managementAgentInstallKeyId(String managementAgentInstallKeyId) {
            return managementAgentInstallKeyId(Output.of(managementAgentInstallKeyId));
        }

        public GetManagementAgentInstallKeyArgs build() {
            $.managementAgentInstallKeyId = Objects.requireNonNull($.managementAgentInstallKeyId, "expected parameter 'managementAgentInstallKeyId' to be non-null");
            return $;
        }
    }

}
