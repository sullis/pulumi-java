// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.outputs;

import io.pulumi.awsnative.events.enums.ConnectionAuthorizationType;
import io.pulumi.awsnative.events.outputs.AuthParametersProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionResult {
    /**
     * The arn of the connection resource.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable AuthParametersProperties authParameters;
    private final @Nullable ConnectionAuthorizationType authorizationType;
    /**
     * Description of the connection.
     * 
     */
    private final @Nullable String description;
    /**
     * The arn of the secrets manager secret created in the customer account.
     * 
     */
    private final @Nullable String secretArn;

    @OutputCustomType.Constructor({"arn","authParameters","authorizationType","description","secretArn"})
    private GetConnectionResult(
        @Nullable String arn,
        @Nullable AuthParametersProperties authParameters,
        @Nullable ConnectionAuthorizationType authorizationType,
        @Nullable String description,
        @Nullable String secretArn) {
        this.arn = arn;
        this.authParameters = authParameters;
        this.authorizationType = authorizationType;
        this.description = description;
        this.secretArn = secretArn;
    }

    /**
     * The arn of the connection resource.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<AuthParametersProperties> getAuthParameters() {
        return Optional.ofNullable(this.authParameters);
    }
    public Optional<ConnectionAuthorizationType> getAuthorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }
    /**
     * Description of the connection.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The arn of the secrets manager secret created in the customer account.
     * 
     */
    public Optional<String> getSecretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable AuthParametersProperties authParameters;
        private @Nullable ConnectionAuthorizationType authorizationType;
        private @Nullable String description;
        private @Nullable String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authParameters = defaults.authParameters;
    	      this.authorizationType = defaults.authorizationType;
    	      this.description = defaults.description;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAuthParameters(@Nullable AuthParametersProperties authParameters) {
            this.authParameters = authParameters;
            return this;
        }

        public Builder setAuthorizationType(@Nullable ConnectionAuthorizationType authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public GetConnectionResult build() {
            return new GetConnectionResult(arn, authParameters, authorizationType, description, secretArn);
        }
    }
}
