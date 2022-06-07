// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVaultUsageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVaultUsageArgs Empty = new GetVaultUsageArgs();

    /**
     * The OCID of the vault.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return The OCID of the vault.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private GetVaultUsageArgs() {}

    private GetVaultUsageArgs(GetVaultUsageArgs $) {
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVaultUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVaultUsageArgs $;

        public Builder() {
            $ = new GetVaultUsageArgs();
        }

        public Builder(GetVaultUsageArgs defaults) {
            $ = new GetVaultUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vaultId The OCID of the vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The OCID of the vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public GetVaultUsageArgs build() {
            $.vaultId = Objects.requireNonNull($.vaultId, "expected parameter 'vaultId' to be non-null");
            return $;
        }
    }

}
