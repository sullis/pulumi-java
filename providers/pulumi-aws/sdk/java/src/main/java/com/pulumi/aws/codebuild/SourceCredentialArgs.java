// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceCredentialArgs Empty = new SourceCredentialArgs();

    /**
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * The source provider used for this project.
     * 
     */
    @Import(name="serverType", required=true)
    private Output<String> serverType;

    /**
     * @return The source provider used for this project.
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }

    /**
     * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SourceCredentialArgs() {}

    private SourceCredentialArgs(SourceCredentialArgs $) {
        this.authType = $.authType;
        this.serverType = $.serverType;
        this.token = $.token;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceCredentialArgs $;

        public Builder() {
            $ = new SourceCredentialArgs();
        }

        public Builder(SourceCredentialArgs defaults) {
            $ = new SourceCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param serverType The source provider used for this project.
         * 
         * @return builder
         * 
         */
        public Builder serverType(Output<String> serverType) {
            $.serverType = serverType;
            return this;
        }

        /**
         * @param serverType The source provider used for this project.
         * 
         * @return builder
         * 
         */
        public Builder serverType(String serverType) {
            return serverType(Output.of(serverType));
        }

        /**
         * @param token For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param userName The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public SourceCredentialArgs build() {
            $.authType = Objects.requireNonNull($.authType, "expected parameter 'authType' to be non-null");
            $.serverType = Objects.requireNonNull($.serverType, "expected parameter 'serverType' to be non-null");
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            return $;
        }
    }

}
