// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opsworkscm.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    @InputImport(name="serverName", required=true)
    private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetServerArgs(String serverName) {
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetServerArgs() {
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverName = defaults.serverName;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public GetServerArgs build() {
            return new GetServerArgs(serverName);
        }
    }
}
