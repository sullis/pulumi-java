// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlActiveDirectoryConfigResponse {
    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    private final String domain;
    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    private final String kind;

    @OutputCustomType.Constructor({"domain","kind"})
    private SqlActiveDirectoryConfigResponse(
        String domain,
        String kind) {
        this.domain = Objects.requireNonNull(domain);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
    */
    public String getDomain() {
        return this.domain;
    }
    /**
     * This is always sql#activeDirectoryConfig.
     * 
    */
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlActiveDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlActiveDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.kind = defaults.kind;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public SqlActiveDirectoryConfigResponse build() {
            return new SqlActiveDirectoryConfigResponse(domain, kind);
        }
    }
}