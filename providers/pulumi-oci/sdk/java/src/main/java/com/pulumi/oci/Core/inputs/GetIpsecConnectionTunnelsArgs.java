// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetIpsecConnectionTunnelsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpsecConnectionTunnelsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpsecConnectionTunnelsArgs Empty = new GetIpsecConnectionTunnelsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetIpsecConnectionTunnelsFilterArgs>> filters;

    public Optional<Output<List<GetIpsecConnectionTunnelsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
     * 
     */
    @Import(name="ipsecId", required=true)
    private Output<String> ipsecId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
     * 
     */
    public Output<String> ipsecId() {
        return this.ipsecId;
    }

    private GetIpsecConnectionTunnelsArgs() {}

    private GetIpsecConnectionTunnelsArgs(GetIpsecConnectionTunnelsArgs $) {
        this.filters = $.filters;
        this.ipsecId = $.ipsecId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpsecConnectionTunnelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpsecConnectionTunnelsArgs $;

        public Builder() {
            $ = new GetIpsecConnectionTunnelsArgs();
        }

        public Builder(GetIpsecConnectionTunnelsArgs defaults) {
            $ = new GetIpsecConnectionTunnelsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetIpsecConnectionTunnelsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetIpsecConnectionTunnelsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetIpsecConnectionTunnelsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ipsecId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
         * 
         * @return builder
         * 
         */
        public Builder ipsecId(Output<String> ipsecId) {
            $.ipsecId = ipsecId;
            return this;
        }

        /**
         * @param ipsecId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
         * 
         * @return builder
         * 
         */
        public Builder ipsecId(String ipsecId) {
            return ipsecId(Output.of(ipsecId));
        }

        public GetIpsecConnectionTunnelsArgs build() {
            $.ipsecId = Objects.requireNonNull($.ipsecId, "expected parameter 'ipsecId' to be non-null");
            return $;
        }
    }

}
