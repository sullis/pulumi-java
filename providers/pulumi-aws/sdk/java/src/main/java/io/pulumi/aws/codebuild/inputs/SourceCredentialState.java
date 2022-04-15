// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceCredentialState extends io.pulumi.resources.ResourceArgs {

    public static final SourceCredentialState Empty = new SourceCredentialState();

    /**
     * The ARN of Source Credential.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
     * 
     */
    @Import(name="authType")
      private final @Nullable Output<String> authType;

    public Output<String> authType() {
        return this.authType == null ? Codegen.empty() : this.authType;
    }

    /**
     * The source provider used for this project.
     * 
     */
    @Import(name="serverType")
      private final @Nullable Output<String> serverType;

    public Output<String> serverType() {
        return this.serverType == null ? Codegen.empty() : this.serverType;
    }

    /**
     * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
     * 
     */
    @Import(name="token")
      private final @Nullable Output<String> token;

    public Output<String> token() {
        return this.token == null ? Codegen.empty() : this.token;
    }

    /**
     * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public SourceCredentialState(
        @Nullable Output<String> arn,
        @Nullable Output<String> authType,
        @Nullable Output<String> serverType,
        @Nullable Output<String> token,
        @Nullable Output<String> userName) {
        this.arn = arn;
        this.authType = authType;
        this.serverType = serverType;
        this.token = token;
        this.userName = userName;
    }

    private SourceCredentialState() {
        this.arn = Codegen.empty();
        this.authType = Codegen.empty();
        this.serverType = Codegen.empty();
        this.token = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> authType;
        private @Nullable Output<String> serverType;
        private @Nullable Output<String> token;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceCredentialState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authType = defaults.authType;
    	      this.serverType = defaults.serverType;
    	      this.token = defaults.token;
    	      this.userName = defaults.userName;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder authType(@Nullable Output<String> authType) {
            this.authType = authType;
            return this;
        }
        public Builder authType(@Nullable String authType) {
            this.authType = Codegen.ofNullable(authType);
            return this;
        }
        public Builder serverType(@Nullable Output<String> serverType) {
            this.serverType = serverType;
            return this;
        }
        public Builder serverType(@Nullable String serverType) {
            this.serverType = Codegen.ofNullable(serverType);
            return this;
        }
        public Builder token(@Nullable Output<String> token) {
            this.token = token;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = Codegen.ofNullable(token);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public SourceCredentialState build() {
            return new SourceCredentialState(arn, authType, serverType, token, userName);
        }
    }
}
