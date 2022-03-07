// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network ACL
 * 
 */
public final class NetworkACLResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkACLResponse Empty = new NetworkACLResponse();

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

    public NetworkACLResponse(
        @Nullable List<String> allow,
        @Nullable List<String> deny) {
        this.allow = allow;
        this.deny = deny;
    }

    private NetworkACLResponse() {
        this.allow = List.of();
        this.deny = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkACLResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allow;
        private @Nullable List<String> deny;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkACLResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
        }

        public Builder setAllow(@Nullable List<String> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setDeny(@Nullable List<String> deny) {
            this.deny = deny;
            return this;
        }
        public NetworkACLResponse build() {
            return new NetworkACLResponse(allow, deny);
        }
    }
}