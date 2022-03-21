// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessPortRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final JitNetworkAccessPortRuleResponse Empty = new JitNetworkAccessPortRuleResponse();

    /**
     * Mutually exclusive with the "allowedSourceAddressPrefixes" parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     * 
     */
    @Import(name="allowedSourceAddressPrefix")
      private final @Nullable String allowedSourceAddressPrefix;

    public Optional<String> getAllowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.allowedSourceAddressPrefix);
    }

    /**
     * Mutually exclusive with the "allowedSourceAddressPrefix" parameter.
     * 
     */
    @Import(name="allowedSourceAddressPrefixes")
      private final @Nullable List<String> allowedSourceAddressPrefixes;

    public List<String> getAllowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes == null ? List.of() : this.allowedSourceAddressPrefixes;
    }

    /**
     * Maximum duration requests can be made for. In ISO 8601 duration format. Minimum 5 minutes, maximum 1 day
     * 
     */
    @Import(name="maxRequestAccessDuration", required=true)
      private final String maxRequestAccessDuration;

    public String getMaxRequestAccessDuration() {
        return this.maxRequestAccessDuration;
    }

    @Import(name="number", required=true)
      private final Integer number;

    public Integer getNumber() {
        return this.number;
    }

    @Import(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    public JitNetworkAccessPortRuleResponse(
        @Nullable String allowedSourceAddressPrefix,
        @Nullable List<String> allowedSourceAddressPrefixes,
        String maxRequestAccessDuration,
        Integer number,
        String protocol) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        this.maxRequestAccessDuration = Objects.requireNonNull(maxRequestAccessDuration, "expected parameter 'maxRequestAccessDuration' to be non-null");
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private JitNetworkAccessPortRuleResponse() {
        this.allowedSourceAddressPrefix = null;
        this.allowedSourceAddressPrefixes = List.of();
        this.maxRequestAccessDuration = null;
        this.number = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessPortRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedSourceAddressPrefix;
        private @Nullable List<String> allowedSourceAddressPrefixes;
        private String maxRequestAccessDuration;
        private Integer number;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessPortRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSourceAddressPrefix = defaults.allowedSourceAddressPrefix;
    	      this.allowedSourceAddressPrefixes = defaults.allowedSourceAddressPrefixes;
    	      this.maxRequestAccessDuration = defaults.maxRequestAccessDuration;
    	      this.number = defaults.number;
    	      this.protocol = defaults.protocol;
        }

        public Builder allowedSourceAddressPrefix(@Nullable String allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }
        public Builder allowedSourceAddressPrefixes(@Nullable List<String> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }
        public Builder allowedSourceAddressPrefixes(String... allowedSourceAddressPrefixes) {
            return allowedSourceAddressPrefixes(List.of(allowedSourceAddressPrefixes));
        }
        public Builder maxRequestAccessDuration(String maxRequestAccessDuration) {
            this.maxRequestAccessDuration = Objects.requireNonNull(maxRequestAccessDuration);
            return this;
        }
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public JitNetworkAccessPortRuleResponse build() {
            return new JitNetworkAccessPortRuleResponse(allowedSourceAddressPrefix, allowedSourceAddressPrefixes, maxRequestAccessDuration, number, protocol);
        }
    }
}
