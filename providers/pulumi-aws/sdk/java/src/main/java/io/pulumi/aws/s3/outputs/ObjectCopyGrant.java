// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectCopyGrant {
    /**
     * Email address of the grantee. Used only when `type` is `AmazonCustomerByEmail`.
     * 
     */
    private final @Nullable String email;
    /**
     * The canonical user ID of the grantee. Used only when `type` is `CanonicalUser`.
     * 
     */
    private final @Nullable String id;
    /**
     * List of permissions to grant to grantee. Valid values are `READ`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
     */
    private final List<String> permissions;
    /**
     * - Type of grantee. Valid values are `CanonicalUser`, `Group`, and `AmazonCustomerByEmail`.
     * 
     */
    private final String type;
    /**
     * URI of the grantee group. Used only when `type` is `Group`.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"email","id","permissions","type","uri"})
    private ObjectCopyGrant(
        @Nullable String email,
        @Nullable String id,
        List<String> permissions,
        String type,
        @Nullable String uri) {
        this.email = email;
        this.id = id;
        this.permissions = Objects.requireNonNull(permissions);
        this.type = Objects.requireNonNull(type);
        this.uri = uri;
    }

    /**
     * Email address of the grantee. Used only when `type` is `AmazonCustomerByEmail`.
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The canonical user ID of the grantee. Used only when `type` is `CanonicalUser`.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * List of permissions to grant to grantee. Valid values are `READ`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
    */
    public List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * - Type of grantee. Valid values are `CanonicalUser`, `Group`, and `AmazonCustomerByEmail`.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * URI of the grantee group. Used only when `type` is `Group`.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectCopyGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String id;
        private List<String> permissions;
        private String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectCopyGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public ObjectCopyGrant build() {
            return new ObjectCopyGrant(email, id, permissions, type, uri);
        }
    }
}