// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ApplicationGatewayProtocol;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayProbeHealthResponseMatch;
import com.pulumi.azurenative.network.inputs.SubResource;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationGatewayBackendHealthOnDemandArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationGatewayBackendHealthOnDemandArgs Empty = new GetApplicationGatewayBackendHealthOnDemandArgs();

    /**
     * The name of the application gateway.
     * 
     */
    @Import(name="applicationGatewayName", required=true)
    private String applicationGatewayName;

    /**
     * @return The name of the application gateway.
     * 
     */
    public String applicationGatewayName() {
        return this.applicationGatewayName;
    }

    /**
     * Reference to backend pool of application gateway to which probe request will be sent.
     * 
     */
    @Import(name="backendAddressPool")
    private @Nullable SubResource backendAddressPool;

    /**
     * @return Reference to backend pool of application gateway to which probe request will be sent.
     * 
     */
    public Optional<SubResource> backendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }

    /**
     * Reference to backend http setting of application gateway to be used for test probe.
     * 
     */
    @Import(name="backendHttpSettings")
    private @Nullable SubResource backendHttpSettings;

    /**
     * @return Reference to backend http setting of application gateway to be used for test probe.
     * 
     */
    public Optional<SubResource> backendHttpSettings() {
        return Optional.ofNullable(this.backendHttpSettings);
    }

    /**
     * Expands BackendAddressPool and BackendHttpSettings referenced in backend health.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Expands BackendAddressPool and BackendHttpSettings referenced in backend health.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Host name to send the probe to.
     * 
     */
    @Import(name="host")
    private @Nullable String host;

    /**
     * @return Host name to send the probe to.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Criterion for classifying a healthy probe response.
     * 
     */
    @Import(name="match")
    private @Nullable ApplicationGatewayProbeHealthResponseMatch match;

    /**
     * @return Criterion for classifying a healthy probe response.
     * 
     */
    public Optional<ApplicationGatewayProbeHealthResponseMatch> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Relative path of probe. Valid path starts from &#39;/&#39;. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return Relative path of probe. Valid path starts from &#39;/&#39;. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Whether the host header should be picked from the backend http settings. Default value is false.
     * 
     */
    @Import(name="pickHostNameFromBackendHttpSettings")
    private @Nullable Boolean pickHostNameFromBackendHttpSettings;

    /**
     * @return Whether the host header should be picked from the backend http settings. Default value is false.
     * 
     */
    public Optional<Boolean> pickHostNameFromBackendHttpSettings() {
        return Optional.ofNullable(this.pickHostNameFromBackendHttpSettings);
    }

    /**
     * The protocol used for the probe.
     * 
     */
    @Import(name="protocol")
    private @Nullable Either<String,ApplicationGatewayProtocol> protocol;

    /**
     * @return The protocol used for the probe.
     * 
     */
    public Optional<Either<String,ApplicationGatewayProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Integer timeout;

    /**
     * @return The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private GetApplicationGatewayBackendHealthOnDemandArgs() {}

    private GetApplicationGatewayBackendHealthOnDemandArgs(GetApplicationGatewayBackendHealthOnDemandArgs $) {
        this.applicationGatewayName = $.applicationGatewayName;
        this.backendAddressPool = $.backendAddressPool;
        this.backendHttpSettings = $.backendHttpSettings;
        this.expand = $.expand;
        this.host = $.host;
        this.match = $.match;
        this.path = $.path;
        this.pickHostNameFromBackendHttpSettings = $.pickHostNameFromBackendHttpSettings;
        this.protocol = $.protocol;
        this.resourceGroupName = $.resourceGroupName;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationGatewayBackendHealthOnDemandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationGatewayBackendHealthOnDemandArgs $;

        public Builder() {
            $ = new GetApplicationGatewayBackendHealthOnDemandArgs();
        }

        public Builder(GetApplicationGatewayBackendHealthOnDemandArgs defaults) {
            $ = new GetApplicationGatewayBackendHealthOnDemandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayName The name of the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayName(String applicationGatewayName) {
            $.applicationGatewayName = applicationGatewayName;
            return this;
        }

        /**
         * @param backendAddressPool Reference to backend pool of application gateway to which probe request will be sent.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPool(@Nullable SubResource backendAddressPool) {
            $.backendAddressPool = backendAddressPool;
            return this;
        }

        /**
         * @param backendHttpSettings Reference to backend http setting of application gateway to be used for test probe.
         * 
         * @return builder
         * 
         */
        public Builder backendHttpSettings(@Nullable SubResource backendHttpSettings) {
            $.backendHttpSettings = backendHttpSettings;
            return this;
        }

        /**
         * @param expand Expands BackendAddressPool and BackendHttpSettings referenced in backend health.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param host Host name to send the probe to.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable String host) {
            $.host = host;
            return this;
        }

        /**
         * @param match Criterion for classifying a healthy probe response.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable ApplicationGatewayProbeHealthResponseMatch match) {
            $.match = match;
            return this;
        }

        /**
         * @param path Relative path of probe. Valid path starts from &#39;/&#39;. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param pickHostNameFromBackendHttpSettings Whether the host header should be picked from the backend http settings. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder pickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            $.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }

        /**
         * @param protocol The protocol used for the probe.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Either<String,ApplicationGatewayProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used for the probe.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The protocol used for the probe.
         * 
         * @return builder
         * 
         */
        public Builder protocol(ApplicationGatewayProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param timeout The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Integer timeout) {
            $.timeout = timeout;
            return this;
        }

        public GetApplicationGatewayBackendHealthOnDemandArgs build() {
            $.applicationGatewayName = Objects.requireNonNull($.applicationGatewayName, "expected parameter 'applicationGatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
