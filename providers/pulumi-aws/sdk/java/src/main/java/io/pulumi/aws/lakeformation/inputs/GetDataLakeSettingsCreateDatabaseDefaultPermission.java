// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDataLakeSettingsCreateDatabaseDefaultPermission extends io.pulumi.resources.InvokeArgs {

    public static final GetDataLakeSettingsCreateDatabaseDefaultPermission Empty = new GetDataLakeSettingsCreateDatabaseDefaultPermission();

    /**
     * List of permissions granted to the principal.
     * 
     */
    @Import(name="permissions", required=true)
      private final List<String> permissions;

    public List<String> permissions() {
        return this.permissions;
    }

    /**
     * Principal who is granted permissions.
     * 
     */
    @Import(name="principal", required=true)
      private final String principal;

    public String principal() {
        return this.principal;
    }

    public GetDataLakeSettingsCreateDatabaseDefaultPermission(
        List<String> permissions,
        String principal) {
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private GetDataLakeSettingsCreateDatabaseDefaultPermission() {
        this.permissions = List.of();
        this.principal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakeSettingsCreateDatabaseDefaultPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> permissions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataLakeSettingsCreateDatabaseDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }        public GetDataLakeSettingsCreateDatabaseDefaultPermission build() {
            return new GetDataLakeSettingsCreateDatabaseDefaultPermission(permissions, principal);
        }
    }
}
