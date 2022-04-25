// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayClientAuthConfigurationResponse;
import com.pulumi.azurenative.network.inputs.ApplicationGatewaySslPolicyResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL profile of an application gateway.
 * 
 */
public final class ApplicationGatewaySslProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewaySslProfileResponse Empty = new ApplicationGatewaySslProfileResponse();

    /**
     * Client authentication configuration of the application gateway resource.
     * 
     */
    @Import(name="clientAuthConfiguration")
    private @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration;

    /**
     * @return Client authentication configuration of the application gateway resource.
     * 
     */
    public Optional<ApplicationGatewayClientAuthConfigurationResponse> clientAuthConfiguration() {
        return Optional.ofNullable(this.clientAuthConfiguration);
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
     * Name of the SSL profile that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the SSL profile that is unique within an Application Gateway.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the HTTP listener resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the HTTP listener resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * SSL policy of the application gateway resource.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;

    /**
     * @return SSL policy of the application gateway resource.
     * 
     */
    public Optional<ApplicationGatewaySslPolicyResponse> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    /**
     * Array of references to application gateway trusted client certificates.
     * 
     */
    @Import(name="trustedClientCertificates")
    private @Nullable List<SubResourceResponse> trustedClientCertificates;

    /**
     * @return Array of references to application gateway trusted client certificates.
     * 
     */
    public Optional<List<SubResourceResponse>> trustedClientCertificates() {
        return Optional.ofNullable(this.trustedClientCertificates);
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

    private ApplicationGatewaySslProfileResponse() {}

    private ApplicationGatewaySslProfileResponse(ApplicationGatewaySslProfileResponse $) {
        this.clientAuthConfiguration = $.clientAuthConfiguration;
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.sslPolicy = $.sslPolicy;
        this.trustedClientCertificates = $.trustedClientCertificates;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewaySslProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewaySslProfileResponse $;

        public Builder() {
            $ = new ApplicationGatewaySslProfileResponse();
        }

        public Builder(ApplicationGatewaySslProfileResponse defaults) {
            $ = new ApplicationGatewaySslProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientAuthConfiguration Client authentication configuration of the application gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder clientAuthConfiguration(@Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration) {
            $.clientAuthConfiguration = clientAuthConfiguration;
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
         * @param name Name of the SSL profile that is unique within an Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the HTTP listener resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param sslPolicy SSL policy of the application gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder sslPolicy(@Nullable ApplicationGatewaySslPolicyResponse sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        /**
         * @param trustedClientCertificates Array of references to application gateway trusted client certificates.
         * 
         * @return builder
         * 
         */
        public Builder trustedClientCertificates(@Nullable List<SubResourceResponse> trustedClientCertificates) {
            $.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        /**
         * @param trustedClientCertificates Array of references to application gateway trusted client certificates.
         * 
         * @return builder
         * 
         */
        public Builder trustedClientCertificates(SubResourceResponse... trustedClientCertificates) {
            return trustedClientCertificates(List.of(trustedClientCertificates));
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

        public ApplicationGatewaySslProfileResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
