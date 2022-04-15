// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * ARN of the connection.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Name of the connection.
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> connectionName() {
        return this.connectionName == null ? Codegen.empty() : this.connectionName;
    }

    /**
     * The source repository provider. Valid values: `GITHUB`.
     * 
     */
    @Import(name="providerType")
      private final @Nullable Output<String> providerType;

    public Output<String> providerType() {
        return this.providerType == null ? Codegen.empty() : this.providerType;
    }

    /**
     * The current state of the App Runner connection. When the state is `AVAILABLE`, you can use the connection to create an `aws.apprunner.Service` resource.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ConnectionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> connectionName,
        @Nullable Output<String> providerType,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.connectionName = connectionName;
        this.providerType = providerType;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ConnectionState() {
        this.arn = Codegen.empty();
        this.connectionName = Codegen.empty();
        this.providerType = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> connectionName;
        private @Nullable Output<String> providerType;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionName = defaults.connectionName;
    	      this.providerType = defaults.providerType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Codegen.ofNullable(connectionName);
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
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ConnectionState build() {
            return new ConnectionState(arn, connectionName, providerType, status, tags, tagsAll);
        }
    }
}
