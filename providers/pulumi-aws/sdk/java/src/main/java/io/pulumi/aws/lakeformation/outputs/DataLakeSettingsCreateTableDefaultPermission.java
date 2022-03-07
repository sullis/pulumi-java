// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataLakeSettingsCreateTableDefaultPermission {
    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    private final @Nullable List<String> permissions;
    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `["ALL"]`.
     * 
     */
    private final @Nullable String principal;

    @OutputCustomType.Constructor({"permissions","principal"})
    private DataLakeSettingsCreateTableDefaultPermission(
        @Nullable List<String> permissions,
        @Nullable String principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
    */
    public List<String> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `["ALL"]`.
     * 
    */
    public Optional<String> getPrincipal() {
        return Optional.ofNullable(this.principal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsCreateTableDefaultPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> permissions;
        private @Nullable String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsCreateTableDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPrincipal(@Nullable String principal) {
            this.principal = principal;
            return this;
        }
        public DataLakeSettingsCreateTableDefaultPermission build() {
            return new DataLakeSettingsCreateTableDefaultPermission(permissions, principal);
        }
    }
}