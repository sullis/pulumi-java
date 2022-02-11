// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events;

import io.pulumi.awsnative.events.enums.ConnectionAuthorizationType;
import io.pulumi.awsnative.events.inputs.AuthParametersPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    @InputImport(name="authParameters", required=true)
    private final Input<AuthParametersPropertiesArgs> authParameters;

    public Input<AuthParametersPropertiesArgs> getAuthParameters() {
        return this.authParameters;
    }

    @InputImport(name="authorizationType", required=true)
    private final Input<ConnectionAuthorizationType> authorizationType;

    public Input<ConnectionAuthorizationType> getAuthorizationType() {
        return this.authorizationType;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ConnectionArgs(
        Input<AuthParametersPropertiesArgs> authParameters,
        Input<ConnectionAuthorizationType> authorizationType,
        @Nullable Input<String> description,
        @Nullable Input<String> name) {
        this.authParameters = Objects.requireNonNull(authParameters, "expected parameter 'authParameters' to be non-null");
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.description = description;
        this.name = name;
    }

    private ConnectionArgs() {
        this.authParameters = Input.empty();
        this.authorizationType = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AuthParametersPropertiesArgs> authParameters;
        private Input<ConnectionAuthorizationType> authorizationType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authParameters = defaults.authParameters;
    	      this.authorizationType = defaults.authorizationType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder setAuthParameters(Input<AuthParametersPropertiesArgs> authParameters) {
            this.authParameters = Objects.requireNonNull(authParameters);
            return this;
        }

        public Builder setAuthParameters(AuthParametersPropertiesArgs authParameters) {
            this.authParameters = Input.of(Objects.requireNonNull(authParameters));
            return this;
        }

        public Builder setAuthorizationType(Input<ConnectionAuthorizationType> authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder setAuthorizationType(ConnectionAuthorizationType authorizationType) {
            this.authorizationType = Input.of(Objects.requireNonNull(authorizationType));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public ConnectionArgs build() {
            return new ConnectionArgs(authParameters, authorizationType, description, name);
        }
    }
}
