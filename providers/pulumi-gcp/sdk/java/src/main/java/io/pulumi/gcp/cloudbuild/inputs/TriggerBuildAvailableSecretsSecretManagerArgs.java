// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TriggerBuildAvailableSecretsSecretManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildAvailableSecretsSecretManagerArgs Empty = new TriggerBuildAvailableSecretsSecretManagerArgs();

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    @InputImport(name="env", required=true)
    private final Input<String> env;

    public Input<String> getEnv() {
        return this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @InputImport(name="versionName", required=true)
    private final Input<String> versionName;

    public Input<String> getVersionName() {
        return this.versionName;
    }

    public TriggerBuildAvailableSecretsSecretManagerArgs(
        Input<String> env,
        Input<String> versionName) {
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private TriggerBuildAvailableSecretsSecretManagerArgs() {
        this.env = Input.empty();
        this.versionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecretsSecretManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> env;
        private Input<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildAvailableSecretsSecretManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder setEnv(Input<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setEnv(String env) {
            this.env = Input.of(Objects.requireNonNull(env));
            return this;
        }

        public Builder setVersionName(Input<String> versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }

        public Builder setVersionName(String versionName) {
            this.versionName = Input.of(Objects.requireNonNull(versionName));
            return this;
        }

        public TriggerBuildAvailableSecretsSecretManagerArgs build() {
            return new TriggerBuildAvailableSecretsSecretManagerArgs(env, versionName);
        }
    }
}
