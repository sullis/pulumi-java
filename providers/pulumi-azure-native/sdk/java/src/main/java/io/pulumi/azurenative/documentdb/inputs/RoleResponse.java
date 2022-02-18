// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of roles permitted through this Role Definition.
 * 
 */
public final class RoleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoleResponse Empty = new RoleResponse();

    /**
     * The database name the role is applied.
     * 
     */
    @InputImport(name="db")
    private final @Nullable String db;

    public Optional<String> getDb() {
        return this.db == null ? Optional.empty() : Optional.ofNullable(this.db);
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="role")
    private final @Nullable String role;

    public Optional<String> getRole() {
        return this.role == null ? Optional.empty() : Optional.ofNullable(this.role);
    }

    public RoleResponse(
        @Nullable String db,
        @Nullable String role) {
        this.db = db;
        this.role = role;
    }

    private RoleResponse() {
        this.db = null;
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String db;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.db = defaults.db;
    	      this.role = defaults.role;
        }

        public Builder setDb(@Nullable String db) {
            this.db = db;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public RoleResponse build() {
            return new RoleResponse(db, role);
        }
    }
}
