// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.HTTPHealthCheckPortSpecification;
import com.pulumi.googlenative.compute_v1.enums.HTTPHealthCheckProxyHeader;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HTTPHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HTTPHealthCheckArgs Empty = new HTTPHealthCheckArgs();

    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
    private @Nullable Output<String> portName;

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public Optional<Output<String>> portName() {
        return Optional.ofNullable(this.portName);
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification")
    private @Nullable Output<HTTPHealthCheckPortSpecification> portSpecification;

    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    public Optional<Output<HTTPHealthCheckPortSpecification>> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader")
    private @Nullable Output<HTTPHealthCheckProxyHeader> proxyHeader;

    /**
     * @return Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    public Optional<Output<HTTPHealthCheckProxyHeader>> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }

    /**
     * The request path of the HTTP health check request. The default value is /.
     * 
     */
    @Import(name="requestPath")
    private @Nullable Output<String> requestPath;

    /**
     * @return The request path of the HTTP health check request. The default value is /.
     * 
     */
    public Optional<Output<String>> requestPath() {
        return Optional.ofNullable(this.requestPath);
    }

    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    @Import(name="response")
    private @Nullable Output<String> response;

    /**
     * @return The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    public Optional<Output<String>> response() {
        return Optional.ofNullable(this.response);
    }

    private HTTPHealthCheckArgs() {}

    private HTTPHealthCheckArgs(HTTPHealthCheckArgs $) {
        this.host = $.host;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
        this.proxyHeader = $.proxyHeader;
        this.requestPath = $.requestPath;
        this.response = $.response;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HTTPHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HTTPHealthCheckArgs $;

        public Builder() {
            $ = new HTTPHealthCheckArgs();
        }

        public Builder(HTTPHealthCheckArgs defaults) {
            $ = new HTTPHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(@Nullable Output<String> portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            return portName(Output.of(portName));
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(@Nullable Output<HTTPHealthCheckPortSpecification> portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(HTTPHealthCheckPortSpecification portSpecification) {
            return portSpecification(Output.of(portSpecification));
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(@Nullable Output<HTTPHealthCheckProxyHeader> proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(HTTPHealthCheckProxyHeader proxyHeader) {
            return proxyHeader(Output.of(proxyHeader));
        }

        /**
         * @param requestPath The request path of the HTTP health check request. The default value is /.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(@Nullable Output<String> requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        /**
         * @param requestPath The request path of the HTTP health check request. The default value is /.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(String requestPath) {
            return requestPath(Output.of(requestPath));
        }

        /**
         * @param response The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(@Nullable Output<String> response) {
            $.response = response;
            return this;
        }

        /**
         * @param response The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(String response) {
            return response(Output.of(response));
        }

        public HTTPHealthCheckArgs build() {
            return $;
        }
    }

}
