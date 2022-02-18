// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ACL for a private endpoint
 * 
 */
public final class PrivateEndpointACLResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointACLResponse Empty = new PrivateEndpointACLResponse();

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @InputImport(name="allow")
    private final @Nullable List<String> allow;

    public List<String> getAllow() {
        return this.allow == null ? List.of() : this.allow;
    }

    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @InputImport(name="deny")
    private final @Nullable List<String> deny;

    public List<String> getDeny() {
        return this.deny == null ? List.of() : this.deny;
    }

    /**
     * Name of the private endpoint connection
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public PrivateEndpointACLResponse(
        @Nullable List<String> allow,
        @Nullable List<String> deny,
        String name) {
        this.allow = allow;
        this.deny = deny;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PrivateEndpointACLResponse() {
        this.allow = List.of();
        this.deny = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointACLResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allow;
        private @Nullable List<String> deny;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointACLResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.name = defaults.name;
        }

        public Builder setAllow(@Nullable List<String> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setDeny(@Nullable List<String> deny) {
            this.deny = deny;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public PrivateEndpointACLResponse build() {
            return new PrivateEndpointACLResponse(allow, deny, name);
        }
    }
}
