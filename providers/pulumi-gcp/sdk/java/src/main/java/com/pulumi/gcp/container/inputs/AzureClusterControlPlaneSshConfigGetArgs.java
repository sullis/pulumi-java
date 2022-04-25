// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneSshConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneSshConfigGetArgs Empty = new AzureClusterControlPlaneSshConfigGetArgs();

    /**
     * Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    @Import(name="authorizedKey", required=true)
    private Output<String> authorizedKey;

    /**
     * @return Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    public Output<String> authorizedKey() {
        return this.authorizedKey;
    }

    private AzureClusterControlPlaneSshConfigGetArgs() {}

    private AzureClusterControlPlaneSshConfigGetArgs(AzureClusterControlPlaneSshConfigGetArgs $) {
        this.authorizedKey = $.authorizedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterControlPlaneSshConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterControlPlaneSshConfigGetArgs $;

        public Builder() {
            $ = new AzureClusterControlPlaneSshConfigGetArgs();
        }

        public Builder(AzureClusterControlPlaneSshConfigGetArgs defaults) {
            $ = new AzureClusterControlPlaneSshConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedKey Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
         * 
         * @return builder
         * 
         */
        public Builder authorizedKey(Output<String> authorizedKey) {
            $.authorizedKey = authorizedKey;
            return this;
        }

        /**
         * @param authorizedKey Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
         * 
         * @return builder
         * 
         */
        public Builder authorizedKey(String authorizedKey) {
            return authorizedKey(Output.of(authorizedKey));
        }

        public AzureClusterControlPlaneSshConfigGetArgs build() {
            $.authorizedKey = Objects.requireNonNull($.authorizedKey, "expected parameter 'authorizedKey' to be non-null");
            return $;
        }
    }

}
