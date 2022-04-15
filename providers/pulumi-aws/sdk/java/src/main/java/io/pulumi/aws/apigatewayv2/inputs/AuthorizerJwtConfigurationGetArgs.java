// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerJwtConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerJwtConfigurationGetArgs Empty = new AuthorizerJwtConfigurationGetArgs();

    /**
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
     * 
     */
    @Import(name="audiences")
      private final @Nullable Output<List<String>> audiences;

    public Output<List<String>> audiences() {
        return this.audiences == null ? Codegen.empty() : this.audiences;
    }

    /**
     * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the `aws.cognito.UserPool` resource.
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer == null ? Codegen.empty() : this.issuer;
    }

    public AuthorizerJwtConfigurationGetArgs(
        @Nullable Output<List<String>> audiences,
        @Nullable Output<String> issuer) {
        this.audiences = audiences;
        this.issuer = issuer;
    }

    private AuthorizerJwtConfigurationGetArgs() {
        this.audiences = Codegen.empty();
        this.issuer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerJwtConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> audiences;
        private @Nullable Output<String> issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerJwtConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.issuer = defaults.issuer;
        }

        public Builder audiences(@Nullable Output<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = Codegen.ofNullable(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = Codegen.ofNullable(issuer);
            return this;
        }        public AuthorizerJwtConfigurationGetArgs build() {
            return new AuthorizerJwtConfigurationGetArgs(audiences, issuer);
        }
    }
}
