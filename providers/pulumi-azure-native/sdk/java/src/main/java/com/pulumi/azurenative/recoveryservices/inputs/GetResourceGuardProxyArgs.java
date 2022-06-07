// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceGuardProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceGuardProxyArgs Empty = new GetResourceGuardProxyArgs();

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="resourceGuardProxyName", required=true)
    private Output<String> resourceGuardProxyName;

    public Output<String> resourceGuardProxyName() {
        return this.resourceGuardProxyName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private GetResourceGuardProxyArgs() {}

    private GetResourceGuardProxyArgs(GetResourceGuardProxyArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceGuardProxyName = $.resourceGuardProxyName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceGuardProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceGuardProxyArgs $;

        public Builder() {
            $ = new GetResourceGuardProxyArgs();
        }

        public Builder(GetResourceGuardProxyArgs defaults) {
            $ = new GetResourceGuardProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceGuardProxyName(Output<String> resourceGuardProxyName) {
            $.resourceGuardProxyName = resourceGuardProxyName;
            return this;
        }

        public Builder resourceGuardProxyName(String resourceGuardProxyName) {
            return resourceGuardProxyName(Output.of(resourceGuardProxyName));
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public GetResourceGuardProxyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceGuardProxyName = Objects.requireNonNull($.resourceGuardProxyName, "expected parameter 'resourceGuardProxyName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
