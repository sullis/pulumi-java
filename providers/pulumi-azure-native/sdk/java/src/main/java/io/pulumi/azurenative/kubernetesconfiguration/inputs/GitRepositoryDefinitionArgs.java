// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.RepositoryRefDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters to reconcile to the GitRepository source kind type.
 * 
 */
public final class GitRepositoryDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitRepositoryDefinitionArgs Empty = new GitRepositoryDefinitionArgs();

    /**
     * Base64-encoded HTTPS certificate authority contents used to access git private git repositories over HTTPS
     * 
     */
    @InputImport(name="httpsCAFile")
      private final @Nullable Input<String> httpsCAFile;

    public Input<String> getHttpsCAFile() {
        return this.httpsCAFile == null ? Input.empty() : this.httpsCAFile;
    }

    /**
     * Base64-encoded HTTPS username used to access private git repositories over HTTPS
     * 
     */
    @InputImport(name="httpsUser")
      private final @Nullable Input<String> httpsUser;

    public Input<String> getHttpsUser() {
        return this.httpsUser == null ? Input.empty() : this.httpsUser;
    }

    /**
     * Name of a local secret on the Kubernetes cluster to use as the authentication secret rather than the managed or user-provided configuration secrets.
     * 
     */
    @InputImport(name="localAuthRef")
      private final @Nullable Input<String> localAuthRef;

    public Input<String> getLocalAuthRef() {
        return this.localAuthRef == null ? Input.empty() : this.localAuthRef;
    }

    /**
     * The source reference for the GitRepository object.
     * 
     */
    @InputImport(name="repositoryRef")
      private final @Nullable Input<RepositoryRefDefinitionArgs> repositoryRef;

    public Input<RepositoryRefDefinitionArgs> getRepositoryRef() {
        return this.repositoryRef == null ? Input.empty() : this.repositoryRef;
    }

    /**
     * Base64-encoded known_hosts value containing public SSH keys required to access private git repositories over SSH
     * 
     */
    @InputImport(name="sshKnownHosts")
      private final @Nullable Input<String> sshKnownHosts;

    public Input<String> getSshKnownHosts() {
        return this.sshKnownHosts == null ? Input.empty() : this.sshKnownHosts;
    }

    /**
     * The interval at which to re-reconcile the cluster git repository source with the remote.
     * 
     */
    @InputImport(name="syncIntervalInSeconds")
      private final @Nullable Input<Double> syncIntervalInSeconds;

    public Input<Double> getSyncIntervalInSeconds() {
        return this.syncIntervalInSeconds == null ? Input.empty() : this.syncIntervalInSeconds;
    }

    /**
     * The maximum time to attempt to reconcile the cluster git repository source with the remote.
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Input<Double> timeoutInSeconds;

    public Input<Double> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    /**
     * The URL to sync for the flux configuration git repository.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public GitRepositoryDefinitionArgs(
        @Nullable Input<String> httpsCAFile,
        @Nullable Input<String> httpsUser,
        @Nullable Input<String> localAuthRef,
        @Nullable Input<RepositoryRefDefinitionArgs> repositoryRef,
        @Nullable Input<String> sshKnownHosts,
        @Nullable Input<Double> syncIntervalInSeconds,
        @Nullable Input<Double> timeoutInSeconds,
        @Nullable Input<String> url) {
        this.httpsCAFile = httpsCAFile;
        this.httpsUser = httpsUser;
        this.localAuthRef = localAuthRef;
        this.repositoryRef = repositoryRef;
        this.sshKnownHosts = sshKnownHosts;
        this.syncIntervalInSeconds = syncIntervalInSeconds == null ? Input.ofNullable(6e+02) : syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds == null ? Input.ofNullable(6e+02) : timeoutInSeconds;
        this.url = url;
    }

    private GitRepositoryDefinitionArgs() {
        this.httpsCAFile = Input.empty();
        this.httpsUser = Input.empty();
        this.localAuthRef = Input.empty();
        this.repositoryRef = Input.empty();
        this.sshKnownHosts = Input.empty();
        this.syncIntervalInSeconds = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepositoryDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpsCAFile;
        private @Nullable Input<String> httpsUser;
        private @Nullable Input<String> localAuthRef;
        private @Nullable Input<RepositoryRefDefinitionArgs> repositoryRef;
        private @Nullable Input<String> sshKnownHosts;
        private @Nullable Input<Double> syncIntervalInSeconds;
        private @Nullable Input<Double> timeoutInSeconds;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepositoryDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpsCAFile = defaults.httpsCAFile;
    	      this.httpsUser = defaults.httpsUser;
    	      this.localAuthRef = defaults.localAuthRef;
    	      this.repositoryRef = defaults.repositoryRef;
    	      this.sshKnownHosts = defaults.sshKnownHosts;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.url = defaults.url;
        }

        public Builder setHttpsCAFile(@Nullable Input<String> httpsCAFile) {
            this.httpsCAFile = httpsCAFile;
            return this;
        }

        public Builder setHttpsCAFile(@Nullable String httpsCAFile) {
            this.httpsCAFile = Input.ofNullable(httpsCAFile);
            return this;
        }

        public Builder setHttpsUser(@Nullable Input<String> httpsUser) {
            this.httpsUser = httpsUser;
            return this;
        }

        public Builder setHttpsUser(@Nullable String httpsUser) {
            this.httpsUser = Input.ofNullable(httpsUser);
            return this;
        }

        public Builder setLocalAuthRef(@Nullable Input<String> localAuthRef) {
            this.localAuthRef = localAuthRef;
            return this;
        }

        public Builder setLocalAuthRef(@Nullable String localAuthRef) {
            this.localAuthRef = Input.ofNullable(localAuthRef);
            return this;
        }

        public Builder setRepositoryRef(@Nullable Input<RepositoryRefDefinitionArgs> repositoryRef) {
            this.repositoryRef = repositoryRef;
            return this;
        }

        public Builder setRepositoryRef(@Nullable RepositoryRefDefinitionArgs repositoryRef) {
            this.repositoryRef = Input.ofNullable(repositoryRef);
            return this;
        }

        public Builder setSshKnownHosts(@Nullable Input<String> sshKnownHosts) {
            this.sshKnownHosts = sshKnownHosts;
            return this;
        }

        public Builder setSshKnownHosts(@Nullable String sshKnownHosts) {
            this.sshKnownHosts = Input.ofNullable(sshKnownHosts);
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Input<Double> syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = Input.ofNullable(syncIntervalInSeconds);
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Input<Double> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public GitRepositoryDefinitionArgs build() {
            return new GitRepositoryDefinitionArgs(httpsCAFile, httpsUser, localAuthRef, repositoryRef, sshKnownHosts, syncIntervalInSeconds, timeoutInSeconds, url);
        }
    }
}