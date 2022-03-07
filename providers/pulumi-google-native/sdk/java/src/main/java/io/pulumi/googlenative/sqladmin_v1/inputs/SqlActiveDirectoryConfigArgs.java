// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
 * 
 */
public final class SqlActiveDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlActiveDirectoryConfigArgs Empty = new SqlActiveDirectoryConfigArgs();

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    @InputImport(name="domain")
      private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public SqlActiveDirectoryConfigArgs(
        @Nullable Input<String> domain,
        @Nullable Input<String> kind) {
        this.domain = domain;
        this.kind = kind;
    }

    private SqlActiveDirectoryConfigArgs() {
        this.domain = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlActiveDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domain;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlActiveDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.kind = defaults.kind;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public SqlActiveDirectoryConfigArgs build() {
            return new SqlActiveDirectoryConfigArgs(domain, kind);
        }
    }
}