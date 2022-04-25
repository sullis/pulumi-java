// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HTTPHealthCheckResponse {
    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    private final String host;
    /**
     * @return The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    private final Integer port;
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    private final String portName;
    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    private final String portSpecification;
    /**
     * @return Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    private final String proxyHeader;
    /**
     * @return The request path of the HTTP health check request. The default value is /.
     * 
     */
    private final String requestPath;
    /**
     * @return The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    private final String response;

    @CustomType.Constructor
    private HTTPHealthCheckResponse(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("portSpecification") String portSpecification,
        @CustomType.Parameter("proxyHeader") String proxyHeader,
        @CustomType.Parameter("requestPath") String requestPath,
        @CustomType.Parameter("response") String response) {
        this.host = host;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.requestPath = requestPath;
        this.response = response;
    }

    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public String portName() {
        return this.portName;
    }
    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP health check follows behavior specified in port and portName fields.
     * 
     */
    public String portSpecification() {
        return this.portSpecification;
    }
    /**
     * @return Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    public String proxyHeader() {
        return this.proxyHeader;
    }
    /**
     * @return The request path of the HTTP health check request. The default value is /.
     * 
     */
    public String requestPath() {
        return this.requestPath;
    }
    /**
     * @return The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    public String response() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String requestPath;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder portSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }
        public Builder proxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }
        public Builder requestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public HTTPHealthCheckResponse build() {
            return new HTTPHealthCheckResponse(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
