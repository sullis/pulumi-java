// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class HTTPHealthCheckResponse extends com.pulumi.resources.InvokeArgs {

    public static final HTTPHealthCheckResponse Empty = new HTTPHealthCheckResponse();

    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host", required=true)
    private String host;

    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    public String host() {
        return this.host;
    }

    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName", required=true)
    private String portName;

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public String portName() {
        return this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification", required=true)
    private String portSpecification;

    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    public String portSpecification() {
        return this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader", required=true)
    private String proxyHeader;

    /**
     * @return Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    public String proxyHeader() {
        return this.proxyHeader;
    }

    /**
     * The request path of the HTTP health check request. The default value is /.
     * 
     */
    @Import(name="requestPath", required=true)
    private String requestPath;

    /**
     * @return The request path of the HTTP health check request. The default value is /.
     * 
     */
    public String requestPath() {
        return this.requestPath;
    }

    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    @Import(name="response", required=true)
    private String response;

    /**
     * @return The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    public String response() {
        return this.response;
    }

    /**
     * Weight report mode. used for weighted Load Balancing.
     * 
     */
    @Import(name="weightReportMode", required=true)
    private String weightReportMode;

    /**
     * @return Weight report mode. used for weighted Load Balancing.
     * 
     */
    public String weightReportMode() {
        return this.weightReportMode;
    }

    private HTTPHealthCheckResponse() {}

    private HTTPHealthCheckResponse(HTTPHealthCheckResponse $) {
        this.host = $.host;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
        this.proxyHeader = $.proxyHeader;
        this.requestPath = $.requestPath;
        this.response = $.response;
        this.weightReportMode = $.weightReportMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HTTPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HTTPHealthCheckResponse $;

        public Builder() {
            $ = new HTTPHealthCheckResponse();
        }

        public Builder(HTTPHealthCheckResponse defaults) {
            $ = new HTTPHealthCheckResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            $.host = host;
            return this;
        }

        /**
         * @param port The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(String portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(String proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        /**
         * @param requestPath The request path of the HTTP health check request. The default value is /.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(String requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        /**
         * @param response The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(String response) {
            $.response = response;
            return this;
        }

        /**
         * @param weightReportMode Weight report mode. used for weighted Load Balancing.
         * 
         * @return builder
         * 
         */
        public Builder weightReportMode(String weightReportMode) {
            $.weightReportMode = weightReportMode;
            return this;
        }

        public HTTPHealthCheckResponse build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.portName = Objects.requireNonNull($.portName, "expected parameter 'portName' to be non-null");
            $.portSpecification = Objects.requireNonNull($.portSpecification, "expected parameter 'portSpecification' to be non-null");
            $.proxyHeader = Objects.requireNonNull($.proxyHeader, "expected parameter 'proxyHeader' to be non-null");
            $.requestPath = Objects.requireNonNull($.requestPath, "expected parameter 'requestPath' to be non-null");
            $.response = Objects.requireNonNull($.response, "expected parameter 'response' to be non-null");
            $.weightReportMode = Objects.requireNonNull($.weightReportMode, "expected parameter 'weightReportMode' to be non-null");
            return $;
        }
    }

}
