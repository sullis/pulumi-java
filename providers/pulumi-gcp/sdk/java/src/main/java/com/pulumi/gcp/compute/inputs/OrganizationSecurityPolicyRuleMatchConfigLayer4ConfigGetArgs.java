// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs Empty = new OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs();

    /**
     * The IP protocol to which this rule applies. The protocol
     * type is required when creating a firewall rule.
     * This value can either be one of the following well
     * known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp),
     * or the IP protocol number.
     * 
     */
    @Import(name="ipProtocol", required=true)
    private Output<String> ipProtocol;

    /**
     * @return The IP protocol to which this rule applies. The protocol
     * type is required when creating a firewall rule.
     * This value can either be one of the following well
     * known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp),
     * or the IP protocol number.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field
     * is only applicable for UDP or TCP protocol. Each entry must be
     * either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     * Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and
     * [&#34;12345-12349&#34;].
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<String>> ports;

    /**
     * @return An optional list of ports to which this rule applies. This field
     * is only applicable for UDP or TCP protocol. Each entry must be
     * either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     * Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and
     * [&#34;12345-12349&#34;].
     * 
     */
    public Optional<Output<List<String>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs() {}

    private OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs(OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs $) {
        this.ipProtocol = $.ipProtocol;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs $;

        public Builder() {
            $ = new OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs();
        }

        public Builder(OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs defaults) {
            $ = new OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipProtocol The IP protocol to which this rule applies. The protocol
         * type is required when creating a firewall rule.
         * This value can either be one of the following well
         * known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp),
         * or the IP protocol number.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The IP protocol to which this rule applies. The protocol
         * type is required when creating a firewall rule.
         * This value can either be one of the following well
         * known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp),
         * or the IP protocol number.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param ports An optional list of ports to which this rule applies. This field
         * is only applicable for UDP or TCP protocol. Each entry must be
         * either an integer or a range. If not specified, this rule
         * applies to connections through any port.
         * Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and
         * [&#34;12345-12349&#34;].
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<String>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports An optional list of ports to which this rule applies. This field
         * is only applicable for UDP or TCP protocol. Each entry must be
         * either an integer or a range. If not specified, this rule
         * applies to connections through any port.
         * Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and
         * [&#34;12345-12349&#34;].
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports An optional list of ports to which this rule applies. This field
         * is only applicable for UDP or TCP protocol. Each entry must be
         * either an integer or a range. If not specified, this rule
         * applies to connections through any port.
         * Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and
         * [&#34;12345-12349&#34;].
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        public OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs build() {
            $.ipProtocol = Objects.requireNonNull($.ipProtocol, "expected parameter 'ipProtocol' to be non-null");
            return $;
        }
    }

}
