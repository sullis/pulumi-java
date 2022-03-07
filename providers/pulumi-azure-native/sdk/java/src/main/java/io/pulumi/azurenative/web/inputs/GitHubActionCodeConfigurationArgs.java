// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The GitHub action code configuration.
 * 
 */
public final class GitHubActionCodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitHubActionCodeConfigurationArgs Empty = new GitHubActionCodeConfigurationArgs();

    /**
     * Runtime stack is used to determine the workflow file content for code base apps.
     * 
     */
    @InputImport(name="runtimeStack")
      private final @Nullable Input<String> runtimeStack;

    public Input<String> getRuntimeStack() {
        return this.runtimeStack == null ? Input.empty() : this.runtimeStack;
    }

    /**
     * Runtime version is used to determine what build version to set in the workflow file.
     * 
     */
    @InputImport(name="runtimeVersion")
      private final @Nullable Input<String> runtimeVersion;

    public Input<String> getRuntimeVersion() {
        return this.runtimeVersion == null ? Input.empty() : this.runtimeVersion;
    }

    public GitHubActionCodeConfigurationArgs(
        @Nullable Input<String> runtimeStack,
        @Nullable Input<String> runtimeVersion) {
        this.runtimeStack = runtimeStack;
        this.runtimeVersion = runtimeVersion;
    }

    private GitHubActionCodeConfigurationArgs() {
        this.runtimeStack = Input.empty();
        this.runtimeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> runtimeStack;
        private @Nullable Input<String> runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubActionCodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runtimeStack = defaults.runtimeStack;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setRuntimeStack(@Nullable Input<String> runtimeStack) {
            this.runtimeStack = runtimeStack;
            return this;
        }

        public Builder setRuntimeStack(@Nullable String runtimeStack) {
            this.runtimeStack = Input.ofNullable(runtimeStack);
            return this;
        }

        public Builder setRuntimeVersion(@Nullable Input<String> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = Input.ofNullable(runtimeVersion);
            return this;
        }
        public GitHubActionCodeConfigurationArgs build() {
            return new GitHubActionCodeConfigurationArgs(runtimeStack, runtimeVersion);
        }
    }
}