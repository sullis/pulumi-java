// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inbound NAT rule of the load balancer.
 * 
 */
public final class InboundNatRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final InboundNatRuleResponse Empty = new InboundNatRuleResponse();

    /**
     * A reference to a private IP address defined on a network interface of a VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     * 
     */
    @Import(name="backendIPConfiguration", required=true)
    private NetworkInterfaceIPConfigurationResponse backendIPConfiguration;

    /**
     * @return A reference to a private IP address defined on a network interface of a VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     * 
     */
    public NetworkInterfaceIPConfigurationResponse backendIPConfiguration() {
        return this.backendIPConfiguration;
    }

    /**
     * The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Integer backendPort;

    /**
     * @return The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    public Optional<Integer> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
    private @Nullable Boolean enableFloatingIP;

    /**
     * @return Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    public Optional<Boolean> enableFloatingIP() {
        return Optional.ofNullable(this.enableFloatingIP);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Boolean enableTcpReset;

    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Boolean> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
    private @Nullable SubResourceResponse frontendIPConfiguration;

    /**
     * @return A reference to frontend IP addresses.
     * 
     */
    public Optional<SubResourceResponse> frontendIPConfiguration() {
        return Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Integer frontendPort;

    /**
     * @return The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    public Optional<Integer> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Integer idleTimeoutInMinutes;

    /**
     * @return The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol")
    private @Nullable String protocol;

    /**
     * @return The reference to the transport protocol used by the load balancing rule.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The provisioning state of the inbound NAT rule resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the inbound NAT rule resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    private InboundNatRuleResponse() {}

    private InboundNatRuleResponse(InboundNatRuleResponse $) {
        this.backendIPConfiguration = $.backendIPConfiguration;
        this.backendPort = $.backendPort;
        this.enableFloatingIP = $.enableFloatingIP;
        this.enableTcpReset = $.enableTcpReset;
        this.etag = $.etag;
        this.frontendIPConfiguration = $.frontendIPConfiguration;
        this.frontendPort = $.frontendPort;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.name = $.name;
        this.protocol = $.protocol;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundNatRuleResponse $;

        public Builder() {
            $ = new InboundNatRuleResponse();
        }

        public Builder(InboundNatRuleResponse defaults) {
            $ = new InboundNatRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendIPConfiguration A reference to a private IP address defined on a network interface of a VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
         * 
         * @return builder
         * 
         */
        public Builder backendIPConfiguration(NetworkInterfaceIPConfigurationResponse backendIPConfiguration) {
            $.backendIPConfiguration = backendIPConfiguration;
            return this;
        }

        /**
         * @param backendPort The port used for the internal endpoint. Acceptable values range from 1 to 65535.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(@Nullable Integer backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param enableFloatingIP Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            $.enableFloatingIP = enableFloatingIP;
            return this;
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param frontendIPConfiguration A reference to frontend IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            $.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        /**
         * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(@Nullable Integer frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param protocol The reference to the transport protocol used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable String protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the inbound NAT rule resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param type Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public InboundNatRuleResponse build() {
            $.backendIPConfiguration = Objects.requireNonNull($.backendIPConfiguration, "expected parameter 'backendIPConfiguration' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
