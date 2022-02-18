// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.inputs;

import io.pulumi.azurenative.devops.enums.CodeRepositoryType;
import io.pulumi.azurenative.devops.inputs.AuthorizationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Repository containing the source code for a pipeline.
 * 
 */
public final class CodeRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeRepositoryArgs Empty = new CodeRepositoryArgs();

    /**
     * Authorization info to access the code repository.
     * 
     */
    @InputImport(name="authorization")
    private final @Nullable Input<AuthorizationArgs> authorization;

    public Input<AuthorizationArgs> getAuthorization() {
        return this.authorization == null ? Input.empty() : this.authorization;
    }

    /**
     * Default branch used to configure Continuous Integration (CI) in the pipeline.
     * 
     */
    @InputImport(name="defaultBranch", required=true)
    private final Input<String> defaultBranch;

    public Input<String> getDefaultBranch() {
        return this.defaultBranch;
    }

    /**
     * Unique immutable identifier of the code repository.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Repository-specific properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Type of code repository.
     * 
     */
    @InputImport(name="repositoryType", required=true)
    private final Input<Either<String,CodeRepositoryType>> repositoryType;

    public Input<Either<String,CodeRepositoryType>> getRepositoryType() {
        return this.repositoryType;
    }

    public CodeRepositoryArgs(
        @Nullable Input<AuthorizationArgs> authorization,
        Input<String> defaultBranch,
        Input<String> id,
        @Nullable Input<Map<String,String>> properties,
        Input<Either<String,CodeRepositoryType>> repositoryType) {
        this.authorization = authorization;
        this.defaultBranch = Objects.requireNonNull(defaultBranch, "expected parameter 'defaultBranch' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.properties = properties;
        this.repositoryType = Objects.requireNonNull(repositoryType, "expected parameter 'repositoryType' to be non-null");
    }

    private CodeRepositoryArgs() {
        this.authorization = Input.empty();
        this.defaultBranch = Input.empty();
        this.id = Input.empty();
        this.properties = Input.empty();
        this.repositoryType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorizationArgs> authorization;
        private Input<String> defaultBranch;
        private Input<String> id;
        private @Nullable Input<Map<String,String>> properties;
        private Input<Either<String,CodeRepositoryType>> repositoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.defaultBranch = defaults.defaultBranch;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
    	      this.repositoryType = defaults.repositoryType;
        }

        public Builder setAuthorization(@Nullable Input<AuthorizationArgs> authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder setAuthorization(@Nullable AuthorizationArgs authorization) {
            this.authorization = Input.ofNullable(authorization);
            return this;
        }

        public Builder setDefaultBranch(Input<String> defaultBranch) {
            this.defaultBranch = Objects.requireNonNull(defaultBranch);
            return this;
        }

        public Builder setDefaultBranch(String defaultBranch) {
            this.defaultBranch = Input.of(Objects.requireNonNull(defaultBranch));
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setRepositoryType(Input<Either<String,CodeRepositoryType>> repositoryType) {
            this.repositoryType = Objects.requireNonNull(repositoryType);
            return this;
        }

        public Builder setRepositoryType(Either<String,CodeRepositoryType> repositoryType) {
            this.repositoryType = Input.of(Objects.requireNonNull(repositoryType));
            return this;
        }

        public CodeRepositoryArgs build() {
            return new CodeRepositoryArgs(authorization, defaultBranch, id, properties, repositoryType);
        }
    }
}
