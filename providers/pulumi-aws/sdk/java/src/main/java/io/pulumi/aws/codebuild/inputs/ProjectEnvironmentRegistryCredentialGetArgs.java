// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ProjectEnvironmentRegistryCredentialGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentRegistryCredentialGetArgs Empty = new ProjectEnvironmentRegistryCredentialGetArgs();

    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
     */
    @Import(name="credential", required=true)
      private final Output<String> credential;

    public Output<String> credential() {
        return this.credential;
    }

    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
     */
    @Import(name="credentialProvider", required=true)
      private final Output<String> credentialProvider;

    public Output<String> credentialProvider() {
        return this.credentialProvider;
    }

    public ProjectEnvironmentRegistryCredentialGetArgs(
        Output<String> credential,
        Output<String> credentialProvider) {
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.credentialProvider = Objects.requireNonNull(credentialProvider, "expected parameter 'credentialProvider' to be non-null");
    }

    private ProjectEnvironmentRegistryCredentialGetArgs() {
        this.credential = Codegen.empty();
        this.credentialProvider = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentRegistryCredentialGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> credential;
        private Output<String> credentialProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentRegistryCredentialGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.credentialProvider = defaults.credentialProvider;
        }

        public Builder credential(Output<String> credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }
        public Builder credential(String credential) {
            this.credential = Output.of(Objects.requireNonNull(credential));
            return this;
        }
        public Builder credentialProvider(Output<String> credentialProvider) {
            this.credentialProvider = Objects.requireNonNull(credentialProvider);
            return this;
        }
        public Builder credentialProvider(String credentialProvider) {
            this.credentialProvider = Output.of(Objects.requireNonNull(credentialProvider));
            return this;
        }        public ProjectEnvironmentRegistryCredentialGetArgs build() {
            return new ProjectEnvironmentRegistryCredentialGetArgs(credential, credentialProvider);
        }
    }
}
