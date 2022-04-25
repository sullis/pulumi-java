// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The public IP Address configuration of the networking configuration of a Pool.
 * 
 */
public final class PublicIPAddressConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final PublicIPAddressConfigurationResponse Empty = new PublicIPAddressConfigurationResponse();

    /**
     * The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     * 
     */
    @Import(name="ipAddressIds")
    private @Nullable List<String> ipAddressIds;

    /**
     * @return The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     * 
     */
    public Optional<List<String>> ipAddressIds() {
        return Optional.ofNullable(this.ipAddressIds);
    }

    /**
     * The default value is BatchManaged
     * 
     */
    @Import(name="provision")
    private @Nullable String provision;

    /**
     * @return The default value is BatchManaged
     * 
     */
    public Optional<String> provision() {
        return Optional.ofNullable(this.provision);
    }

    private PublicIPAddressConfigurationResponse() {}

    private PublicIPAddressConfigurationResponse(PublicIPAddressConfigurationResponse $) {
        this.ipAddressIds = $.ipAddressIds;
        this.provision = $.provision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIPAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIPAddressConfigurationResponse $;

        public Builder() {
            $ = new PublicIPAddressConfigurationResponse();
        }

        public Builder(PublicIPAddressConfigurationResponse defaults) {
            $ = new PublicIPAddressConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddressIds The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressIds(@Nullable List<String> ipAddressIds) {
            $.ipAddressIds = ipAddressIds;
            return this;
        }

        /**
         * @param ipAddressIds The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressIds(String... ipAddressIds) {
            return ipAddressIds(List.of(ipAddressIds));
        }

        /**
         * @param provision The default value is BatchManaged
         * 
         * @return builder
         * 
         */
        public Builder provision(@Nullable String provision) {
            $.provision = provision;
            return this;
        }

        public PublicIPAddressConfigurationResponse build() {
            return $;
        }
    }

}
