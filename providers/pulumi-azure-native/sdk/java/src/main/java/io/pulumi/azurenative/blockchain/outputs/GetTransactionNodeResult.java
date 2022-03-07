// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransactionNodeResult {
    /**
     * Gets or sets the transaction node dns endpoint.
     * 
     */
    private final String dns;
    /**
     * Gets or sets the firewall rules.
     * 
     */
    private final @Nullable List<FirewallRuleResponse> firewallRules;
    /**
     * Fully qualified resource Id of the resource.
     * 
     */
    private final String id;
    /**
     * Gets or sets the transaction node location.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
     */
    private final @Nullable String password;
    /**
     * Gets or sets the blockchain member provision state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the transaction node public key.
     * 
     */
    private final String publicKey;
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    private final String type;
    /**
     * Gets or sets the transaction node dns endpoint basic auth user name.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"dns","firewallRules","id","location","name","password","provisioningState","publicKey","type","userName"})
    private GetTransactionNodeResult(
        String dns,
        @Nullable List<FirewallRuleResponse> firewallRules,
        String id,
        @Nullable String location,
        String name,
        @Nullable String password,
        String provisioningState,
        String publicKey,
        String type,
        String userName) {
        this.dns = Objects.requireNonNull(dns);
        this.firewallRules = firewallRules;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.password = password;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicKey = Objects.requireNonNull(publicKey);
        this.type = Objects.requireNonNull(type);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Gets or sets the transaction node dns endpoint.
     * 
    */
    public String getDns() {
        return this.dns;
    }
    /**
     * Gets or sets the firewall rules.
     * 
    */
    public List<FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }
    /**
     * Fully qualified resource Id of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the transaction node location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Gets or sets the blockchain member provision state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the transaction node public key.
     * 
    */
    public String getPublicKey() {
        return this.publicKey;
    }
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets the transaction node dns endpoint basic auth user name.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransactionNodeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dns;
        private @Nullable List<FirewallRuleResponse> firewallRules;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String password;
        private String provisioningState;
        private String publicKey;
        private String type;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransactionNodeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.firewallRules = defaults.firewallRules;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setDns(String dns) {
            this.dns = Objects.requireNonNull(dns);
            return this;
        }

        public Builder setFirewallRules(@Nullable List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetTransactionNodeResult build() {
            return new GetTransactionNodeResult(dns, firewallRules, id, location, name, password, provisioningState, publicKey, type, userName);
        }
    }
}