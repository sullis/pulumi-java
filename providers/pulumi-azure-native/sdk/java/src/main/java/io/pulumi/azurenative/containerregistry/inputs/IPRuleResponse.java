// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP rule with specific IP or IP range in CIDR format.
 * 
 */
public final class IPRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPRuleResponse Empty = new IPRuleResponse();

    /**
     * The action of IP ACL rule.
     * 
     */
    @InputImport(name="action")
    private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    @InputImport(name="iPAddressOrRange", required=true)
    private final String iPAddressOrRange;

    public String getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    public IPRuleResponse(
        @Nullable String action,
        String iPAddressOrRange) {
        this.action = action == null ? "Allow" : action;
        this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange, "expected parameter 'iPAddressOrRange' to be non-null");
    }

    private IPRuleResponse() {
        this.action = null;
        this.iPAddressOrRange = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String iPAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setIPAddressOrRange(String iPAddressOrRange) {
            this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
            return this;
        }

        public IPRuleResponse build() {
            return new IPRuleResponse(action, iPAddressOrRange);
        }
    }
}
