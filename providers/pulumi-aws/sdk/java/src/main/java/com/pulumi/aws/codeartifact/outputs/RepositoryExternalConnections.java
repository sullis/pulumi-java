// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryExternalConnections {
    /**
     * @return The name of the external connection associated with a repository.
     * 
     */
    private final String externalConnectionName;
    private final @Nullable String packageFormat;
    private final @Nullable String status;

    @CustomType.Constructor
    private RepositoryExternalConnections(
        @CustomType.Parameter("externalConnectionName") String externalConnectionName,
        @CustomType.Parameter("packageFormat") @Nullable String packageFormat,
        @CustomType.Parameter("status") @Nullable String status) {
        this.externalConnectionName = externalConnectionName;
        this.packageFormat = packageFormat;
        this.status = status;
    }

    /**
     * @return The name of the external connection associated with a repository.
     * 
     */
    public String externalConnectionName() {
        return this.externalConnectionName;
    }
    public Optional<String> packageFormat() {
        return Optional.ofNullable(this.packageFormat);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryExternalConnections defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalConnectionName;
        private @Nullable String packageFormat;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryExternalConnections defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalConnectionName = defaults.externalConnectionName;
    	      this.packageFormat = defaults.packageFormat;
    	      this.status = defaults.status;
        }

        public Builder externalConnectionName(String externalConnectionName) {
            this.externalConnectionName = Objects.requireNonNull(externalConnectionName);
            return this;
        }
        public Builder packageFormat(@Nullable String packageFormat) {
            this.packageFormat = packageFormat;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public RepositoryExternalConnections build() {
            return new RepositoryExternalConnections(externalConnectionName, packageFormat, status);
        }
    }
}
