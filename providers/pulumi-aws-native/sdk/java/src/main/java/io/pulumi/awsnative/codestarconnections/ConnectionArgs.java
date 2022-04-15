// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarconnections;

import io.pulumi.awsnative.codestarconnections.inputs.ConnectionTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The name of the connection. Connection names must be unique in an AWS user account.
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> connectionName() {
        return this.connectionName == null ? Codegen.empty() : this.connectionName;
    }

    /**
     * The host arn configured to represent the infrastructure where your third-party provider is installed. You must specify either a ProviderType or a HostArn.
     * 
     */
    @Import(name="hostArn")
      private final @Nullable Output<String> hostArn;

    public Output<String> hostArn() {
        return this.hostArn == null ? Codegen.empty() : this.hostArn;
    }

    /**
     * The name of the external provider where your third-party code repository is configured. You must specify either a ProviderType or a HostArn.
     * 
     */
    @Import(name="providerType")
      private final @Nullable Output<String> providerType;

    public Output<String> providerType() {
        return this.providerType == null ? Codegen.empty() : this.providerType;
    }

    /**
     * Specifies the tags applied to a connection.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ConnectionTagArgs>> tags;

    public Output<List<ConnectionTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ConnectionArgs(
        @Nullable Output<String> connectionName,
        @Nullable Output<String> hostArn,
        @Nullable Output<String> providerType,
        @Nullable Output<List<ConnectionTagArgs>> tags) {
        this.connectionName = connectionName;
        this.hostArn = hostArn;
        this.providerType = providerType;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.connectionName = Codegen.empty();
        this.hostArn = Codegen.empty();
        this.providerType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectionName;
        private @Nullable Output<String> hostArn;
        private @Nullable Output<String> providerType;
        private @Nullable Output<List<ConnectionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.hostArn = defaults.hostArn;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Codegen.ofNullable(connectionName);
            return this;
        }
        public Builder hostArn(@Nullable Output<String> hostArn) {
            this.hostArn = hostArn;
            return this;
        }
        public Builder hostArn(@Nullable String hostArn) {
            this.hostArn = Codegen.ofNullable(hostArn);
            return this;
        }
        public Builder providerType(@Nullable Output<String> providerType) {
            this.providerType = providerType;
            return this;
        }
        public Builder providerType(@Nullable String providerType) {
            this.providerType = Codegen.ofNullable(providerType);
            return this;
        }
        public Builder tags(@Nullable Output<List<ConnectionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ConnectionTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ConnectionTagArgs... tags) {
            return tags(List.of(tags));
        }        public ConnectionArgs build() {
            return new ConnectionArgs(connectionName, hostArn, providerType, tags);
        }
    }
}
