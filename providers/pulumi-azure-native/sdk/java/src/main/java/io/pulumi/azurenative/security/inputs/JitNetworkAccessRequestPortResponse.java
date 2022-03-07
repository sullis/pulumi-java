// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessRequestPortResponse extends io.pulumi.resources.InvokeArgs {

    public static final JitNetworkAccessRequestPortResponse Empty = new JitNetworkAccessRequestPortResponse();

    /**
     * Mutually exclusive with the "allowedSourceAddressPrefixes" parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     * 
     */
    @InputImport(name="allowedSourceAddressPrefix")
      private final @Nullable String allowedSourceAddressPrefix;

    public Optional<String> getAllowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.allowedSourceAddressPrefix);
    }

    /**
     * Mutually exclusive with the "allowedSourceAddressPrefix" parameter.
     * 
     */
    @InputImport(name="allowedSourceAddressPrefixes")
      private final @Nullable List<String> allowedSourceAddressPrefixes;

    public List<String> getAllowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes == null ? List.of() : this.allowedSourceAddressPrefixes;
    }

    /**
     * The date & time at which the request ends in UTC
     * 
     */
    @InputImport(name="endTimeUtc", required=true)
      private final String endTimeUtc;

    public String getEndTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * The port which is mapped to this port's `number` in the Azure Firewall, if applicable
     * 
     */
    @InputImport(name="mappedPort")
      private final @Nullable Integer mappedPort;

    public Optional<Integer> getMappedPort() {
        return this.mappedPort == null ? Optional.empty() : Optional.ofNullable(this.mappedPort);
    }

    @InputImport(name="number", required=true)
      private final Integer number;

    public Integer getNumber() {
        return this.number;
    }

    /**
     * The status of the port
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * A description of why the `status` has its value
     * 
     */
    @InputImport(name="statusReason", required=true)
      private final String statusReason;

    public String getStatusReason() {
        return this.statusReason;
    }

    public JitNetworkAccessRequestPortResponse(
        @Nullable String allowedSourceAddressPrefix,
        @Nullable List<String> allowedSourceAddressPrefixes,
        String endTimeUtc,
        @Nullable Integer mappedPort,
        Integer number,
        String status,
        String statusReason) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc, "expected parameter 'endTimeUtc' to be non-null");
        this.mappedPort = mappedPort;
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusReason = Objects.requireNonNull(statusReason, "expected parameter 'statusReason' to be non-null");
    }

    private JitNetworkAccessRequestPortResponse() {
        this.allowedSourceAddressPrefix = null;
        this.allowedSourceAddressPrefixes = List.of();
        this.endTimeUtc = null;
        this.mappedPort = null;
        this.number = null;
        this.status = null;
        this.statusReason = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedSourceAddressPrefix;
        private @Nullable List<String> allowedSourceAddressPrefixes;
        private String endTimeUtc;
        private @Nullable Integer mappedPort;
        private Integer number;
        private String status;
        private String statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSourceAddressPrefix = defaults.allowedSourceAddressPrefix;
    	      this.allowedSourceAddressPrefixes = defaults.allowedSourceAddressPrefixes;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.mappedPort = defaults.mappedPort;
    	      this.number = defaults.number;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder setAllowedSourceAddressPrefix(@Nullable String allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }

        public Builder setAllowedSourceAddressPrefixes(@Nullable List<String> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }

        public Builder setEndTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }

        public Builder setMappedPort(@Nullable Integer mappedPort) {
            this.mappedPort = mappedPort;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public JitNetworkAccessRequestPortResponse build() {
            return new JitNetworkAccessRequestPortResponse(allowedSourceAddressPrefix, allowedSourceAddressPrefixes, endTimeUtc, mappedPort, number, status, statusReason);
        }
    }
}