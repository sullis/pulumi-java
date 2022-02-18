// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SecurityRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkSecurityGroup resource.
 * 
 */
public final class NetworkSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityGroupArgs Empty = new NetworkSecurityGroupArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A collection of security rules of the network security group.
     * 
     */
    @InputImport(name="securityRules")
    private final @Nullable Input<List<SecurityRuleArgs>> securityRules;

    public Input<List<SecurityRuleArgs>> getSecurityRules() {
        return this.securityRules == null ? Input.empty() : this.securityRules;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NetworkSecurityGroupArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<List<SecurityRuleArgs>> securityRules,
        @Nullable Input<Map<String,String>> tags) {
        this.id = id;
        this.location = location;
        this.securityRules = securityRules;
        this.tags = tags;
    }

    private NetworkSecurityGroupArgs() {
        this.id = Input.empty();
        this.location = Input.empty();
        this.securityRules = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<List<SecurityRuleArgs>> securityRules;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.securityRules = defaults.securityRules;
    	      this.tags = defaults.tags;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setSecurityRules(@Nullable Input<List<SecurityRuleArgs>> securityRules) {
            this.securityRules = securityRules;
            return this;
        }

        public Builder setSecurityRules(@Nullable List<SecurityRuleArgs> securityRules) {
            this.securityRules = Input.ofNullable(securityRules);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public NetworkSecurityGroupArgs build() {
            return new NetworkSecurityGroupArgs(id, location, securityRules, tags);
        }
    }
}
