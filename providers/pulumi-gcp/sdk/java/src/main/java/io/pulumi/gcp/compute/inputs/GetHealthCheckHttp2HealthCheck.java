// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetHealthCheckHttp2HealthCheck extends io.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckHttp2HealthCheck Empty = new GetHealthCheckHttp2HealthCheck();

    @Import(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    @Import(name="portName", required=true)
      private final String portName;

    public String getPortName() {
        return this.portName;
    }

    @Import(name="portSpecification", required=true)
      private final String portSpecification;

    public String getPortSpecification() {
        return this.portSpecification;
    }

    @Import(name="proxyHeader", required=true)
      private final String proxyHeader;

    public String getProxyHeader() {
        return this.proxyHeader;
    }

    @Import(name="requestPath", required=true)
      private final String requestPath;

    public String getRequestPath() {
        return this.requestPath;
    }

    @Import(name="response", required=true)
      private final String response;

    public String getResponse() {
        return this.response;
    }

    public GetHealthCheckHttp2HealthCheck(
        String host,
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String requestPath,
        String response) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
        this.proxyHeader = Objects.requireNonNull(proxyHeader, "expected parameter 'proxyHeader' to be non-null");
        this.requestPath = Objects.requireNonNull(requestPath, "expected parameter 'requestPath' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private GetHealthCheckHttp2HealthCheck() {
        this.host = null;
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
        this.proxyHeader = null;
        this.requestPath = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckHttp2HealthCheck defaults) {
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

        public Builder(GetHealthCheckHttp2HealthCheck defaults) {
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
        }        public GetHealthCheckHttp2HealthCheck build() {
            return new GetHealthCheckHttp2HealthCheck(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
