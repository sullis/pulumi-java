// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AllowedHostPath {
    /**
     * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    private final @Nullable String pathPrefix;
    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor
    private AllowedHostPath(
        @OutputCustomType.Parameter("pathPrefix") @Nullable String pathPrefix,
        @OutputCustomType.Parameter("readOnly") @Nullable Boolean readOnly) {
        this.pathPrefix = pathPrefix;
        this.readOnly = readOnly;
    }

    /**
     * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
    */
    public Optional<String> getPathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }
    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedHostPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pathPrefix;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedHostPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setPathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public AllowedHostPath build() {
            return new AllowedHostPath(pathPrefix, readOnly);
        }
    }
}
