// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorHttpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorIcmpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorSuccessThresholdResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorTcpConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorTestConfigurationResponse {
    /**
     * The parameters used to perform test evaluation over HTTP.
     * 
     */
    private final @Nullable ConnectionMonitorHttpConfigurationResponse httpConfiguration;
    /**
     * The parameters used to perform test evaluation over ICMP.
     * 
     */
    private final @Nullable ConnectionMonitorIcmpConfigurationResponse icmpConfiguration;
    /**
     * The name of the connection monitor test configuration.
     * 
     */
    private final String name;
    /**
     * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters.
     * 
     */
    private final @Nullable String preferredIPVersion;
    /**
     * The protocol to use in test evaluation.
     * 
     */
    private final String protocol;
    /**
     * The threshold for declaring a test successful.
     * 
     */
    private final @Nullable ConnectionMonitorSuccessThresholdResponse successThreshold;
    /**
     * The parameters used to perform test evaluation over TCP.
     * 
     */
    private final @Nullable ConnectionMonitorTcpConfigurationResponse tcpConfiguration;
    /**
     * The frequency of test evaluation, in seconds.
     * 
     */
    private final @Nullable Integer testFrequencySec;

    @OutputCustomType.Constructor({"httpConfiguration","icmpConfiguration","name","preferredIPVersion","protocol","successThreshold","tcpConfiguration","testFrequencySec"})
    private ConnectionMonitorTestConfigurationResponse(
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
        this.name = Objects.requireNonNull(name);
        this.preferredIPVersion = preferredIPVersion;
        this.protocol = Objects.requireNonNull(protocol);
        this.successThreshold = successThreshold;
        this.tcpConfiguration = tcpConfiguration;
        this.testFrequencySec = testFrequencySec;
    }

    /**
     * The parameters used to perform test evaluation over HTTP.
     * 
     */
    public Optional<ConnectionMonitorHttpConfigurationResponse> getHttpConfiguration() {
        return Optional.ofNullable(this.httpConfiguration);
    }
    /**
     * The parameters used to perform test evaluation over ICMP.
     * 
     */
    public Optional<ConnectionMonitorIcmpConfigurationResponse> getIcmpConfiguration() {
        return Optional.ofNullable(this.icmpConfiguration);
    }
    /**
     * The name of the connection monitor test configuration.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters.
     * 
     */
    public Optional<String> getPreferredIPVersion() {
        return Optional.ofNullable(this.preferredIPVersion);
    }
    /**
     * The protocol to use in test evaluation.
     * 
     */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The threshold for declaring a test successful.
     * 
     */
    public Optional<ConnectionMonitorSuccessThresholdResponse> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * The parameters used to perform test evaluation over TCP.
     * 
     */
    public Optional<ConnectionMonitorTcpConfigurationResponse> getTcpConfiguration() {
        return Optional.ofNullable(this.tcpConfiguration);
    }
    /**
     * The frequency of test evaluation, in seconds.
     * 
     */
    public Optional<Integer> getTestFrequencySec() {
        return Optional.ofNullable(this.testFrequencySec);
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
