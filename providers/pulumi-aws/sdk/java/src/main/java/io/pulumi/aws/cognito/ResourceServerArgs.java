// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.cognito.inputs.ResourceServerScopeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceServerArgs Empty = new ResourceServerArgs();

    /**
     * An identifier for the resource server.
     * 
     */
    @InputImport(name="identifier", required=true)
      private final Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier;
    }

    /**
     * A name for the resource server.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of Authorization Scope.
     * 
     */
    @InputImport(name="scopes")
      private final @Nullable Input<List<ResourceServerScopeArgs>> scopes;

    public Input<List<ResourceServerScopeArgs>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    @InputImport(name="userPoolId", required=true)
      private final Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId;
    }

    public ResourceServerArgs(
        Input<String> identifier,
        @Nullable Input<String> name,
        @Nullable Input<List<ResourceServerScopeArgs>> scopes,
        Input<String> userPoolId) {
        this.identifier = Objects.requireNonNull(identifier, "expected parameter 'identifier' to be non-null");
        this.name = name;
        this.scopes = scopes;
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private ResourceServerArgs() {
        this.identifier = Input.empty();
        this.name = Input.empty();
        this.scopes = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> identifier;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ResourceServerScopeArgs>> scopes;
        private Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setIdentifier(Input<String> identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }

        public Builder setIdentifier(String identifier) {
            this.identifier = Input.of(Objects.requireNonNull(identifier));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<ResourceServerScopeArgs>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<ResourceServerScopeArgs> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public Builder setUserPoolId(Input<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Input.of(Objects.requireNonNull(userPoolId));
            return this;
        }
        public ResourceServerArgs build() {
            return new ResourceServerArgs(identifier, name, scopes, userPoolId);
        }
    }
}