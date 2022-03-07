// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UDPHealthCheckResponse {
    /**
     * The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
     */
    private final Integer port;
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    private final String portName;
    /**
     * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
     */
    private final String request;
    /**
     * The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
     */
    private final String response;

    @OutputCustomType.Constructor({"port","portName","request","response"})
    private UDPHealthCheckResponse(
        Integer port,
        String portName,
        String request,
        String response) {
        this.port = Objects.requireNonNull(port);
        this.portName = Objects.requireNonNull(portName);
        this.request = Objects.requireNonNull(request);
        this.response = Objects.requireNonNull(response);
    }

    /**
     * The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
    */
    public String getPortName() {
        return this.portName;
    }
    /**
     * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
    */
    public String getRequest() {
        return this.request;
    }
    /**
     * The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
    */
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UDPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(UDPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setResponse(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }
        public UDPHealthCheckResponse build() {
            return new UDPHealthCheckResponse(port, portName, request, response);
        }
    }
}