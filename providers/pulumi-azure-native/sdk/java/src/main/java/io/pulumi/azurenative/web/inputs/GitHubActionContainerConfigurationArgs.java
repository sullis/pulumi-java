// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The GitHub action container configuration.
 * 
 */
public final class GitHubActionContainerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitHubActionContainerConfigurationArgs Empty = new GitHubActionContainerConfigurationArgs();

    /**
     * The image name for the build.
     * 
     */
    @InputImport(name="imageName")
      private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    /**
     * The password used to upload the image to the container registry.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The server URL for the container registry where the build will be hosted.
     * 
     */
    @InputImport(name="serverUrl")
      private final @Nullable Input<String> serverUrl;

    public Input<String> getServerUrl() {
        return this.serverUrl == null ? Input.empty() : this.serverUrl;
    }

    /**
     * The username used to upload the image to the container registry.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public GitHubActionContainerConfigurationArgs(
        @Nullable Input<String> imageName,
        @Nullable Input<String> password,
        @Nullable Input<String> serverUrl,
        @Nullable Input<String> username) {
        this.imageName = imageName;
        this.password = password;
        this.serverUrl = serverUrl;
        this.username = username;
    }

    private GitHubActionContainerConfigurationArgs() {
        this.imageName = Input.empty();
        this.password = Input.empty();
        this.serverUrl = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionContainerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageName;
        private @Nullable Input<String> password;
        private @Nullable Input<String> serverUrl;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubActionContainerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.password = defaults.password;
    	      this.serverUrl = defaults.serverUrl;
    	      this.username = defaults.username;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServerUrl(@Nullable Input<String> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder setServerUrl(@Nullable String serverUrl) {
            this.serverUrl = Input.ofNullable(serverUrl);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public GitHubActionContainerConfigurationArgs build() {
            return new GitHubActionContainerConfigurationArgs(imageName, password, serverUrl, username);
        }
    }
}