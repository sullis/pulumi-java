// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 * 
 * Note: While Pulumi automatically encrypts the 'data' and 'stringData'
 * fields, this encryption only applies to Pulumi's context, including the state file,
 * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
 * and the contents are visible to users with access to the Secret in Kubernetes using
 * tools like 'kubectl'.
 * 
 * For more information on securing Kubernetes Secrets, see the following links:
 * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
 * https://kubernetes.io/docs/concepts/configuration/secret/#risks
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    @Import(name="data")
      private final @Nullable Output<Map<String,String>> data;

    public Output<Map<String,String>> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    @Import(name="immutable")
      private final @Nullable Output<Boolean> immutable;

    public Output<Boolean> getImmutable() {
        return this.immutable == null ? Output.empty() : this.immutable;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    @Import(name="stringData")
      private final @Nullable Output<Map<String,String>> stringData;

    public Output<Map<String,String>> getStringData() {
        return this.stringData == null ? Output.empty() : this.stringData;
    }

    /**
     * Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public SecretArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<Map<String,String>> data,
        @Nullable Output<Boolean> immutable,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<Map<String,String>> stringData,
        @Nullable Output<String> type) {
        this.apiVersion = apiVersion;
        this.data = data;
        this.immutable = immutable;
        this.kind = kind;
        this.metadata = metadata;
        this.stringData = stringData;
        this.type = type;
    }

    private SecretArgs() {
        this.apiVersion = Output.empty();
        this.data = Output.empty();
        this.immutable = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.stringData = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<Map<String,String>> data;
        private @Nullable Output<Boolean> immutable;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<Map<String,String>> stringData;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.data = defaults.data;
    	      this.immutable = defaults.immutable;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.stringData = defaults.stringData;
    	      this.type = defaults.type;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder data(@Nullable Output<Map<String,String>> data) {
            this.data = Output.ofNullable(data).asSecret();
            return this;
        }
        public Builder data(@Nullable Map<String,String> data) {
            this.data = Output.ofNullable(data).asSecret();
            return this;
        }
        public Builder immutable(@Nullable Output<Boolean> immutable) {
            this.immutable = immutable;
            return this;
        }
        public Builder immutable(@Nullable Boolean immutable) {
            this.immutable = Output.ofNullable(immutable);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder stringData(@Nullable Output<Map<String,String>> stringData) {
            this.stringData = Output.ofNullable(stringData).asSecret();
            return this;
        }
        public Builder stringData(@Nullable Map<String,String> stringData) {
            this.stringData = Output.ofNullable(stringData).asSecret();
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(apiVersion, data, immutable, kind, metadata, stringData, type);
        }
    }
}
