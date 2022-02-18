// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorHttpConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorIcmpConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorSuccessThresholdResponse;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorTcpConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a connection monitor test configuration.
 * 
 */
public final class ConnectionMonitorTestConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorTestConfigurationResponse Empty = new ConnectionMonitorTestConfigurationResponse();

    /**
     * The parameters used to perform test evaluation over HTTP.
     * 
     */
    @InputImport(name="httpConfiguration")
    private final @Nullable ConnectionMonitorHttpConfigurationResponse httpConfiguration;

    public Optional<ConnectionMonitorHttpConfigurationResponse> getHttpConfiguration() {
        return this.httpConfiguration == null ? Optional.empty() : Optional.ofNullable(this.httpConfiguration);
    }

    /**
     * The parameters used to perform test evaluation over ICMP.
     * 
     */
    @InputImport(name="icmpConfiguration")
    private final @Nullable ConnectionMonitorIcmpConfigurationResponse icmpConfiguration;

    public Optional<ConnectionMonitorIcmpConfigurationResponse> getIcmpConfiguration() {
        return this.icmpConfiguration == null ? Optional.empty() : Optional.ofNullable(this.icmpConfiguration);
    }

    /**
     * The name of the connection monitor test configuration.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters.
     * 
     */
    @InputImport(name="preferredIPVersion")
    private final @Nullable String preferredIPVersion;

    public Optional<String> getPreferredIPVersion() {
        return this.preferredIPVersion == null ? Optional.empty() : Optional.ofNullable(this.preferredIPVersion);
    }

    /**
     * The protocol to use in test evaluation.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The threshold for declaring a test successful.
     * 
     */
    @InputImport(name="successThreshold")
    private final @Nullable ConnectionMonitorSuccessThresholdResponse successThreshold;

    public Optional<ConnectionMonitorSuccessThresholdResponse> getSuccessThreshold() {
        return this.successThreshold == null ? Optional.empty() : Optional.ofNullable(this.successThreshold);
    }

    /**
     * The parameters used to perform test evaluation over TCP.
     * 
     */
    @InputImport(name="tcpConfiguration")
    private final @Nullable ConnectionMonitorTcpConfigurationResponse tcpConfiguration;

    public Optional<ConnectionMonitorTcpConfigurationResponse> getTcpConfiguration() {
        return this.tcpConfiguration == null ? Optional.empty() : Optional.ofNullable(this.tcpConfiguration);
    }

    /**
     * The frequency of test evaluation, in seconds.
     * 
     */
    @InputImport(name="testFrequencySec")
    private final @Nullable Integer testFrequencySec;

    public Optional<Integer> getTestFrequencySec() {
        return this.testFrequencySec == null ? Optional.empty() : Optional.ofNullable(this.testFrequencySec);
    }

    public ConnectionMonitorTestConfigurationResponse(
        @Nullable ConnectionMonitorHttpConfigurationResponse httpConfiguration,
        @Nullable ConnectionMonitorIcmpConfigurationResponse icmpConfiguration,
        String name,
        @Nullable String preferredIPVersion,
        String protocol,
        @Nullable ConnectionMonitorSuccessThresholdResponse successThreshold,
        @Nullable ConnectionMonitorTcpConfigurationResponse tcpConfiguration,
        @Nullable Integer testFrequencySec) {
        this.httpConfiguration = httpConfiguration;
        this.icmpConfiguration = icmpConfiguration;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.preferredIPVersion = preferredIPVersion;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.successThreshold = successThreshold;
        this.tcpConfiguration = tcpConfiguration;
        this.testFrequencySec = testFrequencySec;
    }

    private ConnectionMonitorTestConfigurationResponse() {
        this.httpConfiguration = null;
        this.icmpConfiguration = null;
        this.name = null;
        this.preferredIPVersion = null;
        this.protocol = null;
        this.successThreshold = null;
        this.tcpConfiguration = null;
        this.testFrequencySec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTestConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionMonitorHttpConfigurationResponse httpConfiguration;
        private @Nullable ConnectionMonitorIcmpConfigurationResponse icmpConfiguration;
        private String name;
        private @Nullable String preferredIPVersion;
        private String protocol;
        private @Nullable ConnectionMonitorSuccessThresholdResponse successThreshold;
        private @Nullable ConnectionMonitorTcpConfigurationResponse tcpConfiguration;
        private @Nullable Integer testFrequencySec;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTestConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpConfiguration = defaults.httpConfiguration;
    	      this.icmpConfiguration = defaults.icmpConfiguration;
    	      this.name = defaults.name;
    	      this.preferredIPVersion = defaults.preferredIPVersion;
    	      this.protocol = defaults.protocol;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpConfiguration = defaults.tcpConfiguration;
    	      this.testFrequencySec = defaults.testFrequencySec;
        }

        public Builder setHttpConfiguration(@Nullable ConnectionMonitorHttpConfigurationResponse httpConfiguration) {
            this.httpConfiguration = httpConfiguration;
            return this;
        }

        public Builder setIcmpConfiguration(@Nullable ConnectionMonitorIcmpConfigurationResponse icmpConfiguration) {
            this.icmpConfiguration = icmpConfiguration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPreferredIPVersion(@Nullable String preferredIPVersion) {
            this.preferredIPVersion = preferredIPVersion;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSuccessThreshold(@Nullable ConnectionMonitorSuccessThresholdResponse successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTcpConfiguration(@Nullable ConnectionMonitorTcpConfigurationResponse tcpConfiguration) {
            this.tcpConfiguration = tcpConfiguration;
            return this;
        }

        public Builder setTestFrequencySec(@Nullable Integer testFrequencySec) {
            this.testFrequencySec = testFrequencySec;
            return this;
        }

        public ConnectionMonitorTestConfigurationResponse build() {
            return new ConnectionMonitorTestConfigurationResponse(httpConfiguration, icmpConfiguration, name, preferredIPVersion, protocol, successThreshold, tcpConfiguration, testFrequencySec);
        }
    }
}
