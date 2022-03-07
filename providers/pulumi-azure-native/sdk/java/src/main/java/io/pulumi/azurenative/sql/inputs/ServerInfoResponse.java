// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Server info for the server trust group.
 * 
 */
public final class ServerInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerInfoResponse Empty = new ServerInfoResponse();

    /**
     * Server Id.
     * 
     */
    @InputImport(name="serverId", required=true)
      private final String serverId;

    public String getServerId() {
        return this.serverId;
    }

    public ServerInfoResponse(String serverId) {
        this.serverId = Objects.requireNonNull(serverId, "expected parameter 'serverId' to be non-null");
    }

    private ServerInfoResponse() {
        this.serverId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverId = defaults.serverId;
        }

        public Builder setServerId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        public ServerInfoResponse build() {
            return new ServerInfoResponse(serverId);
        }
    }
}